//  how to find strong no:
import java.lang.*;
import java.util.Scanner;

public class strong1
{
	public static void main(String args[])
	{
		int num, originalNum, rem, i, fact, sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = in.nextInt();
		originalNum = num;
		while(num>0)
		{
			rem = num%10;
			fact=1;
			for(i=1;i<=rem;i++)
			{
				fact*=i;
			}
			sum+= fact;
			num = num/10;
		}
		if (sum == originalNum)
		{
			System.out.println(originalNum + "  is a strong no ");
		}
		else
		{
			System.out.println(originalNum  + "  is not a strong no ");
		}
	}	
} 