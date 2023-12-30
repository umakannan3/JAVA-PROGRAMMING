package Start.src;
import java.lang.*;
import java.util.Scanner;
public class calculate
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c,d;

        System.out.println("Enter the mark1:");
        a=in.nextInt();
        System.out.println("Enter the mark2:");
        b=in.nextInt();
        System.out.println("Enter the mark3:");
        c=in.nextInt();
        d=a+b+c;
        System.out.println("total is =: "+d);
    }
}
