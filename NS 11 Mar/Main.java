// WAP to check accept a 2D array and display it.
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
// 		Scanner sc = new Scanner(System.in);
//         int row, col;
//         int a[][] = new int [2][3];
//         System.out.println("Enter the array elements row-wise:\n");

//         for(row=0;row<=1;row++)
//             for(col=0;col<=2;col++)
//                 a[row][col] = sc.nextInt();

//         System.out.println("Length of array is: "+a.length);

//         System.out.println("Array elements are as follows:\n");
//         for(row=0;row<=1;row++)
//         {
//             for(col=0;col<=2;col++)
//             {
//                 System.out.print(a[row][col]+" ");
//             }
//             System.out.println();
//         }
// 	}
// }

// WAP to check accept a 2D array and display it.
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
// 		Scanner sc = new Scanner(System.in);
//         int rows, cols;
//         System.out.println("Enter the number of rows and cols: ");
//         rows = sc.nextInt();
//         cols = sc.nextInt();
//         int a[][] = new int [rows][cols];
//         System.out.println("Enter the array elements row-wise:\n");
//         int row, col;
//         for(row=0;row<=(rows-1);row++)
//             for(col=0;col<=(cols-1);col++)
//                 a[row][col] = sc.nextInt();

//         System.out.println("Length of array is: "+a.length);

//         System.out.println("Array elements are as follows:\n");
//         for(row=0;row<=(rows-1);row++)
//         {
//             for(col=0;col<=(cols-1);col++)
//             {
//                 System.out.print(a[row][col]+" ");
//             }
//             System.out.println();
//         }
// 	}
// }


// class Main 
// {
//     public static void main(String[] args) 
//     {
    
//     int[] age = {12, 4, 5};
    
//     System.out.println("Using for Loop:");
    
//     for(int i = 0; i < age.length; i++) 
//         {
//          System.out.println(age[i]);
//     }
//     }
// }


// WAP to check perform matrix addition.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        int rows, cols;
        System.out.println("Enter the number of rows and cols: ");
        rows = sc.nextInt();
        cols = sc.nextInt();
        int A[][] = new int [rows][cols];
        int B[][] = new int [rows][cols];
        int C[][] = new int [rows][cols];
        int row, col;
        System.out.println("Enter the A array elements row-wise:");
        for(row=0;row<=(rows-1);row++)
            for(col=0;col<=(cols-1);col++)
                A[row][col] = sc.nextInt();

        System.out.println("Enter the B array elements row-wise:");
        for(row=0;row<=(rows-1);row++)
            for(col=0;col<=(cols-1);col++)
                B[row][col] = sc.nextInt();

        System.out.println("A Array elements are as follows:\n");
        for(row=0;row<=(rows-1);row++)
        {
            for(col=0;col<=(cols-1);col++)
            {
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println("B Array elements are as follows:\n");
        for(row=0;row<=(rows-1);row++)
        {
            for(col=0;col<=(cols-1);col++)
            {
                System.out.print(B[row][col]+" ");
            }
            System.out.println();
        }

        for(row=0;row<=(rows-1);row++)
            for(col=0;col<=(cols-1);col++)
                C[row][col] = A[row][col] + B[row][col];

        System.out.println("C Array elements are as follows:\n");
        for(row=0;row<=(rows-1);row++)
        {
            for(col=0;col<=(cols-1);col++)
            {
                System.out.print(C[row][col]+" ");
            }
            System.out.println();
        }

	}
}