import java.util.Scanner;
public class oddeven
{
    public static void main(String args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n   = in.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter the a["+i+"] value :");
            a[i] = in.nextInt();
        }
    }
}
