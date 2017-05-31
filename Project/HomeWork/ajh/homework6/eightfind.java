package eight2;
import java.util.*;
import java.*;
import java.lang.*;

public class eightfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int cnt = 0;
		
		for(int i =1; i<10000;i++)
		{
			s = new String(Integer.toString(i));
			for(int j=0;j<s.length();j++)
			{
				if(s.substring(j, j+1).equals("8")) cnt++; 
			}	
		}
		System.out.println(cnt);
	}
}
