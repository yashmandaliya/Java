import java.io.*;
import java.util.Scanner;

public class Arithmatic_Operator 
{
        public static void main(String[] args)
        {
               // Enter First Value Using Scanner
               System.out.println("Enter First No:");
               Scanner a = new Scanner(System.in);
               String b = a.next();
               int c = Integer.parseInt(b);
               
               //Enter Second Value Using Scanner
               System.out.println("Enter Second No:");
               Scanner d = new Scanner(System.in);
               String e = d.next();
               int f = Integer.parseInt(e); 
               
               int add = c + f;
               System.out.println("Addition :" + add);
               
               int sub = c-f;
               System.out.println("Subtraction :" + sub);
               
               int mul = c*f;
               System.out.println("Multiplication :" + mul);
               
               int div = c/f;        
               System.out.println("Division :" + div);
               
               int mod = c%f; 
               System.out.println("Moduals :" + mod);
               
               
               
        }
}
