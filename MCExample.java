public class MCExample
{
 public static void main(String args[])
 {
   try
   {
     int[] numbers={10,20,30};
     int result=numbers[5];
     System.out.println("Result : "+result);
   }
   catch(ArithmeticException e)
   {
     System.out.println("Caught ArithmeticException : "+e.getMessage());
   }
    catch(ArrayIndexOutOfBoundsException e)
   {
     System.out.println("Caught ArrayIndexOutOfBoundsException : "+e.getMessage());
   }
   
   System.out.println("The program continues after exception handling");
 }
}