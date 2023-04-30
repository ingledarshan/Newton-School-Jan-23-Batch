// String
// https://my.newtonschool.co/playground/code/kqo6d5ef9fuz/
// https://my.newtonschool.co/playground/code/zffuaabg48ho/


// compareTo() - compares two strings lexicographically (in the dictionary order).
// 0 - it means strings are equal
// negative value - if s1<s2
// positive value - is s1>s2
// class Main
// {
//     public static void main(String[] args)
//     {
//         String s1 = "apple";
//         String s2 = "banana";
//         int res;
//         res = s1.compareTo(s2);
//         System.out.println(res);
//     }
// }

// class Main
// {
//     public static void main(String[] args)
//     {
//         String s1 = "banana";
//         String s2 = "apple";
//         int res;
//         res = s1.compareTo(s2);
//         System.out.println(res);
//     }
// }

// class Main
// {
//     public static void main(String[] args)
//     {
//         String s1 = "apple";
//         String s2 = "apple";
//         int res;
//         res = s1.compareTo(s2);
//         System.out.println(res);
//     }
// }

// class Main
// {
//     public static void main(String[] args)
//     {
//         String s1 = "apple";
//         String s2 = "cat";
//         int res;
//         res = s1.compareTo(s2);
//         System.out.println(res);
//     }
// }

// class Main
// {
//     public static void main(String[] args)
//     {
//         String s1 = "apple";
//         // String s2 = "apple";
//         String s2 = "pineapple";
//         int res;
//         res = s1.compareTo(s2);
//         if (res==0)
//             System.out.println("Strings are equal.");
//         else
//             System.out.println("Strings are not equal.");
//     }
// }

// trim() - removes leading(starting) and trailing(ending) whitespaces

// class Main
// {
//     public static void main(String[] args)
//     {
//         String s1 = "        apple         ";
//         System.out.println(s1);
//         System.out.println(s1.trim());
//     }
// }


// split() - divides the string at specified regex
// class Main
// {
//     public static void main(String[] args)
//     {
//         String s1 = "An apple a day keeps the doctor away.";
//         System.out.println(s1);
//         String arr[] = s1.split(" ");
//         for(String str : arr)
//         {
//             System.out.print(str + ", ");
//         }
//     }
// }

// class Main
// {
//     public static void main(String[] args)
//     {
//         String s1 = "An apple a day keeps the doctor away.";
//         System.out.println(s1);
//         String arr[] = s1.split(" ");
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.println(arr[i]);
//         }

//     }
// }

// concat vs join

// class Main{  
//     public static void main(String args[]){  
//       String s1="Sachin ";  
//       String s2="Tendulkar";  
//       String s3=s1.concat(s2);  
//       System.out.println(s3);//Sachin Tendulkar 
      
//     String joinString1=String.join("-",s1,s2);  
//     System.out.println(joinString1);  

//      }  
//    } 

import java.util.*;
class Main{  
    public static void main(String args[])
    {  
      Scanner sc = new Scanner(System.in);
      int num_of_words = sc.nextInt(); // 4
      String arr[] = new String[num_of_words];
    //   System.out.println(num_of_words);
      for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.next();
        }

        for(int i=0;i<arr.length;i++)
        {
            char first_char = arr[i].charAt(0);
            String fc = "" + first_char;
            fc = fc.toUpperCase();
            // System.out.println(fc);
            String rem_str = arr[i].substring(1);
            // System.out.println(rem_str);
            arr[i] = fc.concat(rem_str);
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
     }  
   } 

