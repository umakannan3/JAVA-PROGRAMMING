package Start.src;
import java.lang.*;
import java.util.Scanner;
public class gettinginputs

    {
        public static void main(String args[])
        {
            Scanner in=new Scanner(System.in);
            int a,b,c;
            a = in.nextInt();
            b = in.nextInt();
            c = (a*a)+(b*b);
            System.out.println("the result is ="+c);
        }
    }

