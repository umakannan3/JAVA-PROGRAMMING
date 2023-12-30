// prime
import java.lang.*;
import java.util.Scanner;

public class prime
{
	public static void main(String args[])
	{
		int n, f=0, i;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no : ");
		n = in.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i == 0)
			{
				f++;
			}
		}	
			if(f == 2)
			{
				System.out.println(n +  "  is a prime no.");
			}
			else
			{
				System.out.println(n +  "   is not a prime no.");
			}
		
	}
}