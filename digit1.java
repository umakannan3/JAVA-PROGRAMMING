import java.lang.*;
import java.util.Scanner;

public class digit1
{
    public static void main(String args[])
    {
        int n,i,r;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no : ");
        n = in.nextInt();
        while(n!=0)
        {
            r = n%10;
            System.out.println(r);
            n = n/10;
        }
    }
}
