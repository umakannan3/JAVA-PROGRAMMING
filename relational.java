// Relational operators

/*  operator          name                                 Examples
      ==             equal to                                a==b
      !=            not equal to                             a!=b
      >             greater than                             a>b
      <             less than                                a<b
      >=            greater than or equals to                a>=b
      <=            less than or equals to                   a<=b
 */
public class relational

{
    public static void main(String args[])
    {
        int a=24, b=55;
        if (a>b)
            System.out.println("a is greater");
        else
            System.out.println("b is greater");
        System.out.println("a equals to b:"+(a==b));
        System.out.println("a not equals to b:"+(a!=b));
        System.out.println("a greater than b:"+(a>b));
        System.out.println("a less than b:"+(a<b));
        System.out.println("a less than or equal to b:"+(a<=b));
        System.out.println("a greater than or equals to b:"+(a>=b));
    }
}
