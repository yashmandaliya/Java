import java.io.*;
import java.util.Scanner;

class Prime_Number
{
	public static void main(String[] args)
	{
		int i=2;
		
		Scanner n = new Scanner(System.in);
		
		String m = n.next();
		
		int no=Integer.parseInt(m);
		
		
		if(no % i == 0)
		{
			System.out.println("Prime Number !!");
		}		
		if(no % i != 0)
		{
			System.out.println("Not Prime Number !!");
			
		}
		
	}
}