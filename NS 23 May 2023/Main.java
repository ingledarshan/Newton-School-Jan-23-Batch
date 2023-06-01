// class Rectangle{
//     double length;
//     double breadth;
    
//     void calculateArea()
//     {
//         double area=length*breadth;
//         System.out.println("The area of Rectangle is "+area);
//     }
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 		Rectangle myrec=new Rectangle();
//         // System.out.println("Length and breadth of myrec are "+myrec.length+" "+myrec.breadth);
// 		myrec.length=20;
// 		myrec.breadth=30;
//         System.out.println("Length and breadth of myrec are "+myrec.length+" "+myrec.breadth);
// 		myrec.calculateArea();

//         Rectangle o1=new Rectangle();
//         // System.out.println("Length and breadth of myrec are "+myrec.length+" "+myrec.breadth);
// 		o1.length=19;
// 		o1.breadth=1.219;
//         System.out.println("Length and breadth of myrec are "+o1.length+" "+o1.breadth);
// 		o1.calculateArea();
// 	}
// }

// // Default Constructor
// class Rec {
//     double length;
//     double breadth;

//     // Constructor: It is used to initialize the object
//     // It is called automatically when an object is created
//     // It has the same name as that of the class
//     // It does not have a return type
//     Rec()
//     {
//         System.out.println("Constructor called.");
//         length = 10;
//         breadth = 20;
//     }

//     void calculateArea() {
//         double area = length * breadth;
//         System.out.println("The area of rectangle is : " + area);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Rec myRec = new Rec();
//         System.out.println("Length and breadth of myRec are "+myRec.length+" "+myRec.breadth);
//         myRec.calculateArea();
//         myRec.length = 10;
//         myRec.breadth = 15;
//         myRec.calculateArea();
//     }
// }

// // Default Constructor
// class Circle {
//     double r;

//     // Constructor: It is used to initialize the object
//     // It is called automatically when an object is created
//     // It has the same name as that of the class
//     // It does not have a return type
//     Circle()
//     {
//         System.out.println("Constructor called.");
//         r = 6;
//     }

//     void calculateArea() {
//         System.out.println("The area of circle is : " + (Math.PI*r*r));
//     }

//     void calculatePerimeter() {
//         System.out.println("The perimeter of circle is : " + (2*Math.PI*r));
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Circle c = new Circle();
//         System.out.println("Radius of Circle are "+c.r);
//         c.calculateArea();
//         c.calculatePerimeter();
//         c.r = 10;
//         c.calculateArea();
//         c.calculatePerimeter();
//     }
// }


// // Parameterized Constructor
// class Rec {
//     double length;
//     double breadth;

//     // Parameterized Constructor
//     Rec(double l, double b)
//     {
//         System.out.println("Parameterized Constructor called.");
//         length = l;
//         breadth = b;
//     }

//     void calculateArea() {
//         double area = length * breadth;
//         System.out.println("The area of rectangle is : " + area);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Rec myRec = new Rec(6.0, 12.0);
//         System.out.println("Length and breadth of myRec are "+myRec.length+" "+myRec.breadth);
//         myRec.calculateArea();
//         myRec.length = 10;
//         myRec.breadth = 15;
//         myRec.calculateArea();
//     }
// }

// Copy Constructor:
// It is a special type of constructor that allows you to create a new object 
// by copying the state of an existing object.
// Parameterized Constructor
class Rec {
    double length;
    double breadth;

    // Parameterized Constructor
    Rec(double l, double b)
    {
        System.out.println("Parameterized Constructor called.");
        length = l;
        breadth = b;
    }

    // Copy Constructor
    Rec(Rec cpy)
    {
        System.out.println("Copy Constructor called.");
        this.length = cpy.length;
        this.breadth = cpy.breadth;
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("The area of rectangle is : " + area);
    }
}
public class Main {
    public static void main(String[] args) {
        Rec myRec = new Rec(6.0, 12.0);
        Rec myReccpy = new Rec(myRec);
        System.out.println("Length and breadth of myRec are "+myRec.length+" "+myRec.breadth);
        myRec.calculateArea();
        myRec.length = 10;
        myRec.breadth = 15;
        myRec.calculateArea();
        myReccpy.calculateArea();
    }
}