class method
{
  void display()
  {
    System.out.println(" Superclass");
  }
}
class  simple extends method
{
  void display()
  {
    System.out.println(" Subclass");
  }
}
class RTP
{
  public static void main(String args[])
   {
     ride r = new ride();
     r.display();
   }
}


OUTPUT:
Subclass