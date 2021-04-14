package DesignPatterns;

class SingletonExample
{
    private static SingletonExample single_instance=null;
  
    public String s;
  
    private SingletonExample()
    {
        s = "foo!";
    }
  
    public static SingletonExample Singleton()
    {
        if (single_instance == null)
        {
            single_instance = new SingletonExample();
        }
        return single_instance;
    }
}
  
public class Main
{
    public static void main(String args[])
    {
        SingletonExample x = SingletonExample.Singleton();
  
        SingletonExample y = SingletonExample.Singleton();
  
        SingletonExample z = SingletonExample.Singleton();
  
        x.s = (x.s).toUpperCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
  
        z.s = (z.s).toLowerCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}