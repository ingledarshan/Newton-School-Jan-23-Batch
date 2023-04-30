// Given a positive decimal number, find the simple exponential notation of the given number.
// Input: 100, Output: 1E2

// import java.util.*;
// public class Main
// {
//     public static void main(String[] args) 
//     {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter a decimal number:");
//       double no = sc.nextDouble();
//       System.out.printf("Exponential notation of %f is %e",no, no);
//     }
// }

// Check whether a number can be expressed as a power of k, and if yes, then to what
// power should k be raised to make it n.
// Input: n=16, k=2
// Output: yes : 4
// Input: n=27, k=3
// Output: yes : 3
// Input: n=20, k=5
// Output: no


// import java.util.*;
// public class Main
// {
//     public static void main(String[] args) 
//     {
//       int n, k, copy;
//       // n=16;
//       // k=2;
//       n=20;
//       copy=n;
//       k=5;
//       int p=0; // it will keep track of exponent k should be raised to what
//       while(n>1)
//       {
//         if (n%k != 0)
//         {
//           System.out.println(copy+" is not a power of "+k);
//           return;
//         }
//         n = n/k;
//         p++;
//       }
//       System.out.println(k+"^"+p+" = "+(int)Math.pow(k,p));
//     }
// }


// Check if the number is palindrome or not in Octal.


import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an Decimal Number: ");
      int number = sc.nextInt();
      String octalString = Integer.toString(number, 8); // Decimal to Octal directly
      System.out.println("octalString: "+octalString);
      String reverseString = new StringBuilder(octalString).reverse().toString();
      System.out.println("reverseString: "+reverseString);
      
      if(octalString.equals(reverseString))
        System.out.println(number+" is a palindrome in Octal.");
      else
        System.out.println(number+" is not a palindrome in Octal.");
    }
}
