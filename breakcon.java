package Start.src;

public class breakcon
{
    public static void main(String args[])
    {
        int i;
        for  ( i=1;i<=10;i++) {
            if (i==2)
                continue;
            System.out.println(i);
            if (i == 8)
                break;
        }
    }




}
