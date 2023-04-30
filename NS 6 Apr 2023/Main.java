// // WAP to implement Linear Search
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) 
// 	{
// 	   int n, i, search;
// 	   Scanner sc = new Scanner(System.in);
// 	   System.out.print("Enter the number of elements: ");
// 	   n = sc.nextInt();
// 	   int arr[] = new int[n];
// 	   for(i=0;i<n;i++)
// 		arr[i] = sc.nextInt();
// 		System.out.println("Enter array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
		
// 		System.out.print("\nEnter the number to be searched: ");
// 		search = sc.nextInt();

// 		for(i=0;i<n;i++)
// 			if(arr[i] == search)
// 				{
// 					System.out.print("\nElement found at index "+i+"\n");
// 					break;
// 				}

// 		if(i==n)
// 			System.out.print(search + " element is not present in the array.");
// 	}
// }


// // WAP to implement Linear Search by creating a User Defined Function
// // https://www.javatpoint.com/linear-search

// import java.util.*;
// public class Main
// {
//     static int linearSearch(int a[], int search)
//     {
//         for(int i=0;i<a.length;i++)
//             if (a[i]==search)
//                 return i;
            
//         return -1;
//     }
// 	public static void main(String[] args) 
// 	{
// 	   int n, i, search;
// 	   Scanner sc = new Scanner(System.in);
// 	   System.out.print("Enter the number of elements: ");
// 	   n = sc.nextInt();
// 	   int arr[] = new int[n];
// 	   for(i=0;i<n;i++)
// 		arr[i] = sc.nextInt();
// 		System.out.println("Enter array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
		
// 		System.out.print("\nEnter the number to be searched: ");
// 		search = sc.nextInt();

// 		int pos = linearSearch(arr, search);

// 		if(pos==-1)
// 			System.out.print(search + " element is not present in the array.");
//         else
//             System.out.print(search + " element is present in the array at index "+pos);
// 	}
// }

// WAP to implement Binary Search by creating a User Defined Function

// // WAP to implement Linear Search
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) 
// 	{
// 	   int n, i, search;
// 	   Scanner sc = new Scanner(System.in);
// 	   System.out.print("Enter the number of elements: ");
// 	   n = sc.nextInt();
// 	   int arr[] = new int[n];
// 	   for(i=0;i<n;i++)
// 		arr[i] = sc.nextInt();
// 		System.out.println("Enter array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
		
// 		System.out.print("\nEnter the number to be searched: ");
// 		search = sc.nextInt();

// 		for(i=0;i<n;i++)
// 			if(arr[i] == search)
// 				{
// 					System.out.print("\nElement found at index "+i+"\n");
// 					break;
// 				}

// 		if(i==n)
// 			System.out.print(search + " element is not present in the array.");
// 	}
// }


// // WAP to implement Linear Search by creating a User Defined Function
// // https://www.javatpoint.com/linear-search

// import java.util.*;
// public class Main
// {
//     static int linearSearch(int a[], int search)
//     {
//         for(int i=0;i<a.length;i++)
//             if (a[i]==search)
//                 return i;
            
//         return -1;
//     }
// 	public static void main(String[] args) 
// 	{
// 	   int n, i, search;
// 	   Scanner sc = new Scanner(System.in);
// 	   System.out.print("Enter the number of elements: ");
// 	   n = sc.nextInt();
// 	   int arr[] = new int[n];
// 	   for(i=0;i<n;i++)
// 		arr[i] = sc.nextInt();
// 		System.out.println("Enter array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
		
// 		System.out.print("\nEnter the number to be searched: ");
// 		search = sc.nextInt();

// 		int pos = linearSearch(arr, search);

// 		if(pos==-1)
// 			System.out.print(search + " element is not present in the array.");
//         else
//             System.out.print(search + " element is present in the array at index "+pos);
// 	}
// }

// // WAP to implement Binary Search by creating a User Defined Function

// import java.util.*;
// public class Main
// {
//     static int binarySearch(int a[], int search)
//     {
//         int l, h, mid;
//         l=0;
//         h=(a.length-1);
//         while (l<=h)
//         {
//             mid = (l+h)/2;
//             if(a[mid]==search)
//                 return mid;
//             else if(a[mid]<search)
//                 l = mid+1;
//             else
//                 h = mid-1;
//         }

//         if (l>h)
//             return -1;
        
//         return -100;
//     }
// 	public static void main(String[] args) 
// 	{
// 	   int n, i, search;
// 	   Scanner sc = new Scanner(System.in);
// 	   System.out.print("Enter the number of elements: ");
// 	   n = sc.nextInt();
// 	   int arr[] = new int[n];
// 	   for(i=0;i<n;i++)
// 		arr[i] = sc.nextInt();
// 		System.out.println("Enter array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
		
// 		System.out.print("\nEnter the number to be searched: ");
// 		search = sc.nextInt();
//         sc.close();
// 		int pos = binarySearch(arr, search);

// 		if(pos==-1)
// 			System.out.print(search + " element is not present in the array.");
//         else
//             System.out.print(search + " element is present in the array at index "+pos);
// 	}
// }

// WAP to implement Recursive Binary Search by creating a User Defined Function

import java.util.*;
public class Main
{
    static int recBinarySearch(int a[], int search, int l, int h)
    {
        if (l > h)
            return -1;
        int mid;
        
        mid = (l+h)/2;
        if(a[mid] == search)
            return mid;
        else if(a[mid]<search)
            return recBinarySearch(a, search, mid+1, h);
        else 
            return recBinarySearch(a, search, l, mid-1);
        }
	public static void main(String[] args) 
	{
	   int n, i, search;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the number of elements: ");
	   n = sc.nextInt();
	   int arr[] = new int[n];
	   for(i=0;i<n;i++)
		arr[i] = sc.nextInt();
		System.out.println("Enter array is: ");
		for(i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		
		System.out.print("\nEnter the number to be searched: ");
		search = sc.nextInt();
        sc.close();
		int pos = recBinarySearch(arr, search, 0, arr.length-1);

		if(pos==-1)
			System.out.print(search + " element is not present in the array.");
        else
            System.out.print(search + " element is present in the array at index "+pos);
	}
}