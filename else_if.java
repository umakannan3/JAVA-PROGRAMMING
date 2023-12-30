package Start.src;
import java.util.Scanner;
public class else_if
{
    public static void main(String args[])
    {
        float avg;
        System.out.println("Enter ur average:");
        Scanner in =new Scanner(System.in);
        avg = in.nextFloat();
        if(avg>=90 && avg<=100)
        {
            System.out.println(" u r in Grade A");
        }
        else if(avg>=80 && avg<=89)
        {
            System.out.println(" u r in Grade B");
        }
        else if (avg>=70 && avg<=79)
        {
            System.out.println(" u r in Grade C");
        }
        else
        {
            System.out.println(" u r in Grade D");
        }
    }
}
