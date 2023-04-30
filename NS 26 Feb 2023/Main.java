// // Creation of Box class
// class Box
// {
//     double width;
//     double height;
//     double depth;
// }

// // Main class
// class Main
// {
//     public static void main(String[] args) 
//     {
//         // Create object b1 of class Box
//         Box b1 = new Box();
//         System.out.println(b1.width); // 0.0
//         System.out.println(b1.height); // 0.0
//         System.out.println(b1.depth); // 0.0
//         b1.height=10;
//         b1.width=10;
//         b1.depth=10;
//         System.out.println(b1.width); // 10.0
//         System.out.println(b1.height); // 10.0
//         System.out.println(b1.depth); // 10.0

//         Box b2 = new Box();
//         System.out.println(b2.width); // 0.0
//         System.out.println(b2.height); // 0.0
//         System.out.println(b2.depth); // 0.0
//         b2.height=7;
//         b2.width=5;
//         b2.depth=6;
//         System.out.println(b2.width); // 5.0
//         System.out.println(b2.height); // 7.0
//         System.out.println(b2.depth); // 6.0

//         double vol;

//         // Volume of b1
//         vol = b1.height * b1.width * b1.depth; // 10.0*10.0*10.0
//         System.out.println("Volume of b1="+vol); // 1000.0

//         // Volume of b2
//         vol = b2.height * b2.width * b2.depth; // 7.0*5.0*6.0
//         System.out.println("Volume of b2="+vol); // 210.0
//     }
// }

// New Code

// // Creation of Box class
// class Box
// {
//     double width;
//     double height;
//     double depth;

//     // Create a volume function that prints the volume of the box
//     void volume()
//     {
//         double v;
//         v = width * height * depth;
//         System.out.println("Volume of the box is "+v);
//     }
// }

// // Main class
// class Main
// {
//     public static void main(String[] args) 
//     {
//         // Create object b1 of class Box
//         Box b1 = new Box();
//         b1.height=10;
//         b1.width=10;
//         b1.depth=10;
//         System.out.println(b1.width); // 10.0
//         System.out.println(b1.height); // 10.0
//         System.out.println(b1.depth); // 10.0

//         Box b2 = new Box();
//         b2.height=7;
//         b2.width=5;
//         b2.depth=6;
//         System.out.println(b2.width); // 5.0
//         System.out.println(b2.height); // 7.0
//         System.out.println(b2.depth); // 6.0

//         b1.volume();
//         System.out.println("Back to the Main function.");

//         b2.volume();
//         System.out.println("Back to the Main function.");
//     }
// }


// New Code

// Creation of Box class
class Box
{
    double width;
    double height;
    double depth;

    // Create a volume function that prints the volume of the box
    double volume()
    {
        double v;
        v = width * height * depth;
        return v; // it returns back from where it was called
    }
}

// Main class
class Main
{
    public static void main(String[] args) 
    {
        // Create object b1 of class Box
        Box b1 = new Box();
        b1.height=10;
        b1.width=10;
        b1.depth=10;
        System.out.println(b1.width); // 10.0
        System.out.println(b1.height); // 10.0
        System.out.println(b1.depth); // 10.0

        Box b2 = new Box();
        b2.height=7;
        b2.width=5;
        b2.depth=6;
        System.out.println(b2.width); // 5.0
        System.out.println(b2.height); // 7.0
        System.out.println(b2.depth); // 6.0

        double res;
        res = b1.volume();
        System.out.println("Volume of the b1 is "+res);

        res = b2.volume();
        System.out.println("Volume of the b2 is "+res);    
    }
}