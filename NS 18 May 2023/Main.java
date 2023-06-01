// Java program to illustrate
// bitwise operators

// public class Main {
// 	public static void main(String[] args)
// 	{
// 		// Initial values
// 		int a = 5;

// 		// bitwise not
// 		// ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
// 		// will give 2's complement (32 bit) of 5 = -6
// 		System.out.println("~a = " + ~a);
// 	}
// }


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         boolean isPrime = true;
//         if (number <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i <= Math.sqrt(number); i++) {
//                 if (number % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         if (isPrime) {
//             System.out.println(number + " is a prime number.");
//         } else {
//             System.out.println(number + " is not a prime number.");
//         }
//     }
// }

// Quick Sort
// Code by ChatGPT
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        System.out.println("Sorted array:");
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            while (i <= j && arr[i] <= pivot)
                i++;
            while (i <= j && arr[j] > pivot)
                j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}

// Quick Sort - code by Darshan
import java.util.*;
public class Main
{	
	static void swap(int a[], int x, int y)
	{
		int temp;
		temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	static int partition(int a[], int lb, int ub)
	{
		int pivot = a[lb];
		int start = lb;
		int end = ub;
		while(start<end)
		{
			while(a[start]<=pivot && start<ub)
				start++;
			while(a[end]>pivot)
				end--;
			if(start<end)
				swap(a, start, end);
		}
		swap(a, lb, end);
		return end;
	}
	
	static void quicksort(int a[], int lb, int ub)
	{
		if(lb<ub)
		{
			int loc = partition(a,lb,ub);
			quicksort(a, lb, loc-1);
			quicksort(a,loc+1,ub);
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
		
		quicksort(arr,0,n-1);
		System.out.println("\nSorted array is: ");
		for(i=0;i<n;i++)
			System.out.print(arr[i] + " ");
	   
	}
}