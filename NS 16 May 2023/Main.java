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


class Rec {
    double length;
    double breadth;

    void calculateArea() {
        double area = length * breadth;
        System.out.println("The area of rectangle is : " + area);
    }
}
public class Main {
    public static void main(String[] args) {
        Rec myRec = new Rec();
        myRec.length = 10;
        myRec.breadth = 15;
        myRec.calculateArea();
    }
}
