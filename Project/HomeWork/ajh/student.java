import java.util.Scanner;

class sts{
	String name;
}
class std_class extends sts{
	
	int gnum = 0;
	int grade= 0;
	int score = 0;
	
	public std_class(){

		gnum = 0;
		grade= 0;
		score = 0;
		
	}
	
	public void st_input(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정보입력(이름)");
		name = scan.nextLine();
		
		System.out.println("정보입력(학번)");
		gnum = scan.nextInt();
		
		System.out.println("정보입력(학년)");
		grade = scan.nextInt();
		
		System.out.println("정보입력(점수)");
		score = scan.nextInt();
		
		
	}
	public void st_print(){
		System.out.println(name +": 학번(" + gnum +") 학년(" + grade +") 점수(" + score +")");
	}
}
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		std_class st = new std_class();
		
		st.st_input();
		st.st_print();
	}

}

