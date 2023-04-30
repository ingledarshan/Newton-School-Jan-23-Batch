import java.util.Scanner;

// for loop to print 
// * * * * 
// * * * * 
// * * * * 
// * * * * 

// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         int i,j;
//         for(i = 1; i<=4; i++) 
//         {
//             for(j=1;j<=4;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         int i,j;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n = sc.nextInt();
//         for(i = 1; i<=n; i++) 
//         {
//             for(j=1;j<=n;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         int i,j;
//         for(i = 1; i<=2; i++) 
//         {
//             for(j=1;j<=6;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         int i,j;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the total number of rows:");
//         int rows = sc.nextInt(); // 5
//         System.out.print("Enter the total number of cols:");
//         int cols = sc.nextInt(); // 4
//         for(i = 1; i<=rows; i++) 
//         {
//             for(j=1;j<=cols;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         int i,j,n;
//         Scanner sc = new Scanner((System.in));
//         System.out.print("Enter n:");
//         n = sc.nextInt();
//         for(i = 1; i<=n; i++)
//         {
//             for(j=1;j<=n;j++)
//             {
//                 if (i==1 || i==n || j==1 || j==n)
//                     System.out.print("* ");
//                 else
//                     System.out.print("  ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         int i,j;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n = sc.nextInt();
//         for(i = 1; i<=n; i++) 
//         {
//             for(j=1;j<=i;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
    {
        int i,j;
        for(i = 1; i<=5; i++) 
        {
            for(j=1;j<=(5-i);j++) // Loop for printing spaces
            {
                System.out.print("D ");
            }
            for(j=1;j<=i;j++) // loop for printing *
            {
                System.out.print("* ");
            }
            System.out.println(); // going to new line
        }
    }
}


