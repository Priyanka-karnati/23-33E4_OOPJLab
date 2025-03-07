public class ExceptionExample
{
 public static void main(String args[])
 {
   try
   {
     int num=10/0;
     System.out.println("Result : "+num);
   }
   catch(ArithmeticException e)
   {
     System.out.println("Caught ArithmeticException : "+e.getMessage());
   }
   finally
   {
     System.out.println ("Program will execute");
   }
   System.out.println("The program continues after exception handling");
 }
}