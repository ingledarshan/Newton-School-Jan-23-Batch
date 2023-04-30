// // in class assigmnent
// import java.util.*;
// public class Main
// {	
// 	static int countOnes(int arr[], int n)
// 	{
// 		int l, h, count,m;
// 		l = 0;
// 		h = n-1;
// 		count = 0;

// 		while(l<=h)
// 		{
// 			m = (l+h)/2;
// 			if(arr[m]==1)
// 			{
// 				count += m-l+1;
// 				l = m+1;
// 			}
// 			else if(arr[m]==0)
// 				h = m-1;
// 			else
// 				l = m+1;
// 		}
// 		return count;
// 	}

// 	public static void main(String[] args) 
// 	{
// 	   int i, n, no_of_inputs;
// 	   Scanner sc = new Scanner(System.in);
// 	   no_of_inputs = sc.nextInt();
// 	   for(int noi = 1; noi<=no_of_inputs; noi++)
// 	   {
// 	   System.out.print("Enter the number of elements: ");
// 	   n = sc.nextInt();
// 	   int arr[] = new int[n];
// 	   System.out.print("Enter the elements one by one: ");
// 	   for(i=0;i<n;i++)
// 			arr[i] = sc.nextInt();
// 		System.out.println("Enter array is: ");
// 		for(i=0;i<n;i++)
// 			System.out.print(arr[i] + " ");
		
// 		int cnt = countOnes(arr, n);
// 		System.out.print("\nCount of 1's are "+ cnt);
// 	   }
// 	}
// }

// Arena
// https://my.newtonschool.co/playground/code/phdygeijilmh/

// in class assigmnent
// import java.util.*;
// public class Main
// {	
// 	static int countOnes(int arr[], int n)
// 	{
// 		int l, h, count,m;
// 		l = 0;
// 		h = n-1;
// 		count = 0;

// 		while(l<=h)
// 		{
// 			m = (l+h)/2;
// 			if(arr[m]==1)
// 			{
// 				count += m-l+1;
// 				l = m+1;
// 			}
// 			else if(arr[m]==0)
// 				h = m-1;
// 			else
// 				l = m+1;
// 		}
// 		return count;
// 	}

// 	public static void main(String[] args) 
// 	{
// 	   int i, n, no_of_inputs;
// 	   Scanner sc = new Scanner(System.in);
// 	   no_of_inputs = sc.nextInt();
// 	   for(int noi = 1; noi<=no_of_inputs; noi++)
// 	   {
// 	   n = sc.nextInt();
// 	   int arr[] = new int[n];
// 	   for(i=0;i<n;i++)
// 			arr[i] = sc.nextInt();
		
// 		int cnt = countOnes(arr, n);
// 		System.out.println(cnt);
// 	   }
// 	}
// }


// import java.util.*;
// public class Main
// {	
// 	static boolean checkIfExists(int A[])
// 	{
// 		for(int i=0; i<A.length; i++)
// 			for(int j=i+1; j<A.length; j++)
// 				if(A[i]==2*A[j] || A[j]==2*A[i])
// 					return true;
// 		return false;
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
		
// 		boolean b = checkIfExists(arr);
// 		if (b==true)
// 			System.out.println("YES");
// 		else
// 		System.out.println("NO");

// 	}
// }

// https://my.newtonschool.co/playground/code/udpf7uk7tesb/

import java.util.*;
public class Main
{	
	static boolean checkIfExists(int A[])
	{
		for(int i=0; i<A.length; i++)
			for(int j=i+1; j<A.length; j++)
				if(A[i]==2*A[j] || A[j]==2*A[i])
					return true;
		return false;
	}

	public static void main(String[] args) 
	{
	   int i, n;
	   Scanner sc = new Scanner(System.in);
	   n = sc.nextInt();
	   int arr[] = new int[n];
	   for(i=0;i<n;i++)
			arr[i] = sc.nextInt();
		boolean b = checkIfExists(arr);
		if (b==true)
			System.out.println("YES");
		else
		System.out.println("NO");

	}
}