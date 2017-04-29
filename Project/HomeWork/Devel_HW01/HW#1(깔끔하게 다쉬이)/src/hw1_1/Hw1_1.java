package hw1_1;
import java.util.Scanner;

public class Hw1_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info[] info = new Info[6];
		Scanner scan = new Scanner(System.in);
		
		String name;
		int id,grade,k_score,e_score,m_score;
		
		for(int i=1;i<4;i++) {
			System.out.print(i+" 번 학생의 이름 : ");
			name = scan.next();
			System.out.print("학번 : ");
			id = scan.nextInt();
			System.out.print("학년 : ");
			grade = scan.nextInt();
			System.out.print("국어성적 : ");
			k_score = scan.nextInt();
			System.out.print("영어성적 : ");
			e_score = scan.nextInt();
			System.out.print("수학성적 : ");
			m_score = scan.nextInt();
			
			info[i] = new Info(name,id,grade,k_score,e_score,m_score);
		}
		
		for(int i=1;i<4;i++) {
			System.out.println(i+"번 학생의 이름 : "+info[i].getName()+" 학번 : "+info[i].getID()
					+" 학년 : "+info[i].getGrade()+" 누적성적 : "+info[i].total_score());
		}
	}
}

