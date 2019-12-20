import java.util.Scanner;
class Divide extends Exception {
public Divide(String str) {
	 System.out.println(str);
}
}
public class DivideNumber {
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print(" Enter the 2 numbers ");
  long a = s.nextLong();
  long b = s.nextLong();
  long c=a/b;
  try {
   if(c==0) 
    throw new  Divide("DivideByZeroException caught ");
   else
    System.out.println("The quotient of"+a+"/"+b+ "="+c);
  }
  catch ( Divide a1) {
   System.out.println(a1);
  }
  finally
  {
	 System.out.println("Inside finally block "); 
  }
}
} 

