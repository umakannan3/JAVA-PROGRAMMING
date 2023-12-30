//calculator
import java.lang.*;
import java.util.Scanner;

public class calculator
{
	public static void main(String args[])
	{
		int n, i, a, b, ch;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Symbol which action u want ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println("1.+ for Addition");
		System.out.println("2.- for Sepration");
		System.out.println("3.* for multiplication");
		System.out.println("4./ for division");
		System.out.println("Enter your choice :");
		ch = in.nextInt();
		System.out.println("Enter the 1st no : ");
		a = in.nextInt();
		System.out.println("Enter the 2nd no : ");
		b = in.nextInt();
		switch (ch)
		{
			case 1:
				n = a+b;
				System.out.println("the ans is :" +n);
				break;
			case 2:	
				n = a-b;
				System.out.println("the ans is :" +n);
				break;
			case 3:
				n = a*b;
				System.out.println("the ans is :" +n);
				break;	
			case 4:
		 		n = a/b;
				System.out.println("the ans is :" +n);
				break;
			default:
				System.out.println("invalid selection :");
				break;
			
			
		}
	}
}