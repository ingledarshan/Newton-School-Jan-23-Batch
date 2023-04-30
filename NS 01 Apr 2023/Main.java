// WAP to calculate factorial of a number using recursion
// import java.util.*;
// public class Main
// {
// 	static int factorial(int n)
// 	 {
// 	   if (n==0)
// 	       return 1;
// 	   else
// 	       return n*factorial(n-1);
// 	 }
	
// 	public static void main(String[] args) 
// 	{
// 	   int f, n;
// 	   Scanner sc = new Scanner(System.in);
// 	   n = sc.nextInt();
// 	   f = factorial(n);
// 	   System.out.println("Factorial of "+n+" is "+f);
	    
	    
// 	}
// }

// WAP to calculate nCr
// import java.util.*;
// public class Main
// {
// 	static int factorial(int n)
// 	 {
// 	   if (n==0)
// 	       return 1;
// 	   else
// 	       return n*factorial(n-1);
// 	 }
	
// 	public static void main(String[] args) 
// 	{
// 	   int n, r, nCr;
// 	   Scanner sc = new Scanner(System.in);
// 	   n = sc.nextInt();
// 	   r = sc.nextInt();
// 	   nCr = (factorial(n)) / ( factorial(n-r)*factorial(r) );
// 	   System.out.println("nCr is "+nCr);
	    
	    
// 	}
// }

// // Print n terms of FB Series without recursion
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) 
// 	{
// 	   int n1=0, n2=1, n3, i, no_of_terms;
// 	   Scanner sc = new Scanner(System.in);
// 	   no_of_terms = sc.nextInt(); // 10
	   
// 	   System.out.print(n1 + " " + n2);

// 	   for(i=2;i<no_of_terms;i++)
// 	   {
// 			n3 = n1+n2;
// 			System.out.print(" " + n3);
// 			n1=n2;
// 			n2=n3;
// 	   }
// 	}
// }

// // Print n terms of FB Series with recursion
// import java.util.*;
// public class Main
// {
// 	static int fibo(int n)
// 	{
// 		if (n<3)
// 			return (n-1);
// 		else
// 			return fibo(n-1)+fibo(n-2);
// 	}
	
// 	public static void main(String[] args) 
// 	{
// 	   int i, no_of_terms;
// 	   Scanner sc = new Scanner(System.in);
// 	   no_of_terms = sc.nextInt(); // 5
// 	   int res;
// 	   for(i=1;i<=no_of_terms;i++)
// 	   {
// 			res = fibo(i);
// 			System.out.print(res + " ");
// 	   }  
// 	}
// }

// Print n terms of FB Series with recursion - printing intermediate 
// results (just for looking at output)
import java.util.*;
public class Main
{
	static int fibo(int n)
	{
		if (n<3)
		{
			System.out.println("Boundary condition called: fibo of "+(n-1));
			return (n-1);
		}
		else
			{
				System.out.println("Recursive condition called: fibo of "+(n-1)+" "+(n-2));
				return fibo(n-1)+fibo(n-2);
			}
	}
	
	public static void main(String[] args) 
	{
	   int i, no_of_terms;
	   Scanner sc = new Scanner(System.in);
	   no_of_terms = sc.nextInt(); // 5
	   sc.close();
	   int res;
	   for(i=1;i<=no_of_terms;i++)
	   {
			res = fibo(i);
			System.out.print(res + " ");
	   }  
	}
}