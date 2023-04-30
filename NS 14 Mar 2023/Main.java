// // Equilateral Triangle pattern - Way1
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int n, i, j;
//         System.out.print("Enter n: ");
//         n = sc.nextInt();
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=(n-i);j++)
//                 System.out.print(" ");
//             for(j=1;j<=i;j++)
//                 System.out.print("*");
//             for(j=1;j<=(i-1);j++)
//                 System.out.print("*");
//             System.out.println();
//         }
//     }
// }

// // Equilateral Triangle pattern - Way2
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int n, i, j;
//         System.out.print("Enter n: ");
//         n = sc.nextInt();
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=(n-i);j++)
//                 System.out.print(" ");
//             for(j=1;j<=(2*i-1);j++)
//                 System.out.print("*");
//             System.out.println();
//         }
//     }
// }


// // Equilateral Triangle pattern - Way3
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int n, i, j;
//         System.out.print("Enter n: ");
//         n = sc.nextInt();
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=(i-1);j++)
//                 System.out.print(" ");
//             for(j=1;j<=(n-i);j++)
//                 System.out.print("*");
//             for(j=1;j<=(n-i+1);j++)
//                 System.out.print("*");   
//             System.out.println();
//         }
//     }
// }

// Diamond  pattern
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int n, i, j;
//         System.out.print("Enter n: ");
//         n = sc.nextInt();

//         // Upper Triangle
//         for(i=1;i<=n;i++)
//         {
//             for(j=1;j<=(n-i);j++)
//                 System.out.print(" ");
//             for(j=1;j<=i;j++)
//                 System.out.print("*");
//             for(j=1;j<=(i-1);j++)
//                 System.out.print("*");
//             System.out.println();
//         }

//         // Lower Triangle
//         for(i=1;i<=(n-1);i++)
//         {
//             for(j=1;j<=i;j++)
//                 System.out.print(" ");
//             for(j=1;j<=(n-i);j++)
//                 System.out.print("*");
//             for(j=1;j<=(n-i-1);j++)
//                 System.out.print("*");
//             System.out.println();
//         }
//     }
// }

// Pending in class assignments
// https://my.newtonschool.co/playground/code/qb3k2og0tpjs/
// https://my.newtonschool.co/playground/code/xdif8io4lqka/
// https://my.newtonschool.co/playground/code/mjvhfd42nojh/
// ArrayList
import java.util.ArrayList;
import java.util.Comparator;
public class Main
{
	public static void main(String[] args) 
    {
        ArrayList<String> students = new ArrayList<>();
        // add element to the arraylist
        // System.out.println(students);
        students.add("Siri");
        // System.out.println(students);
        students.add("Arunangshu");
        // System.out.println(students);
        students.add("Shubham");
        // System.out.println(students);
        students.add(0, "Lohit");
        // System.out.println(students);
        students.add(2, "Darshan");
        System.out.println(students);
        // Access the element in the arraylist
        System.out.println("String at index 2 is: "+ students.get(2));
        System.out.println("String at index 0 is: "+ students.get(0));
        // change arraylist elements
        students.set(0, "Yogesh");
        System.out.println(students);
        // remove an element from arraylist
        students.remove(2);
        System.out.println(students);
        // students.removeAll(students);
        // System.out.println(students);
        // get the number of elements present in the arraylist
        System.out.println(students.size());
        students.sort(Comparator.naturalOrder());
        System.out.println(students);
        students.sort(Comparator.reverseOrder());
        System.out.println(students);
    }
}