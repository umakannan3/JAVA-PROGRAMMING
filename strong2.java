// strong no
import java.lang.*;
import java.util.Scanner;

public class strong2
{
	public static void main(String args[])
	{
		int n, n1, i, r, s=0, f;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no : ");
		n = in.nextInt();
		n1 = n;
		while(n>0)
		{
			r = n%10;
			System.out.println(r);
			f = 1;
			for(i=1;i<=r;i++)
			{
				f = f*i;
			}
			System.out.println("factorial of " +r+ "is" +f);
			s = s+f;
			n = n/10;
		}
		System.out.println("sum = " +s);
		System.out.println("original=" +n1);
		if (s == n1)
		{
			System.out.println(n1 +     "is a strong no.");
		}
		else
		{
			System.out.println(n1 +    "is not a strong no.");
		}
	}	
}