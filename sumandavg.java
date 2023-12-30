// sum and average
import java.lang.*;
import java.util.Scanner;
public class sumandavg
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n = in.nextInt();
		int sum = 0, avg;
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter the  "  + i + "  value:" );
			int a = in.nextInt();
			sum =sum+a;
		}
		System.out.println("sum of the all nos: "+sum);
		System.out.println("avg of all no: " +(sum/n));
	}
}