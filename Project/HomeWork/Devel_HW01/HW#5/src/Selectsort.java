import java.util.Scanner;

public class Selectsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	
		System.out.println("몇개 입력할 꺼니?");
		int number = scan.nextInt();
		
		int[] num;
		int[] smallnum;
		int quiz;
		num = new int[number];
		smallnum = new int[number];
		
		for(int i=0; i<number; i++) {
			num[i] = scan.nextInt();
		}
		
		for(int x=0;x<=number;x++) {
			for(int y=x;y<number;y++) {
				if(num[y] <= num[x]) {
					smallnum[x] = num[y];
					num[y] = num[x];
					num[x] = smallnum[x];
				}
				else
					smallnum[x] = num[x];
			}
		}
		
		for(int i=0;i<number;i++) {
			System.out.println(smallnum[i]);
		}
	}
}
