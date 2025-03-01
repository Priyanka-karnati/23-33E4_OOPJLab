class Base
{
  int p;
}
class Mul extends Base
{
 int q;
}
class prod extenda Mul
{
 int r;
 prod()
 {
   p=8;
   q=4;
   r=16;
 }
 void sol()
 {
   System.out.println(" Product of p,q,r is : "+(p*q*r));
 }
}
class  TLInheritance
{
  public static void main(String args[])
  {
    prod obj=new prod();
    obj.sol();
  }
}

OUTPUT:Product of p,q,r is : 512