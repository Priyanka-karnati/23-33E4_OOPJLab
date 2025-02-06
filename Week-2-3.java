class Constructor
{
    int a,b;
    Constructor()
    {
        a=26;
        b=10;
    }
    public void display()
    {
        System.out.println("a value is :"+a+"b value is : "+b);
    }
    
}

class Main {
    public static void main(String[] args) {
       Constructor a=new Constructor();
       a.display();
    }
}



OUTPUT:
a value is :26b  value is : 10 