// for loop to print numbers from 1 to 5 i.e. 1 2 3 4 5
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         int i;
//         for(i = 1; i<=5; i++) 
//         {
//             System.out.println(i);
//         }
//     }
// }

// while loop to print numbers from 1 to 5 i.e. 1 2 3 4 5
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         int i=1;
//         while(i<=5)
//         {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// do while loop to print numbers from 1 to 5 i.e. 1 2 3 4 5
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         int i = 1;
//         do
//         {
//             System.out.println(i);
//             i++;
//         }while(i<=5);
//     }
// }

// do while loop: It will execute atleast once even if the conditin is False
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         int i = 100;
//         do
//         {
//             System.out.println(i);
//             i++;
//         }while(i<=5);
//     }
// }

// Scanner class
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("What is your name?"); 
//         String s;
//         s = sc.nextLine();
//         System.out.println("Hello "+s);   
//     }
// }

// Scanner class
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         Scanner sn = new Scanner(System.in);
//         System.out.println("What is your first name?"); 
//         String fname, lname;
//         fname = sn.nextLine();
//         System.out.println("What is your last name?"); 
//         lname = sn.nextLine();
//         System.out.println("Hello "+fname+" "+lname);   
//     }
// }


// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first no:"); 
//         int no1, no2;
//         no1 = sc.nextInt();
//         System.out.println("Enter second no:"); 
//         no2 = sc.nextInt();
//         int res;
//         res = no1+no2;
//         System.out.println("Addition= "+res);
//     }
// }

// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first no:"); 
//         double no1, no2;
//         no1 = sc.nextDouble();
//         System.out.println("Enter second no:"); 
//         no2 = sc.nextDouble();
//         double res;
//         res = no1+no2;
//         System.out.println("Addition= "+res);
//     }
// }

// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first no:"); 
//         int no1;
//         double no2;
//         no1 = sc.nextInt();
//         System.out.println("Enter second no:"); 
//         no2 = sc.nextDouble();
//         double res = no1*no2;
//         System.out.println("Product= "+res);
//     }
// }

// WAP to accept a value in a variable 'n' and print numbers from 1 to n.
// eg: if n=5, output must be 1 2 3 4 5
// eg: if n=10, output must be 1 2 3 4 5 6 7 8 9 10
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: "); 
        n = sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            System.out.println(i); 
        }
    }
}