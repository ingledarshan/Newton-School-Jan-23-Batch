// https://my.newtonschool.co/playground/code/v14sd5wqfew3/

// import java.util.*;

// public class Main{
    

//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         String s=sc.next();
// 		String v="";
// 		String oth="";
// 		for(int i=0;i<s.length();i++){
// 			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
// 				v+=s.charAt(i);
// 			}
// 			else{
// 				oth+=s.charAt(i);
// 			}
// 		}
// 		System.out.print(v+oth);
//     }
// }

// https://my.newtonschool.co/playground/code/8h6kmi1e3gc3/

// Way1
// import java.util.*;
// public class Main {
    
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine(); // cat at rat
//         int n=s.length(); 
//         int i=0;
//         int f=1;
//         while(i<n)
//         {
//             char ch = s.charAt(i);
//             if(f==1 && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
//             {
//                 while(i<n)
//                 {
//                     ch = s.charAt(i);
//                     System.out.print(ch);
//                     if(ch == ' ')break;
//                     i++;
//                 }
//             }
//             else f=-1;
//             if(ch == ' ')f=1;
//             i++;
//         }
//     }
//     }

// Way2

// import java.util.*; // contains Collections framework
// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String Str = sc.nextLine(); // the amazing spiderman is good entertainer
//         String[] Arr = Str.split(" ");

        
//         String vowels = "aeiou";
//         for(int i=0; i<Arr.length; i++)
//         {
//             if(vowels.contains(""+Arr[i].charAt(0)))
//             {
//                 System.out.print(Arr[i]+" ");
//             }
//         }
        
//     }
// }

// import java.util.*; // contains Collections framework
// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String Str = sc.nextLine(); // the amazing spiderman is good entertainer
//         System.out.println(Str);
//         String[] Arr = Str.split(" ");
        
//         for(int i=0; i<Arr.length; i++)
//             System.out.println(Arr[i]);
        
//     }
// }

// https://my.newtonschool.co/playground/code/lru5m2oft3w3/
// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//         // Your code here
//         Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt(); 
//       String arr[] = new String[n];
    
//       for(int i=0;i<arr.length;i++)
//         {
//             arr[i] = sc.next();
//         }

//         for(int i=0;i<arr.length;i++)
//         {
//             char first_char = arr[i].charAt(0);
//             String fc = "" + first_char;
//             fc = fc.toUpperCase();
            
//             String rem_str = arr[i].substring(1);
            
//             arr[i] = fc.concat(rem_str);
//              System.out.print(arr[i]+ " ");
//         }
//     }
// }

// https://my.newtonschool.co/playground/code/31ws6mda3q12/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char x = sc.next().charAt(0);
        String s = sc.next();
        String[] strArray = null;  
        strArray = s.split("");  
        int count=0;
        for(int i=0;i<strArray.length; i++)
        {
            System.out.println(strArray[i]+"--->"+x);
            if ((strArray[i]).equals(x))
                {
                    System.out.println("inside if");
                    count++;
                }
        }
        System.out.print(count);
    }
}