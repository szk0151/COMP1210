/**
 *  Zero1.java        
 *  Demonstrates an uncaught exception.
 */
public class Zero 
{
   /**
    *   Divides by zero to produce an ArithmeticException.
    */
   public static void main(String[] args)
   {
      int numerator = 10;
      int denominator = 1;
      try {
         System.out.println(numerator / denominator); // divide by zero
         System.out.println("Program completing normally."); // won't get to here
      }
      catch(ArithmeticException e) {
         System.out.println(e + " thrown and caught!");
      }
   }
}
