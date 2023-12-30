// prime1
import java.lang.*;
import java.util.Scanner;

public class prime1
{
	public static void main(String args[])
	{
		int m, n, i, j, f=0, s=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the upper limit :");
		m = in.nextInt();
		System.out.println("enter the lower limit :");
		n = in.nextInt();
		//int f=0;
		for (i=m;i<=n;i++)
		{
		  for( j=1;j<=i;j++)
		  {
			  if(i%j == 0)
			  {
				  f++;
 		      }
		  }	  
		  if (f == 2)
		  {
			System.out.println(i +  "is a prime no.");   
		  }
		  f = 0;
		  /*else
		  {
			  System.out.println(i +"is not a prime no.");
		  }*/
		}
	}
}