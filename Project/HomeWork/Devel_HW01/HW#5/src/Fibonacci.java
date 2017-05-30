public class Fibonacci {

	public static void main(String[] args) {

		int x = 0;
		int y = 1;
		int num=0;
		
		int[] numarr;
		numarr =  new int[32];
		int sum = 0;
		
		for(int i=0;i<32;i++) {
			num = x+y;
			x = y;
			y = num;
			
			numarr[i] = num;

			if(numarr[i] %2 == 0) {
				sum += numarr[i];
			}
		}
		System.out.print(sum);
	}
}
