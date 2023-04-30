// // WAP to implement Bubble Sort to sort in Ascending order
// import java.util.*;
// public class Main
// {	
// 	static void bubblesort(int arr[])
// 	{
// 		int n = arr.length;
// 		int temp;
// 		for(int i=0; i<n-1; i++)
// 			for(int j=0; j<n-1; j++)
// 				if(arr[j] > arr[j+1])
// 				{
// 					temp = arr[j];
// 					arr[j] = arr[j+1];
// 					arr[j+1] = temp;
// 				}
// 	}

// 	public static void main(String[] args) 
// 	{
// 	   int i, n;
// 	   Scanner sc = new Scanner(System.in);
// 	   System.out.print("Enter the number of elements: ");
// 	   n = sc.nextInt();
// 	   int arr[] = new int[n];
// 	   System.out.print("Enter the elements one by one: ");
// 	   for(i=0;i<n;i++)
// 			arr[i] = sc.nextInt();
// 		System.out.println("Enter array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
		
// 		bubblesort(arr);
// 		System.out.println("\nSorted array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
	   
// 	}
// }

// // WAP to implement Bubble Sort to sort in Descending order
// import java.util.*;
// public class Main
// {	
// 	static void bubblesort(int arr[])
// 	{
// 		int n = arr.length;
// 		int temp;
// 		for(int i=0; i<n-1; i++)
// 			for(int j=0; j<n-1; j++)
// 				if(arr[j] < arr[j+1])
// 				{
// 					temp = arr[j];
// 					arr[j] = arr[j+1];
// 					arr[j+1] = temp;
// 				}
// 	}

// 	public static void main(String[] args) 
// 	{
// 	   int i, n;
// 	   Scanner sc = new Scanner(System.in);
// 	   System.out.print("Enter the number of elements: ");
// 	   n = sc.nextInt();
// 	   int arr[] = new int[n];
// 	   System.out.print("Enter the elements one by one: ");
// 	   for(i=0;i<n;i++)
// 			arr[i] = sc.nextInt();
// 		System.out.println("Enter array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
		
// 		bubblesort(arr);
// 		System.out.println("\nSorted array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
	   
// 	}
// }

// // WAP to implement Bubble SOrt to sort in Ascending order - Optimized
// import java.util.*;
// public class Main
// {	
// 	static void bubblesort(int arr[])
// 	{
// 		int n = arr.length;
// 		int temp;
// 		for(int i=0; i<n-1; i++)
// 			for(int j=0; j<n-i-1; j++)
// 				if(arr[j] > arr[j+1])
// 				{
// 					temp = arr[j];
// 					arr[j] = arr[j+1];
// 					arr[j+1] = temp;
// 				}
// 	}

// 	public static void main(String[] args) 
// 	{
// 	   int i, n;
// 	   Scanner sc = new Scanner(System.in);
// 	   System.out.print("Enter the number of elements: ");
// 	   n = sc.nextInt();
// 	   int arr[] = new int[n];
// 	   System.out.print("Enter the elements one by one: ");
// 	   for(i=0;i<n;i++)
// 			arr[i] = sc.nextInt();
// 		System.out.println("Enter array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
		
// 		bubblesort(arr);
// 		System.out.println("\nSorted array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
	   
// 	}
// }

// https://my.newtonschool.co/playground/code/ngrjod79j0dz/
// import java.util.*;
// public class Main
// {	
// 	static void bubblesort(int arr[])
// 	{
// 		int n = arr.length;
// 		int temp;
// 		for(int i=0; i<n-1; i++)
// 			for(int j=0; j<n-i-1; j++)
// 				if(arr[j] > arr[j+1])
// 				{
// 					temp = arr[j];
// 					arr[j] = arr[j+1];
// 					arr[j+1] = temp;
// 				}
// 	}

// 	public static void main(String[] args) 
// 	{
// 	   int i, n, no_of_cases;
// 	   int arr[];
// 	   Scanner sc = new Scanner(System.in);
// 	   no_of_cases = sc.nextInt();
	   
// 	   for(int k=1;k<=no_of_cases;k++)
// 	   {
// 			n = sc.nextInt();
// 			arr = new int[n];
// 	   		for(i=0;i<n;i++)
// 				arr[i] = sc.nextInt();
// 			bubblesort(arr);
// 			for(i=0;i<n;i++)
// 				System.out.print(arr[i] + " ");
// 		System.out.println();
// 	   }
	   
// 	}
// }

// // WAP to implement Selection Sort to sort in Ascending order
import java.util.*;
public class Main
{	
	static void selectionsort(int arr[])
	{
		int n = arr.length;
		for(int i=0; i<n-1; i++)
		{
			int minIndex = i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) 
	{
	   int i, n;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the number of elements: ");
	   n = sc.nextInt();
	   int arr[] = new int[n];
	   System.out.print("Enter the elements one by one: ");
	   for(i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter array is: ");
		for(i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		
		selectionsort(arr);
		System.out.println("\nSorted array is: ");
		for(i=0;i<n;i++)
			System.out.print(arr[i] + " ");
	   
	}
}