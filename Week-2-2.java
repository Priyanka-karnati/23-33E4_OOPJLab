class Met
{
    void sum(int a,int b)
    {
        System.out.println("Sum is "+(a+b));
    }
      void sum(int a,int b,int c)
    {
        System.out.println("Sum is "+(a+b+c));
    }
      void sum(double a,double b)
    {
        System.out.println("Sum is "+(a+b));
    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        Met obj=new Met();
        obj.sum(1,2);
        obj.sum(1,2,3);
        obj.sum(1.0,3.0);
    }
}

OUTPUT :
Sum is 3
Sum is 6
Sum is 4.0


