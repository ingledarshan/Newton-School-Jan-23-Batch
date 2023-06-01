class A
{
    int i;

    void abc()
    {
        System.out.println("I am the father class.");
        System.out.println("i= "+i);
        // System.out.println("j= "+j); // error
    }
}

class B extends A
{
    int j;

    void xyz()
    {
        System.out.println("I am the child class.");
        System.out.println("i= "+i);
        System.out.println("j= "+j);
    }
}

class Main
{
    public static void main(String[] args) 
    {
        // B sub = new B();
        // sub.i = 10;
        // sub.j = 20;
        // sub.abc();
        // sub.xyz();


        // always create object of the lowest derived class
        // A sup = new A();
        // sup.i = 100;
        // sup.abc();
        // sup.j = 99; // no access
    }
}