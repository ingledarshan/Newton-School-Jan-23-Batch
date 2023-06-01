// Static Method
class StaticMethodDemo
{
    static void shubham()
    {
        System.out.println("No paramter.");
    }

    static void shubham(int a)
    {
        System.out.println("One paramter int.");
    }

    static void shubham(String a)
    {
        System.out.println("One paramter String.");
    }

    static void shubham(int a, int b)
    {
        System.out.println("Two paramters int.");
    }

    static void shubham(String a, String b)
    {
        System.out.println("Two paramters String.");
    }

    static void shubham(String a, int b)
    {
        System.out.println("Two paramters String and int.");
    }

    static void shubham(int a, String b)
    {
        System.out.println("Two paramters int and String.");
    }
public static void main(String args[])
    {
        shubham();
        shubham(100);
        shubham("Darshan");
        shubham(5, 60);
        shubham("Darshan", "Ingle");
        shubham("Darshan", 36);
        shubham( 19, "Darshan");
    }
}