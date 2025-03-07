public class BIExample
{
 public static void main(String args[])
 {
   try
   {
     int num=42/0;
     System.out.println("Result : "+num);
   }
   catch(ArithmeticException e)
   {
     System.out.println("Caught ArithmeticException : "+e.getMessage());
   }
   try
   {
     int []numbers={1,2,3};
     System.out.println(numbers[5]);
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
     System.out.println("Caught ArrayIndexOutOfBoundsException : "+e.getMessage());
   }
   try
   {
     String txt=null;
     System.out.println(txt.length());
   }
   catch(NullPointerException e)
   {
     System.out.println("Caught NullPointerException : "+e.getMessage());
   }
   System.out.println("The program continues after exception handling");
 }
}