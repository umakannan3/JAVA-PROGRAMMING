// 05 type casting in java

/* 
   Widening Casting:
      Byte -> short -> char -> int -> long -> float -> double
   Narrowing Casting:
      double -> float -> long -> int -> char -> short -> Byte
*/

 import java.lang.*;
  
  class casting
  {
	  public static void main(String args[])
	  {
		  int a = 3;
		  double b = a, f=78.7587;
		  long c = a;
		  char d = 'a';
		  int h = (int)f;
		  
		  System.out.println("   int a ="+a);
		  System.out.println("double a ="+b);
		  System.out.println("  long a ="+c);
		  System.out.println("  char a ="+d);
          System.out.println(" double  ="+f);
		  System.out.println("     int ="+h);
	  }
  }