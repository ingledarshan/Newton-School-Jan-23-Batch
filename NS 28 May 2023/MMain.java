// Access Modifiers Java Example
class MyClass
{
    public int publicVar;
    private int privateVar;
    protected int protectedVar;
    int defaultVar;

    public MyClass()
    {
        publicVar = 10;
        privateVar = 20;
        protectedVar = 30;
        defaultVar = 40;
    }

    public void publicMethod()
    {
        System.out.println("This is a public method.");
    }

    private void privateMethod()
    {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod()
    {
        System.out.println("This is a protected method.");
    }

    void defaultMethod()
    {
        System.out.println("This is a default method.");
    }
}

public class MMain
{
    public static void main(String args[])
    {
        MyClass myObject = new MyClass();
        System.out.println("Public variable: "+myObject.publicVar);
        // System.out.println("Private variable: "+myObject.privateVar); // compilation error
        System.out.println("Protected variable: "+myObject.protectedVar);
        System.out.println("Default variable: "+myObject.defaultVar);
        myObject.publicMethod();
        // myObject.privateMethod(); // compilation error
        myObject.protectedMethod();
        myObject.defaultMethod();
    }
}

