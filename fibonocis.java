package Start.src;
import com.sun.jdi.connect.Connector;

import java.util.Scanner;
public class fibonocis
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int f = in.nextInt();
        int a=-1,b=1,c;
        for(int i=1;i<=f;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }

}
