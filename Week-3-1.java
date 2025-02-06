class Conover
{
    Conover()
    {
        System.out.println(" Empty Constructor ");
    }
     Conover(int a)
    {
        System.out.println("a value is :"+a);
    }
     Conover(int a,int b)
    {
        System.out.println(" a value is"+a+" b value is: "+b);
    }
}

class Main {
    public static void main(String[] args) {
       Conover ob1=new Conover();
       Conover ob2=new Conover(5);
       Conover ob3=new Conover(2,5);
    }
}


OUTPUT:
Empty Constructor 
a value is :5
 a value is :2 b value is: 5