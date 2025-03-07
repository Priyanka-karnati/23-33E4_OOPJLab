public class ExcepExample
{
    
    public static void main(String[] args) 
    {
       try
       {
            int num=10/0;
            System.out.println("Result: " + num);
       } 
       catch (ArithmeticException e) 
       {
            System.out.println("exception caught :"+e.getMessage());
       } 
       finally 
       {
            System.out.println("Execution completed.");
       }
    
    System.out.println("Program continous after exception handling");
    }
}
