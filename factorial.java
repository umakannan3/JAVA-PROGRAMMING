//practicing programmes - 01 factorial
import java.lang.*;
import java.util.Scanner;
public class factorial
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = in.nextInt();
		int f = 1;
		for(int i=1;i<=n;i++)
		{
			f = f*i;
		}
		System.out.println("the factorial of " +  n  + "is :" +f);
	}
}