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


// WAP to implement Linear Search by creating a User Defined Function
// https://www.javatpoint.com/linear-search