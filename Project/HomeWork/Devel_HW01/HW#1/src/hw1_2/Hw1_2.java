package hw1_2;

import java.util.Scanner;

import hw1_1.Info;

public class Hw1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word;
		Scanner scan = new Scanner(System.in);
		System.out.print("아무 말이나 좀 해봐 : ");
		word = scan.nextLine();

		Reverse re = new Reverse(word);
		re.doit();
	}
}
