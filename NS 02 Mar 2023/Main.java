// https://my.newtonschool.co/playground/code/pb7o53m8f345/

// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//         // Your code here
//         int number;
//         Scanner sc = new Scanner(System.in);
//         number = sc.nextInt();
//         int choice = number%2;
//         switch(choice)
//         {
//             case 0 : System.out.println("Even");
//                      break;
            
//             case 1 : System.out.println("Odd");
//                      break;
//         }
//     }
// }

// https://my.newtonschool.co/playground/code/k92s8wp4tvyz/

// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//         // Your code here
//         char c;
//         Scanner sc = new Scanner(System.in);
//         c = sc.next().charAt(0);

//         if ( (c>='A' && c<='Z') || (c>='a' && c<='z') )
//             System.out.println("YES");
//         else
//             System.out.println("NO");
//     }
// }

// import java.util.*;
// class Main {
//     public static void main (String[] args) 
//     {
//         char c;
//         Scanner sc = new Scanner(System.in);
//         c = sc.next().charAt(1); // D@d
//         System.out.println("Scanned character is: "+c);
//     }
// }

// https://my.newtonschool.co/playground/code/p32uo68ll27f/

// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//         // Your code here
//         int m1, m2, m3, m4, m5;
//         double percentage;
//         Scanner sc = new Scanner(System.in);
//         m1 = sc.nextInt();
//         m2 = sc.nextInt();
//         m3 = sc.nextInt();
//         m4 = sc.nextInt();
//         m5 = sc.nextInt();

//         percentage = ((m1+m2+m3+m4+m5)/500.0)*100; // Dont forget to write 500.0 and not 500

//         if (percentage>=80)
//             System.out.println("A");
//         else if ((percentage<80) && (percentage>=60))
//             System.out.println("B");
//         else if ((percentage<60) && (percentage>=40))
//             System.out.println("C");
//         else
//             System.out.println("D");
//     }
// }


// https://my.newtonschool.co/playground/code/pcwchol3ip01/
// static void numberofdays(int M){
//     //Enter your code here
//     switch(M)
//     {
//         case 1:
//         case 3:
//         case 5:
//         case 7:
//         case 8:
//         case 10:
//         case 12: System.out.println(31); break;
//         case 2: System.out.println(28); break;
//         case 4:
//         case 6:
//         case 9:
//         case 11: System.out.println(30); break;
//     }
//     }

// https://my.newtonschool.co/playground/code/2seiujec4fpj/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++)
        {
            if ( (i%3==0) && (i%5==0) )
                System.out.print("FizzBuzz ");
            else if (i%3==0)
                System.out.print("Fizz ");
            else if (i%5==0)
                System.out.print("Buzz ");
            else
                System.out.print(i+" ");
        }

    }
}


