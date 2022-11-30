import java.io.*;
import java.util.Scanner;

class Sum_Of_Indi
{
	static int GetSum(int n)
	{
		int sum = 0;
		
		while(n!=0)
		{
			sum = sum + n % 10;
			n = n /10;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		int n = 123;
	
		System.out.println("Sum = " + GetSum(n) );
	}
	
	
}
