package Start.src;
import java.util.Scanner;
public class dowhile
{
    public static void main(String args[])
    {
        System.out.println("Enter the limit: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 2;
        do
        {
        System.out.println(i);
        i=i+2;
        }while(i<=n);
    }
}
