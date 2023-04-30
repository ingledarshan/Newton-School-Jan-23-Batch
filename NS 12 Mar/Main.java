// WAP to check perform matrix multiplication.
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
// 		Scanner sc = new Scanner(System.in);
//         int m,p,n;
//         System.out.println("Enter the va;ue of m, p, n: ");
//         m = sc.nextInt();
//         p = sc.nextInt();
//         n = sc.nextInt();
//         int A[][] = new int [m][p];
//         int B[][] = new int [p][n];
//         int C[][] = new int [m][n];
//         int i, j, k;

//         System.out.println("Enter the A array elements row-wise:");
//         for(i=0;i<m;i++)
//             for(j=0;j<p;j++)
//                 A[i][j] = sc.nextInt();

//         System.out.println("Enter the B array elements row-wise:");
//         for(i=0;i<p;i++)
//             for(j=0;j<n;j++)
//                 B[i][j] = sc.nextInt();

//         for(i=0;i<m;i++)
//             for(j=0;j<n;j++)
//             {
//                 C[i][j] = 0;
//                 for(k=0;k<p;k++)
//                     // C[i][j] += A[i][k] * B[k][j];
//                     C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
//             }

//         System.out.println("A Array elements are as follows:\n");
//         for(i=0;i<m;i++)
//         {
//             for(j=0;j<p;j++)
//             {
//                 System.out.print(A[i][j]+" ");
//             }
//             System.out.println();
//         }

//         System.out.println("B Array elements are as follows:\n");
//         for(i=0;i<p;i++)
//         {
//             for(j=0;j<n;j++)
//             {
//                 System.out.print(B[i][j]+" ");
//             }
//             System.out.println();
//         }

//         System.out.println("C Array elements i.e. Matrix Multiplication, is as follows:\n");
//         for(i=0;i<m;i++)
//         {
//             for(j=0;j<n;j++)
//             {
//                 System.out.print(C[i][j]+" ");
//             }
//             System.out.println();
//         }

// 	}
// }


// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int n, i, j;
//         System.out.print("Enter n: ");
//         n = sc.nextInt();
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=(n-i);j++)
//                 System.out.print(" ");
//             for(j=1;j<=i;j++)
//                 System.out.print("*");
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=(i-1);j++)
                System.out.print(" ");
            for(j=1;j<=(n-i+1);j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
