// Method Overloading

// class Calculator
// {
//     void add(int a, int b)
//     {
//         System.out.println(a+b);
//     }
    
//     void add(int a, double b)
//     {
//         System.out.println(a+b);
//     }

//     void add(double a, int b)
//     {
//         System.out.println(a+b);
//     }

//     void add(int a, int b, int c)
//     {
//         System.out.println(a+b+c);
//     }    
// }

// class Main
// {
//     public static void main(String[] args) 
//     {
//         Calculator c = new Calculator();
//         c.add(10, 20);
//         c.add(10, 20.5);
//         c.add(10.5, 5);
//         c.add(1, 5, 3);
//     }
// }

// // Constructor Overloading
// class Rectangle
// {
//     int width;
//     int height; 

//     // Constructor with no parameters
//     Rectangle()
//     {
//         width = 0;
//         height = 0;
//     }

//     // Constructor with one parameter
//     Rectangle(int side)
//     {
//         width = side;
//         height = side;
//     }

//     // Rectangle(int h, int w)
//     // {
//     //     height = h;
//     //     width = w;
//     // }
//     // or
//     Rectangle(int height, int width)
//     {
//         this.height = height;
//         this.width = width;
//     }

//     void print_area()
//     {
//         System.out.println("Area= "+(height*width));
//     }
// }
// class Main
// {
//     public static void main(String[] args) 
//     {
//         Rectangle r1 = new Rectangle();
//         Rectangle r2 = new Rectangle(5);
//         Rectangle r3 = new Rectangle(5,6);
//         r1.print_area();
//         r2.print_area();
//         r3.print_area();
//     }
// }

// // Static Method
// class StaticMethodDemo
// {
//     static void shubham()
//     {
//         System.out.println("No paramter.");
//     }

//     static void shubham(int a)
//     {
//         System.out.println("One paramter int.");
//     }

//     static void shubham(String a)
//     {
//         System.out.println("One paramter String.");
//     }

//     static void shubham(int a, int b)
//     {
//         System.out.println("Two paramters int.");
//     }

//     static void shubham(String a, String b)
//     {
//         System.out.println("Two paramters String.");
//     }

//     static void shubham(String a, int b)
//     {
//         System.out.println("Two paramters String and int.");
//     }

//     static void shubham(int a, String b)
//     {
//         System.out.println("Two paramters int and String.");
//     }
// }

// class Main
// {
//     public static void main(String args[])
//     {
//         StaticMethodDemo.shubham();
//         StaticMethodDemo.shubham(100);
//         StaticMethodDemo.shubham("Darshan");
//         StaticMethodDemo.shubham(5, 60);
//         StaticMethodDemo.shubham("Darshan", "Ingle");
//         StaticMethodDemo.shubham("Darshan", 36);
//         StaticMethodDemo.shubham( 19, "Darshan");
//     }
// }

// // Access Modifiers
// public class ExampleClass
// {
//     public int publicVar;
//     private int privateVar;
//     protected int protectedVar;
//     int defaultVar;

//     public void publicMethod()
//     {
//         // Code accessible from anywhere
//     }

//     private void privateMethod()
//     {
//         // Code accessible only with in this
//     }

//     protected void protectedMethod()
//     {
//         // Code accessible within this class, subclasses and same package
//     }

//     void defaultMethod()
//     {
//         // Code accessible within the same package
//     }
// }

