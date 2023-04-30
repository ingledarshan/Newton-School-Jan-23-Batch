// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
// 		int n, i;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         n = sc.nextInt(); // 8
//         int a[] = new int[n];
//         System.out.println("Enter the array elements one by one:");
//         for(i=0;i<=(n-1);i++)
//             a[i] = sc.nextInt();
        
//         System.out.println("Array contents are as below:");
//         for(i=0;i<=(n-1);i++)
//             System.out.println(a[i]);

//         int sum_even_places=0, sum_odd_places=0;

//         for(i=0;i<=(n-1);i+=2)
//             sum_even_places += a[i]; // sum = sum + a[i];
//         System.out.println("Sum of the array's even elements is as below:");
//         System.out.println(sum_even_places);

//         i = 1;
//         while (i<=n-1)
//         {
//             sum_odd_places += a[i];
//             i = i+2;
//         }
//         System.out.println("Sum of the array's odd elements is as below:");
//         System.out.println(sum_odd_places);
// 	}
// }

// // WAP to check if the integer array is in ascending order

// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
// 		int n, i;
//         int flag = 0; // flag=0 means we are assuming its in Asc order
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         n = sc.nextInt(); // 8
//         int a[] = new int[n];
//         System.out.println("Enter the array elements one by one:");
//         for(i=0;i<=(n-1);i++)
//             a[i] = sc.nextInt(); // taking array elements as input
        
//         System.out.println("Array contents are as below:");
//         for(i=0;i<=(n-1);i++) // Displaying the array elements
//             System.out.println(a[i]);

//         for (i=0;i<=n-2;i++)
//         {
//             if (a[i]<a[i+1])
//             {
//                 flag=0;
//                 continue;
//             }
//             else
//             {
//                 flag=1;
//                 break; // break terminates the current loop
//             }
//         }
//         if (flag==0)
//             System.out.println("Array is sorted.");
//         else
//             System.out.println("Array is not sorted.");
        
// 	}
// }

// WAP to check if the integer array is in descending order

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
    {
		int n, i;
        int flag = 0; // flag=0 means we are assuming its in Asc order
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt(); // 8
        int a[] = new int[n];
        System.out.println("Enter the array elements one by one:");
        for(i=0;i<=(n-1);i++)
            a[i] = sc.nextInt(); // taking array elements as input
        
        System.out.println("Array contents are as below:");
        for(i=0;i<=(n-1);i++) // Displaying the array elements
            System.out.println(a[i]);

        for (i=0;i<=n-2;i++)
        {
            if (a[i]>a[i+1])
            {
                flag=0;
                continue;
            }
            else
            {
                flag=1;
                break; // break terminates the current loop
            }
        }
        if (flag==0)
            System.out.println("Array is in descending order.");
        else
            System.out.println("Array is not in descending order..");
        
	}
}