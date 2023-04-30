// String
// https://my.newtonschool.co/playground/code/kqo6d5ef9fuz/
// https://my.newtonschool.co/playground/code/zffuaabg48ho/


// String are Immutable i.e. Fixed or Rigid or something which cannot be changed

// class Main
// {
//     public static void main(String[] args)
//     {
//         String s1 = new String("Darshan Ingle");
//         System.out.println(s1);
//     }
// }

// contains() - checks whether the specified string is present in the string or not
// class Main
// {
//     public static void main(String[] args)
//     {
//         String s = new String("Darshan Ingle is a instructor at Newton School");
//         System.out.println(s);
//         boolean b = s.contains("instructor"); // true
//         System.out.println(b);
//         b = s.contains("faculty"); // false
//         System.out.println(b);
//     }
// }

// substring() - extracts a substring from a string and returns it
// class Main
// {
//     public static void main(String[] args)
//     {
//         String s = new String("NS is best");
//         System.out.println(s);
//         System.out.println(s.substring(3,8)); // 3 to (8-1)
//         System.out.println(s.substring(6)); // 6 to last character
//         System.out.println(s.substring(0)); // 0 to last character
//     }
// }

// join() - returns a new string with the given elements joined with 
// the specified delimiter
// class Main
// {
//     public static void main(String[] args)
//     {
//         String s1 = new String("NS");
//         String s2 = new String("is");
//         String s3 = new String("best");
//         System.out.println(s1);
//         System.out.println(s2); 
//         System.out.println(s3); 
//         String s4 = String.join(" ",s1,s2,s3);
//         System.out.println(s4);
//         String s5 = String.join("**",s1,s2,s3);
//         System.out.println(s5);
//     }
// }

// replace() - replace each matching occurence of old text by new text
// class Main
// {
//     public static void main(String[] args)
//     {
//         String s1 = new String("NS was best");
//         System.out.println(s1.replace('w','s'));
//         System.out.println(s1.replace(' ',','));
//         System.out.println(s1.replace("e","k"));
//     }
// }

// charAt() - returns character at a specified position
// class Main
// {
//     public static void main(String[] args)
//     {
//         String s = new String("Darshan");
//         System.out.println(s.charAt(0));
//         System.out.println(s.charAt(2));
//     }
// }

// indexOf() - return the index of the first occurence of the 
// specified character or substring within the string
// class Main
// {
//     public static void main(String[] args)
//     {
//         String s = new String("Darshan");
//         System.out.println(s.indexOf("D"));
//         System.out.println(s.indexOf("a"));
//     }
// }

// class Main
// {
//     public static void main(String[] args)
//     {
//         String s = new String("cat mat rat");
//         System.out.println(s.indexOf("at"));
//         System.out.println(s.indexOf("mat"));
//     }
// }

// https://my.newtonschool.co/playground/code/iqvg5fw7ufcj/
// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//         // Your code here
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         for(int i=(s.length()-1); i>=0; i--)
//             System.out.print(s.charAt(i));
//     }
// }

// https://my.newtonschool.co/playground/code/aivd4t8liz00/
// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//         // Your code here
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();

//         for(int i=0;i<s.length();i++)
//         {
//             if(i%2==0)
//             {
//                 System.out.print(s.charAt(i)+" ");
//             }
//         }
//     }
// }


// https://my.newtonschool.co/playground/code/kqo6d5ef9fuz/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
        // Your code here
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        // System.out.println(s);
        long no = Long.parseLong(s);
        if (no%30==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// question from todays contest accept array and check its 
// element are divisible by int x which is given by user 
// then print how many elements are divisible but you have 
// to print like two,three four not 1,2,3,

public class DivisorCount {

public static String divisor(int N, int X, int[] arr) {

String alpha[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

int count = 0;

for (int i = 0; i < N; i++) {

if (X % arr[i] == 0) {

count++;

}

}

return alpha[count];

}

public static void main(String[] args) {

int[] arr = { 1, 2, 3, 3, 6, 7, 9 };

String str = divisor(arr.length, 6, arr);

System.out.println(str);

}

}