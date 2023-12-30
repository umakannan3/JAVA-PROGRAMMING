// 02.reverse the no:
import java.lang.*;
import java.util.Scanner;
public class reverse
{
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the no : ");
	int n = in.nextInt();
	int rever = 0, rem;
    while(n!=0)
	{
		rem = n%10;
		rever = (rever*10)+rem;
		n = n/10;
	}
	System.out.println("the reverse no is : " +rever);
}
}