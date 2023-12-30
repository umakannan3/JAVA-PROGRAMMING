package Start.src;
import java.util.Scanner;
// enter the programme to find sum & avg of n nos
public class sumavg {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the limit : ");
        int n= in.nextInt();
        int sum=0,a;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the " +i+ "value : " );
            a = in.nextInt();
            sum+=a;
        }
        System.out.println("The Sum of given nos " +sum);
        System.out.println("The Average of given nos " +sum/n);
    }
}
