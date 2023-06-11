// // ArrayList
// import java.util.*;
// class Main
// {
//     public static void main(String[] args) 
//     {
//         ArrayList <String> list = new ArrayList<String>();
//         list.add("Darshan");
//         list.add("Rahul");
//         list.add("Rohan");
//         System.out.println(list);
//         // If you wish to print one by one, use Iterator class
//         Iterator itr = list.iterator();
//         while(itr.hasNext())
//         {
//             System.out.println(itr.next());
//         }
//     }
// }

    // // LinkedList
    // import java.util.*;
    // class Main
    // {
    //     public static void main(String[] args) 
    //     {
    //         LinkedList <String> list = new LinkedList<String>();
    //         list.add("Darshan");
    //         list.add("SK");
    //         list.add("Rohan");
    //         System.out.println(list);
    //         // If you wish to print one by one, use Iterator class
    //         Iterator <String> itr = list.iterator();
    //         while(itr.hasNext())
    //         {
    //             System.out.println(itr.next());
    //         }
    //     }
    // }


// LinkedList
    import java.util.*;
    class Main
    {
        public static void main(String[] args) 
        {
            LinkedList <String> list = new LinkedList<String>();
            list.add("Darshan");
            list.add("SK");
            list.add("Rohan");
            System.out.println(list);
            // If you wish to print one by one, use Iterator class
            // Iterator <String> itr = list.iterator();
            // while(itr.hasNext())
            // {
            //     System.out.println(itr.next());
            // }
            // Adding element at a specific position
            list.add(1,"Sam");
            System.out.println(list);

            LinkedList <String> l2 = new LinkedList<String>();
            l2.add("Apple");
            l2.add("Samsung");
            System.out.println(l2);

            list.addAll(l2);
            System.out.println(list);
            System.out.println(l2);

            LinkedList <String> l3 = new LinkedList<String>();
            l3.add("Mumbai");
            l3.add("Delhi");
            System.out.println(l3);
            list.addAll(1, l3);
            System.out.println(list);
            System.out.println(l3);
            
            list.addFirst("Newton School");
            System.out.println(list);

            list.addLast("Course Complete");
            System.out.println(list);
        }
    }

    
    // 10,20,30,40,50
    // 10, 15, 20,30,40,50
    // 05, 10, 15, 20, 30, 40, 50
    // 05, 10, 15, 20, 30, 40, 50, 99