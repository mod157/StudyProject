import java.util.StringTokenizer;

public class Count8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number;
		int count = 0;
		
		for(int i=1;i<10000;i++) {
			
			number = Integer.toString(i);
			
			//�� �ڸ��� �ϋ�
			if(i<10) {
				if(number.substring(0,1).equals("8")) {
					count++;
				}
			}
			
			//�� �ڸ��� �϶�
			if(i>=10 && i<100) {
				if(number.substring(0,1).equals("8")) {
					count++;
				}
				if(number.substring(1,2).equals("8")) {
					count++;
				}
			}
			
			//�� �ڸ��� �ϋ�
			if(i>=100 && i<1000) {
				if(number.substring(0,1).equals("8")) {
					count++;
				}
				if(number.substring(1,2).equals("8")) {
					count++;
				}
				if(number.substring(2,3).equals("8")) {
					count++;
				}
			}
			
			//�� �ڸ��� �϶�
			if(i>=1000 && i<10000) {
				if(number.substring(0,1).equals("8")) {
					count++;
				}
				if(number.substring(1,2).equals("8")) {
					count++;
				}
				if(number.substring(2,3).equals("8")) {
					count++;
				}
				if(number.substring(3,4).equals("8")) {
					count++;
				}
			}	
		}		
		System.out.print(count);
	}
}
