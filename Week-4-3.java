abstract class shape
{
  abstract void area();
}
class Square extends shape
{
  int side;
  square()
  {
    side=20;
  }
  void area()
  {
    System.out.println(" Area of square is : "+(side*side));
  }
}

class Rectangle extends shape
{
  int length,breadth;
  rectangle()
  {
    length=10;
    breadth=20;
  }
  void area()
  {
    System.out.println(" Area of rectangle is : "+(length*breadth));
  }
}
class AbstractExample
{
  public static void main(String args[])
  {
    Square s=new Square();
    s.area();
    Rectangle r=new rectangle();
    r.area();
  }
}

OUTPUT:
Area of square is : 400
Area of rectangle is :200