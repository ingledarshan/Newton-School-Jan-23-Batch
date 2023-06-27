// HashMap
// import java.util.*;
// import java.util.HashMap;
// import java.util.Iterator;
// class Main
// {
//     public static void main(String[] args) 
//     {
//        HashMap<String, String> lovers = new HashMap<String, String>();

//        lovers.put("Romeo", "Juliet");
//        lovers.put("Aamir Khan", "Juhi Chawla");
//        lovers.put("Professor", "Neha");
//        lovers.put("Naruto","Hinata");
//        System.out.println(lovers); 
//        System.out.println(lovers.get("Aamir Khan")); 
//        lovers.remove("Professor");
//        System.out.println(lovers); 
//     //    lovers.clear();
//     //    System.out.println(lovers); 
//     System.out.println(lovers.size()); 
//     // Loop
//     for(String i : lovers.keySet())
//     {
//         System.out.println(i); 
//     }
//     // Loop
//     for(String i : lovers.values())
//     {
//         System.out.println(i); 
//     }
//     System.out.println(lovers); 
//     lovers.put("Aamir Khan", "Kiran Rao"); // replace
//     System.out.println(lovers); 

//     if(lovers.containsKey("romeo"))
//         System.out.println("key is present");
//     else
//         System.out.println("key is not present");
//     }
// }


// import java.util.HashMap;
// import java.util.Iterator;
// class Main
// {
//     public static void main(String[] args) 
//     {
//        HashMap<String, Integer> lovers = new HashMap<String, Integer>();

//        lovers.put("Romeo", 65);
//        lovers.put("Aamir Khan", 60);
//        lovers.put("Professor", 30);
//        lovers.put("Naruto",21);
//        System.out.println(lovers); 
//        System.out.println(lovers.get("Aamir Khan")); 
//        lovers.remove("Professor");
//        System.out.println(lovers); 
//     //    lovers.clear();
//     //    System.out.println(lovers); 
//     System.out.println(lovers.size()); 
//     // Loop
//     for(String i : lovers.keySet())
//     {
//         System.out.println(i+" "+lovers.get(i)); 
//     }
// }
// }

// https://my.newtonschool.co/playground/code/lhszd6oden6r
// My code
import java.util.*;
class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        int [] occurences = new int[26];

        for(char c : input.toCharArray())
        {
            if(c >= 'a' && c <= 'z')
                occurences[c - 'a']++;
        }

        for(int count : occurences)
        {
            System.out.print(count + " ");
        }
}
}

// Arena
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        int [] occurences = new int[26];

        for(char c : input.toCharArray())
        {
            if(c >= 'a' && c <= 'z')
                occurences[c - 'a']++;
        }

        for(int count : occurences)
        {
            System.out.print(count + " ");
        }
}
}