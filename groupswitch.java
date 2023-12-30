package Start.src;
import java.util.Scanner;
public class groupswitch
{
    public static void main(String args[])
    {
       char c;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the letter : ");
       c = in.next().charAt(0);
       switch (c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println( c +" is a vowel ");
                break;
            default:
                System.out.println( c + "  is not a vowel letter");
                //break;

        }
    }
}
