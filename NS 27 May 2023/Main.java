// Static Variable in Java
// class StaticVariableExample 
// {
//     static int count = 0;
//     int a;
//     void incrementCounter()
//     {
//         count++;
//     }
// }
// public class Main {
//     public static void main(String[] args) 
//     {
//         StaticVariableExample o1 = new StaticVariableExample();
//         o1.a = 10;
//         System.out.println("Counter value: "+o1.count);
//         System.out.println("a: "+o1.a);
//         o1.incrementCounter();
//         StaticVariableExample o2 = new StaticVariableExample();
//         o2.a = 20;
//         System.out.println("Counter value: "+o2.count);
//         System.out.println("a: "+o2.a);
//         o2.incrementCounter();
//         System.out.println("Counter value: "+o1.count);

//     }
// }


// // Method Overloading
// class OverloadExample 
// {
//     void shubham()
//     {
//         System.out.println("No parameters.");
//     }

//     void shubham(int a)
//     {
//         System.out.println("One parameter.");
//     }

//     void shubham(int a, int b)
//     {
//         System.out.println("Two parameters.");
//     }   
    
//     void shubham(double a)
//     {
//         System.out.println("One double parameter.");
//     }

//     void shubham(int a, double b)
//     {
//         System.out.println("Two parameters int and double.");
//     } 

//     void shubham(double c, int d)
//     {
//         System.out.println("Two parameters double and int.");
//     } 

// }
// public class Main {
//     public static void main(String[] args) 
//     {
//         OverloadExample s = new OverloadExample();
//         s.shubham();
//         s.shubham(100);
//         s.shubham(13,45);
//         s.shubham(3.1416);
//         s.shubham(100, 12.323);
//         s.shubham(43.324, 19);
//     }
// }


// // Constructor Overloading
// class Karthik 
// {
//     Karthik()
//     {
//         System.out.println("No parameter constructor called.");
//     }

//     Karthik(int a)
//     {
//         System.out.println("One parameter constructor called.");
//     }

//     Karthik(int a, double b)
//     {
//         System.out.println("Two parameter constructor called with int and double.");
//     }

//     Karthik(double c)
//     {
//         System.out.println("One parameter constructor called having double.");
//     }

//     Karthik(double a, int b)
//     {
//         System.out.println("Two parameter constructor called with double and int.");
//     }
// }
// public class Main {
//     public static void main(String[] args) 
//     {
//         Karthik k1 = new Karthik();
//         Karthik k2 = new Karthik(100);
//         Karthik k3 = new Karthik(100, 123.456);
//         Karthik k4 = new Karthik(3.1416);
//         Karthik k5 = new Karthik(123.456, 100);
//     }
// }
