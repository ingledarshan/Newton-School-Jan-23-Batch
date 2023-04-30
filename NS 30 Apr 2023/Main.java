// WAP to find the sum of series
// 1, 3, 6, 10, ... (Triangular Numbers)
// import java.util.Scanner;

// public class Main {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter n: ");
//       int n = sc.nextInt();
//       int sum = 0;
//       for(int i=1; i<=n; i++)
//       {
//          sum = sum+i;
//          System.out.print(sum+" ");
//       }
//    }
// }

// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         long sum = 0;
//         for (int i = 1; i <= n; i++) {
//             sum = i * (i + 1) / 2;
//             System.out.print(sum + " ");
//         }
// 	}
// }

// Sum of the above traingular series

// import java.util.Scanner;
// public class Main {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter n: ");
//       int n = sc.nextInt();
//       int sum = 0;
//       int total = 0;
//       for(int i=1; i<=n; i++)
//       {
//          sum = sum+i;
//          System.out.print(sum+" ");
//          total += sum;
//       }
//       System.out.println();
//       System.out.print(total);
//    }
// }

// Sum of the series 1 + x/1 + x^2/2 + x^3/3 + ... + x^n/n
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		double x = sc.nextDouble();
// 		double sum = 1;
// 		for(int i=1; i<=n; i++){
// 		    sum += Math.pow(x,i)/i;
// 		}
// 		System.out.print(sum);
// 	}
// }


// Sum of series (n/1) + (n/2) + (n/3) + (n/4) + ... + (n/n)
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = sc.nextInt();
      double sum = 0;
      for(int i=1; i<=n; i++)
      {
         sum += n*1.0/i;
      }
        System.out.print(sum);
   }
}
