// // LinkedList
//     import java.util.*;
//     class Main
//     {
//         public static void main(String[] args) 
//         {
//             LinkedList <String> list = new LinkedList<String>();
//             list.add("Darshan");
//             list.add("SK");
//             list.add("Rohan");
//             System.out.println(list);
//             // If you wish to print one by one, use Iterator class
//             // Iterator <String> itr = list.iterator();
//             // while(itr.hasNext())
//             // {
//             //     System.out.println(itr.next());
//             // }
//             // Adding element at a specific position
//             list.add(1,"Sam");
//             System.out.println(list);

//             LinkedList <String> l2 = new LinkedList<String>();
//             l2.add("Apple");
//             l2.add("Samsung");
//             System.out.println(l2);

//             list.addAll(l2);
//             System.out.println(list);
//             System.out.println(l2);

//             LinkedList <String> l3 = new LinkedList<String>();
//             l3.add("Mumbai");
//             l3.add("Delhi");
//             System.out.println(l3);
//             list.addAll(1, l3);
//             System.out.println(list);
//             System.out.println(l3);
            
//             list.addFirst("Newton School");
//             System.out.println(list);

//             list.addLast("Course Complete");
//             System.out.println(list);
//             list.removeAll(l2);
//             System.out.println(list);
//             list.removeFirst();
//             System.out.println(list);
//             list.removeLast();
//             System.out.println(list);
//             // list.clear();
//             // System.out.println(list);
//             // Reverse the list of elements
//             Iterator itr = list.descendingIterator();
//             while(itr.hasNext())
//             {
//                 System.out.println(itr.next());
//             }
//             LinkedList <String> list_rev = new LinkedList<String>();
//             Iterator itr1 = list.descendingIterator();
//             while(itr1.hasNext())
//             {
//                 list_rev.add((itr1.next().toString()));
//             }
//             System.out.println(list_rev);

//             Collections.sort(list);
//             System.out.println(list);
//         }
//     }


// // LinkedList Book Example:
// import java.util.*;

// class Book
// {
//     int id;
//     String name, author, publisher;
//     int quantity;

//     Book(int id, String name, String author, String publisher, int quantity)
//     {
//         this.id = id;
//         this.name = name;
//         this.author = author;
//         this.publisher = publisher;
//         this.quantity = quantity;
//     }
// }

// class Main
//     {
//         public static void main(String[] args) 
//         {
//             // LinkedList <String> list = new LinkedList<String>();
//             Book b1 = new Book(101, "C Programming", "Yashwant Kanetkar", "BPB", 8);
//             Book b2 = new Book(102, "C++ Programming", "Forouzan", "ABC", 4);
//             Book b3 = new Book(103, "Java Programming", "Schildth", "BPB", 6);
//             List <Book> list = new LinkedList<Book>();
//             list.add(b1);
//             list.add(b2);
//             list.add(b3);
//             System.out.println(list);
//             // Traversing list
//             for(Book b:list)
//             {
//                 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
//             }
//         }
//     }

