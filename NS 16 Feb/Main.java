public class Main
{
	public static void main(String[] args) {
	    int a, b, c;
	    a = 2;
	    b = 3;
	    c = a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
	}
}

// public class Main
// {
// 	public static void main(String[] args) {
// 	    long a, b, c;
// 	    a = 2;
// 	    b = 3;
// 	    c = a+b;
// 		System.out.println("Addition of "+a+" and "+b+" is "+c);
// 	}
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 	    short a, b;
// 	    a = 2;
// 	    b = 3;
// 	    int c = a+b;
// 		System.out.println("Addition of "+a+" and "+b+" is "+c);
// 	}
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 	    byte a, b;
// 	    a = 2;
// 	    b = 3;
// 	    int c = a+b;
// 		System.out.println("Addition of "+a+" and "+b+" is "+c);
// 	}
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 	    double a, b, c;
// 	    a = 2;
// 	    b = 3;
// 	    c = a+b;
// 		System.out.println("Addition of "+a+" and "+b+" is "+c);
// 	}
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 	    float a, b, c;
// 	    a = 2f;
// 	    b = 3f;
// 	    c = a+b;
// 		System.out.println("Addition of "+a+" and "+b+" is "+c);
// 	}
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 	   // char can save any one alphabet eg: 'A', 'x', 'K', etc
// 	    char a, b;
// 	    a = 97;
// 	    b = 100;
// 		System.out.println(a+" "+b);
// 	}
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 	   // char can save any one alphabet eg: 'A', 'x', 'K', etc
// 	    double r = 4.5;
// 	    double area = (22.0/7)*r*r;
// 		System.out.println("Area of circle is: "+area);
// 	}
// }

// I can use a built-in library called Math
// Math has many functions inside it which can help us to compute mathematical operations
// But to use it, we need to invite it or call it or import it
// https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
// How? As below:
// import java.lang.Math;
// public class Main
// {
// 	public static void main(String[] args) {
// 	   // char can save any one alphabet eg: 'A', 'x', 'K', etc
// 	    double r = 4.5;
// 	    double area = Math.PI*r*r;
// 		System.out.println("Area of circle is: "+area);
// 	}
// }

// Given base and height, calculate the length of the hypotenuse from
// Pythagoras theorem

// import java.lang.Math;
// public class Main
// {
// 	public static void main(String[] args) {
// 	    double b, h;
// 	    b = 3;
// 	    h = 4;
// 	    double hyp = Math.sqrt(b*b+h*h);
// 		System.out.println("Length of the hyotenuse is: "+hyp);
// 	}
// }

// // Scope and Lifetime of Variables
// public class Main
// {
// 	public static void main(String[] args) 
// 	{
// 	    int x; // known globally throughout the program
// 	    x = 10;
// 	    {
// 	        int y = 20; // known only inside this brace bracket
// 	        System.out.println("y="+y);
	       
// 	    }
// 		System.out.println("x="+x);
// 		System.out.println("y="+y);
// 	}
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 	    int i;
// 	    double r = 43654.57584763753;
// 	    i = (int)r; // Typecasting
// 		System.out.println("r="+r+" and i="+i);
// 	}
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 	    int i = 12;
// 	    double r;
// 	    r = i; // Typecasting
// 		System.out.println("r="+r+" and i="+i);
// 	}
// }





