package pattern;

abstract class Head {
    abstract public void display();
}

class CircleHead extends Head {
    public void display() {
          System.out.println("둥근 타입의 머리를 가졌습니다.");
    }
}

abstract class Leg {
    abstract public void display();
}

class WheelLeg extends Leg {
    public void display() {
          System.out.println("바퀴 타입의 다리를 가졌습니다.");
    }
}

abstract class Body {
    abstract public void display();
}

class LCDBody extends Body {
    public void display() {
          System.out.println("몸통에는 LCD 화면을 가지고 있습니다.");
    }
}

abstract class Arm {
    abstract public void display();
}

class FingerArm extends Arm {
    public void display() {
          System.out.println("손가락 팔을 가지고 있습니다.");
    }
}

class Robot {
    private Head head;
    private Body body;
    private Leg leg;
    private Arm arm;
   
    public void addHead(Head head) {
          this.head = head;
    }
    public void addBody(Body body) {
          this.body = body;
    }
    public void addLeg(Leg leg) {
          this.leg = leg;
    }
    public void addArm(Arm arm) {
          this.arm = arm;
    }
    public void displayRobot() {
          System.out.println("완성된 로봇은 다음과 같은 기능을 가지고 있습니다.");
          head.display();
          body.display();
          leg.display();
          arm.display();
    }
}

abstract class RobotFactory {
    abstract public Head createHead();
    abstract public Body createBody();
    abstract public Leg createLeg();
    abstract public Arm createArm();
}

class HomeRobotFactory extends RobotFactory {
    public Head createHead() {
          return new CircleHead();
    }
    public Body createBody() {
          return new LCDBody();
    }
    public Leg createLeg() {
          return new WheelLeg();
    }
    public Arm createArm() {
          return new FingerArm();
    }
}

public class AbstractFactory {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot homeRobot = new Robot();
		RobotFactory homeFactory = new HomeRobotFactory();
        homeRobot.addHead(homeFactory.createHead());
        homeRobot.addBody(homeFactory.createBody());
        homeRobot.addLeg(homeFactory.createLeg());
        homeRobot.addArm(homeFactory.createArm());
       
        homeRobot.displayRobot();

	}

}
