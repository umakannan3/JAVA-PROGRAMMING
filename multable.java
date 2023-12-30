// 03. multiplication table
import java.lang.*;
import java.util.Scanner;
public class multable
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("MULTIPLICATION TABLE");
		System.out.println("************** *****");
		System.out.println("Enter the table no : ");
		int n = in.nextInt();
		for(int i=1;i<=100;i++)
		{
			System.out.println(n +  "*"  +i+  "="  +(i*n));
		}
	}
}