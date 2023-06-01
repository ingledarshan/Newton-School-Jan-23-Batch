// Access Modifiers Java Example
public class MyClass
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

    private void protectedMethod()
    {
        System.out.println("This is a protected method.");
    }

    private void defaultMethod()
    {
        System.out.println("This is a default method.");
    }
}