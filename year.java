package Start.src;
import java.util.Scanner;
public class year
{
    public static void main(String args[])
    {
        int y;
        System.out.println("Enter the year :");
        Scanner in = new Scanner(System.in);
        y = in.nextInt();
        if (y % 4 == 0 || ( y % 100 == 0 && y % 400 == 0))
        {
            System.out.println("year" + y +"is the leap year");
        }
        else
        {
            System.out.println("year" + y +"is not the leap year");
        }
    }
}
