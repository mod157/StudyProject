import java.util.*;

class reverse{
	public String rev_insert(String R)
	{
		return (new StringBuffer(R)).reverse().toString();		
	}
}
public class Revse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		reverse rev = new reverse();
		
		System.out.println("���ϴ� ���ڿ��� �Է��ϼ���");
		
		System.out.println(rev.rev_insert(scan.nextLine()));
	}

}
