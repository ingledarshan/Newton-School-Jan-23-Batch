import java.util.Scanner;

// public class Main
// {
// 	public static void main(String[] args) 
//     {
// 		int a0 = 2;
//         int a1 = 4;
//         int a2 = 6;
//         int a3 = 8;
//         int a4 = 10;
//         int a5 = 12;
//         System.out.println(a0+a1+a2+a3+a4+a5);
//         System.out.println(System.identityHashCode(a0));
//         System.out.println(System.identityHashCode(a1));
//         System.out.println(System.identityHashCode(a2));
//         System.out.println(System.identityHashCode(a3));
//         System.out.println(System.identityHashCode(a4));
//         System.out.println(System.identityHashCode(a5));
// 	}
// }

// public class Main
// {
// 	public static void main(String[] args) 
//     {
// 		int arr[] = new int[5];
//         arr[0] = 2;
//         arr[1] = 4;
//         arr[2] = 6;
//         arr[3] = 8;
//         arr[4] = 10;
//         int sum;
//         sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
//         System.out.println(sum);
// 	}
// }

// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
// 		int n=5, i;
//         int a[] = new int[n];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array elements one by one:");
//         for(i=0;i<=(n-1);i++)
//             a[i] = sc.nextInt();
        
//         System.out.println("Array contents are as below:");
//         System.out.println(a[0]);
//         System.out.println(a[1]);
//         System.out.println(a[2]);
//         System.out.println(a[3]);
//         System.out.println(a[4]);
//         System.out.println("Sum of the array elements is as below:");
//         System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
// 	}
// }

// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
// 		int n=5, i;
//         int a[] = new int[n];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array elements one by one:");
//         for(i=0;i<=(n-1);i++)
//             a[i] = sc.nextInt();
        
//         System.out.println("Array contents are as below:");
//         for(i=0;i<=(n-1);i++)
//             System.out.println(a[i]);
//         System.out.println("Sum of the array elements is as below:");
//         System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
// 	}
// }

// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
// 		int n=5, i;
//         int a[] = new int[n];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array elements one by one:");
//         for(i=0;i<=(n-1);i++)
//             a[i] = sc.nextInt();
        
//         System.out.println("Array contents are as below:");
//         for(i=0;i<=(n-1);i++)
//             System.out.println(a[i]);
//         int sum=0;
//         for(i=0;i<=(n-1);i++)
//             sum += a[i]; // sum = sum + a[i];
//         System.out.println("Sum of the array elements is as below:");
//         System.out.println(sum);
// 	}
// }


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
    {
		int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt(); // 5
        int a[] = new int[n];
        System.out.println("Enter the array elements one by one:");
        for(i=0;i<=(n-1);i++)
            a[i] = sc.nextInt();
        
        System.out.println("Array contents are as below:");
        for(i=0;i<=(n-1);i++)
            System.out.println(a[i]);
        int sum=0;
        for(i=0;i<=(n-1);i++)
            sum += a[i]; // sum = sum + a[i];
        System.out.println("Sum of the array elements is as below:");
        System.out.println(sum);
	}
}
