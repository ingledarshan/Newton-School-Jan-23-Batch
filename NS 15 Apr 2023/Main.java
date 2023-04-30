// WAP to implement Quick Sort to sort in Ascending order
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