package pattern;

abstract class Head {
    abstract public void display();
}

class CircleHead extends Head {
    public void display() {
          System.out.println("�ձ� Ÿ���� �Ӹ��� �������ϴ�.");
    }
}

abstract class Leg {
    abstract public void display();
}

class WheelLeg extends Leg {
    public void display() {
          System.out.println("���� Ÿ���� �ٸ��� �������ϴ�.");
    }
}

abstract class Body {
    abstract public void display();
}

class LCDBody extends Body {
    public void display() {
          System.out.println("���뿡�� LCD ȭ���� ������ �ֽ��ϴ�.");
    }
}

abstract class Arm {
    abstract public void display();
}

class FingerArm extends Arm {
    public void display() {
          System.out.println("�հ��� ���� ������ �ֽ��ϴ�.");
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
          System.out.println("�ϼ��� �κ��� ������ ���� ����� ������ �ֽ��ϴ�.");
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
