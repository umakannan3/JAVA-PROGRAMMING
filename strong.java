// to find the strong no
import java.lang.*;
import java.util.Scanner;
public class strong
{
	public static void main (String args[])
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = in.nextInt();
		int num , sum, rem, fact, i;
		num = n; sum = 0; 
		while(n>0)
		{
			rem = n%10;
			fact = 1;
			for(i=1;i<=rem;i++)
			{
				fact = fact*i;
			}
			sum+=fact;
			n=n/10;
		}
			if (sum==num)
			{ 
		       System.out.println("the no " + num + "is strong no.");
			}
			else
			{
			System.out.println("the no "+ num + "is not strong");
			}
		
	}
}