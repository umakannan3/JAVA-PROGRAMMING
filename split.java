// no spliting
import java.lang.*;
import java.util.Scanner;
public class split
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = in.nextInt();
		int a;
		while(n>0)
		{
			a = n%10;
			System.out.println(a);
			n = n/10;
			
		}
	}
}