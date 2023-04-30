// https://my.newtonschool.co/playground/code/ponlj5uilwic/

// import java.util.*;
// public class Main
// {
//     public static void main(String[] args) 
//     {
//       Scanner sc = new Scanner(System.in);
//       // read number of test cases
//       int t = sc.nextInt();

//       for(int i=0; i<t; i++)
//       {
//         int A = sc.nextInt();
//         int B = sc.nextInt();

//         int remainder = B%A;
//         if (remainder==0)
//         {
//           System.out.println("YES");
//         }
//         else
//         {
//           // Find the smallest integer X such that (B+X) is divisible by A
//           // int X = A - remainder;
//           if ((B-A)>=A)
//             System.out.println("YES");
//           else
//             System.out.println("NO");
//         }
//       }
//     }
// }

// https://my.newtonschool.co/playground/code/p8h7lyuwfog8/
// import java.util.Scanner;

// public class Main {
//    public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);

//       int a = input.nextInt();
//       int b = input.nextInt();
//       int c = input.nextInt();


//       // Check if a is the sum of b and c
//       if ((b + c == a) || (a+c) == b || (a+b == c))
//          System.out.println("YES");
//       else
//          System.out.println("NO");
//    }
// }

// WAP to convert a binary number to a hexadecimal number.

// import java.util.Scanner;

// public class Main {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter a binary number:");
//       String bin = sc.nextLine();

//     int dec = Integer.parseInt(bin, 2);
//     String hex = Integer.toHexString(dec);
//     System.out.println("Hexadecimal equivalent: "+hex.toUpperCase());
//    }
// }

// WAP to find the sum of series
// 1^2 + 3^2 + 5^2 + ... + (2^n-1)^2
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = sc.nextInt();
      int sum = 0;

      for(int i=1; i <= (2^n-1); i+=2)
        sum = sum + i*i;
      
    System.out.println("Sum of the series is: "+sum);
   }
}