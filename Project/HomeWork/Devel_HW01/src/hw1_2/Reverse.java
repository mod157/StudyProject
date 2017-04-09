package hw1_2;

import java.util.Scanner;

public class Reverse {
	String word;

	Reverse(String Word) {
		word = Word;
	}
	
	public void doit() {
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}
	}
}
