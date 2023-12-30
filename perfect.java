// perfect no:
import java.lang.*;
import java.util.Scanner;

public class perfect
{
	public static void main(String args[])
	{
		int n, n1, r, i, sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no: ");
		n = in.nextInt();
		n1 = n;
		for(i=1;i<n;i++)
		{
			if(n%i == 0)
			{
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
	  if(sum == n1)
		{
		System.out.println(n1+  "is a strong no.");
		}
			else
			{
				System.out.println(n1  +  "is not a strong no.");
			}
			
	}
}
