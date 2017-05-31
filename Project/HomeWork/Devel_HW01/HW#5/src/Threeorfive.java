public class Threeorfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sub=0;
		
		for(int i=1;i<1000;i++) {
			if(i % 3 == 0) { sub += i; }
			if(i % 5 == 0) { sub += i; }
			if(i % 15 == 0) { sub -= i; }
		}
		System.out.print(sub);
	}
}
