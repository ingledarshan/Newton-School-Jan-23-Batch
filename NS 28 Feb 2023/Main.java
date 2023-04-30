// https://my.newtonschool.co/playground/code/1xmittg1fobd

// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//         // Your code here
//         Scanner sc = new Scanner(System.in);
//         int N, T;
//         N = sc.nextInt();
//         T = sc.nextInt();
//         System.out.println(T-N);
//     }
// }

// https://my.newtonschool.co/playground/code/2gzpt4hdutw6/
// static void isPalindrome(int N)
// 	{
// 		int originalNumber = N;
// 		int newNumber = 0;
// 		while (N > 0)
// 		{
// 	    int digit = N % 10;
// 	    N = N/10;
// 	    newNumber = (newNumber * 10) + digit;
// 		}
	  
// 	       if (newNumber == originalNumber)
// 		{
// 		   System.out.println("True");
// 		} else{
// 				   System.out.println("false");
// 			}

// 	}

// Variable Overshadowing - example1

// class JavaHungry
// {
//     String name = "Darshan"; // Akshay Kumar of Bollywood
//     int age = 35;

//     void show()
//     {
//         String name = "Mac"; // Our class ka Akshay Kumar
//         int age = 2;
//         System.out.println("Name is: "+name);
//         System.out.println("Age is: "+age);
//         System.out.println("Name is: "+this.name);
//         System.out.println("Age is: "+this.age);
//     }
// }

// class Main
// {
//     public static void main(String args[])
//     {
//         JavaHungry obj = new JavaHungry();
//         obj.show();
//     }
// }


// Variable Overshadowing - example2

// class Box
// {
//     double height=10, width=10, depth=10;

//     void show()
//     {
//         System.out.println(height+" "+width+" "+depth);
//         double height=11, width=22, depth=33;
//         System.out.println(height+" "+width+" "+depth);
//         System.out.println(this.height+" "+this.width+" "+this.depth);
//     }
// }

// class Main
// {
//     public static void main(String[] args)
//     {
//         Box b1 = new Box();
//         b1.show();
//         b1.height = 50;
//         b1.show();
//         System.out.println(b1.height+" "+b1.width+" "+b1.depth);
//         // System.out.println(this.height+" "+this.width+" "+this.depth); // Error, Never use this in the Main()
//     }
// }



// // Functions with parameters
// class Addition
// {
//     void sum(int a, int b)
//     {
//         int c;
//         c = a+b;
//         System.out.println("Addition = "+c);
//     }

// }

// // Main class
// class Main
// {
//     public static void main(String[] args) 
//     {
//         Addition o1 = new Addition();
//         o1.sum(100,400);
//     }
// }

// // Functions with parameters using void as function return type
// class Calculator
// {
//     void sum(int a, int b)
//     {
//         int c;
//         c = a+b;
//         System.out.println("Addition = "+c);
//     }

//     void diff(int a, int b)
//     {
//         int c;
//         c = a-b;
//         System.out.println("Difference = "+c);
//     }

//     void multiply(int a, int b)
//     {
//         int c;
//         c = a*b;
//         System.out.println("Multiplication = "+c);
//     }

//     void division(int a, int b)
//     {
//         int c;
//         c = a/b;
//         System.out.println("Division = "+c);
//     }

//     void modulo(int a, int b)
//     {
//         int c;
//         c = a%b;
//         System.out.println("Modulo = "+c);
//     }

// }

// // Main class
// class Main
// {
//     public static void main(String[] args) 
//     {
//         Calculator o1 = new Calculator();
//         o1.sum(11,2);
//         o1.diff(11,2);
//         o1.multiply(11,2);
//         o1.division(11,2);
//         o1.modulo(11,2);
//     }
// }

// // Functions with parameters using return in functions 
// class Calculator
// {
//     int sum(int a, int b)
//     {
//         return (a+b);
//     }

//     int diff(int a, int b)
//     {
//         return (a-b);
//     }

//     int multiply(int a, int b)
//     {
//         return (a*b);
//     }

//     int division(int a, int b)
//     {
//         return (a/b);
//     }

//     int modulo(int a, int b)
//     {
//         return (a%b);
//     }
// }

// // Main class
// class Main
// {
//     public static void main(String[] args) 
//     {
//         Calculator o1 = new Calculator();
//         int res;
//         res = o1.sum(11,2);
//         System.out.println("Addition = "+res);
//         res = o1.diff(11,2);
//         System.out.println("Difference = "+res);
//         res = o1.multiply(11,2);
//         System.out.println("Multiplication = "+res);
//         res = o1.division(11,2);
//         System.out.println("Division = "+res);
//         res = o1.modulo(11,2);
//         System.out.println("Modulo = "+res);
//     }
// }

// Functions with parameters using return in functions - Another way
class Calculator
{
    int sum(int a, int b)
    {
        return (a+b);
    }

    int diff(int a, int b)
    {
        return (a-b);
    }

    int multiply(int a, int b)
    {
        return (a*b);
    }

    int division(int a, int b)
    {
        return (a/b);
    }

    int modulo(int a, int b)
    {
        return (a%b);
    }
}

// Main class
class Main
{
    public static void main(String[] args) 
    {
        Calculator o1 = new Calculator();
        // Please note, the variable res is removed
        // This saves our RAM and is called as an efficient way of coding
        // Whenever, you dont require variables, always try to avoid it.
        // It saves the memory and is considered as a good programming practice
        // This is what we will discuss in our next class in detail
        // i.e. Time complexity and Space Complexity
        System.out.println("Addition = "+ o1.sum(11,2));
        System.out.println("Difference = "+ o1.diff(11,2));
        System.out.println("Multiplication = "+ o1.multiply(11,2));
        System.out.println("Division = "+ o1.division(11,2));
        System.out.println("Modulo = "+ o1.modulo(11,2));
    }
}

