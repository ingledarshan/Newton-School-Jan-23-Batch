public class A
{
    int a, b;
    
    // A(int x, int y)
    // {
    //     System.out.println("Parameterized constructor called.");
    //     a = x; // a = 10
    //     b = y; // b = 20
    // }

    // or
    A(int a, int b)
    {
        System.out.println("Parameterized constructor called.");
        this.a = a; // a = 10
        this.b = b; // b = 20
    }

    void show()
    {
        System.out.println("a = "+a+" , b = "+b);
    }

    public static void main(String args[])
    {
        A aa = new A(10,20);
        aa.show();
    }
}
