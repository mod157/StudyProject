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
		
		System.out.println("�����Է�(�̸�)");
		name = scan.nextLine();
		
		System.out.println("�����Է�(�й�)");
		gnum = scan.nextInt();
		
		System.out.println("�����Է�(�г�)");
		grade = scan.nextInt();
		
		System.out.println("�����Է�(����)");
		score = scan.nextInt();
		
		
	}
	public void st_print(){
		System.out.println(name +": �й�(" + gnum +") �г�(" + grade +") ����(" + score +")");
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

