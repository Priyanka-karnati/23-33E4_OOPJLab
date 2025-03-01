interface Bird
{
  void eat();
  void fly();
}
class parrot implements Bird
{
  public void eat()
  {
    System.out.println("parrot eats");
  }
  public void fly()
  {
    System.out.println("parrot fly  quickly");
  }
}
class peacock implements Bird
{
 public void eat()
  {
    System.out.println("peacock eats");
  }
  public void fly()
  {
    System.out.println("peacock fly rarely");
  }
}
class II
{
  public static void main(String args[])
  {
	Bird m1 = new parrot();
	m1.eat();
	m1.fly();
	Bird m2 = new peacock();
	m2.eat();
	m2.fly();
        System.out.println("Multiple Inheritance is achieved");
  }
}


OUTPUT:
parrot eats
parrot fly  quickly
peacock eats
peacock fly rarely
Multiple Inheritance is achieved