// WAP to implement Selection Sort to sort in Ascending order
// import java.util.*;
// public class Main
// {	
// 	static void selectionsort(int arr[])
// 	{
// 		int n = arr.length;
// 		for(int i=0; i<n-1; i++)
// 		{
// 			int minIndex = i;
// 			for(int j=i+1; j<n; j++)
// 			{
// 				if(arr[j] < arr[minIndex])
// 					minIndex = j;
// 			}
// 			int temp = arr[minIndex];
// 			arr[minIndex] = arr[i];
// 			arr[i] = temp;
// 		}
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
		
// 		selectionsort(arr);
// 		System.out.println("\nSorted array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
	   
// 	}
// }

// Yogesh
// class Main {

// 	public static int linearSearch(String[] menu, String favourite) {
// 		for (int i = 0; i < menu.length; i++) {

// 			if (menu[i] == favourite) {

// 				return i;

// 			}
// 		}
// 		return -1;
// 	}

// 	public static void main(String args[]) {

// 		String[] menu = { "samosa", "dosa", "idli", "coke", "fruiti", "noodles" };

// 		String favourite = "dosa";

// 		int index = linearSearch(menu, favourite);

// 		if (index == -1) {

// 			System.out.print("Not found");

// 		} else {

// 			System.out.print("Favourite item is at index : " + index);

// 		}

// 	}

// }


// WAP to implement Insertion Sort to sort in Ascending order
import java.util.*;
public class Main
{	
	static void insertionsort(int arr[])
	{
		
		for(int i=1; i<arr.length; i++)
		{
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
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
		
		insertionsort(arr);
		System.out.println("\nSorted array is: ");
		for(i=0;i<n;i++)
			System.out.print(arr[i] + " ");
	   
	}
}