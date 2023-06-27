// HashSet - A collection of items where every item is unique and unordered
// import java.util.*;
// import java.util.HashSet;

// import java.util.Iterator;
// class Main
// {
//     public static void main(String[] args) 
//     {
//            HashSet<String> objects = new HashSet<String>();
//            System.out.println(objects);
//            objects.add("Chair");
//            objects.add("Table");
//            System.out.println(objects);
//            objects.add("Sofa");
//            objects.add("Bed");
//            System.out.println(objects);
//            objects.add("TV");
//            objects.add("Utensil");
//            System.out.println(objects);
//            objects.add("Remote");
//            objects.add("Sofa");
//            System.out.println(objects); 
//            System.out.println(objects.contains("Table"));   
//            System.out.println(objects.remove("TV"));  
//            System.out.println(objects);
//         //    objects.clear();  
//         //    System.out.println(objects);   
//         System.out.println(objects.size()); 
//         System.out.println("========================================================"); 
//         // Loop through HashSet -> for-each
//         for (String i : objects)
//         {
//             System.out.println(i);
//         }
//         System.out.println("========================================================"); 
//         // Iterating with a while loop
//         Iterator<String> iterator = objects.iterator();
//         while (iterator.hasNext())
//         {
//             String s = iterator.next();
//             System.out.println(s);
//         }
//         System.out.println(objects); 
//         System.out.println(objects.isEmpty()); 
//     }
// }

import java.util.HashSet;
import java.util.Iterator;
class Main
{
    public static void main(String[] args) 
    {
           HashSet<Integer> set1 = new HashSet<Integer>();
           HashSet<Integer> set2 = new HashSet<Integer>();
        
           set1.add(1); set1.add(2);  set1.add(3);  set1.add(4);
           set2.add(3); set2.add(4);  set2.add(5);  set2.add(6);
           
        //    Union: combine both sets without duplicates
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: "+union);

        //    Intersection: common elements between both sets
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: "+intersection);

        //    Difference: elements in set1 but not in set2
        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: "+difference);
        // Your task to find: set2-set1
        
        //    Symmetric Difference: elements in either set, but not in both
        HashSet<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);
        HashSet<Integer> tempSet = new HashSet<>(set1);
        tempSet.retainAll(set2);
        symmetricDifference.removeAll(tempSet);
        System.out.println("Symmetric Difference: "+symmetricDifference);
    }
}
