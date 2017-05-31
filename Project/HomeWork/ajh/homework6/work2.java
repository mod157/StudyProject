package work1;

public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 2;
		int start = 2;
		int back=1;
		int max=0;
		
		while(max<=4000000)
		{
			max =start+back;
			back = start;
			if(max%2==0) sum +=max;
			start=max;
			
		}
		System.out.println(sum);
	}

}
