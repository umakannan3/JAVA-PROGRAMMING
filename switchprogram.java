package Start.src;
import java.util.Scanner;
public class switchprogram
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int c;
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("Enter ur choice : ");
        int ch=in.nextInt();
        System.out.println("Enter the value of a =");
        int a = in.nextInt();
        System.out.println("Enter the value of b =");
        int b = in.nextInt();
        switch (ch)
        {
            case 1:
                c = a+b;
                System.out.println("addition ans is = " +c);
                break;

            case 2:
                c = a-b;
                System.out.println("subtraction ans is = " +c);
                break;

            case 3:
                c = a*b;
                System.out.println("multiplication ans is = " +c);
                break;

            case 4:
                c = a/b;
                System.out.println("division ans is = " +c);
                break;

            default:
                System.out.println("invalid selection");
                break;
        }


    }
}
