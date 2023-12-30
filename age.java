package Start.src;

import java.lang.*;
import java.util.Scanner;
public class age
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Enter ur age:");
        a = in.nextInt();
        if (a >= 18)
        {
            System.out.println("u r eligible for vote");
        }
        else
        {
            System.out.println("u r not eligible for vote");
        }
    }
}

