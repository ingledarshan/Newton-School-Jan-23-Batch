// // Queue Implementation using Array
// class QueueArray
// {
//     int[] q;
//     int front, rear, QUEUESIZE;

//     QueueArray(int size)
//     {
//         QUEUESIZE = size;
//         q = new int[QUEUESIZE];
//         front = 0;
//         rear = -1;
//     }

//     void enqueue(int data)
//     {
//         if(rear==(QUEUESIZE-1))
//             System.out.println("Queue is full. Cannot enqueue.");
//         else
//             q[++rear] = data;
//     }

//     // int dequeue() // no shofting
//     // {
//     //     if(rear < front)
//     //         {
//     //             System.out.println("Queue is empty. Cannot remove.");
//     //             return -1;
//     //         }
//     //     else
//     //         return q[front++];
//     // }

//     int dequeue() // shifting the values
//     {
//         if(rear < front)
//             {
//                 System.out.println("Queue is empty. Cannot remove.");
//                 return -1;
//             }
//         else
//             {
//                 int x = q[front];
//                 for(int i=(front+1); i<= rear; i++)
//                     q[i-1] = q[i];
//                 rear = rear-1;
//                 return x;
//             }
//     }

//     void display()
//     {
//         if(rear < front)
//             {
//                 System.out.println("Queue is empty. Cannot remove.");
//             }
//         System.out.println(); 
//         for(int i=front; i<=rear; i++)
//             System.out.print(q[i]+" ");
//     }
// }

// class Main
// {
//     public static void main(String[] args)
//     {
//         QueueArray q = new QueueArray(5);
//         q.display();
//         q.enqueue(10);
//         q.display();
//         q.enqueue(20);  q.enqueue(30);  q.enqueue(40);
//         q.display();
//         q.dequeue();
//         q.display();
//         q.dequeue();
//         q.dequeue();
//         q.display();
//         q.dequeue();
//         q.display();
//         q.enqueue(10);
//         q.display();
//         q.enqueue(22);
//         q.display();
//     }
// }


// // Queue Implementation using LinkedList
// class QueueUsingLinkedList
//     {
//         class Node
//         {
//             int info;
//             Node next;
//         }

//         Node front = null;
//         Node rear = null;

//         void enqueue(int data)
//         {
//             Node newNode = new Node();
//             newNode.info = data;
//             newNode.next = null;

//             if(front == null)
//             {
//                 front = newNode;
//                 rear = newNode;
//             }
//             else
//             {
//                 Node p = rear;
//                 p.next = newNode;
//                 rear = newNode;
//             }
//         }

//         void dequeue()
//         {
//             if(front==null)
//             {
//                 System.out.println("Queue empty. Cannot delete.");
//             }
//             else
//             {
//                 Node p;
//                 p = front;
//                 front = front.next;
//                 p = null;
//             }
//         }

//         void traverse()
//         {
//             if(front==null)
//             {
//                 System.out.println("Queue empty. Cannot traverse.");
//             }
//             else
//             {
//                 Node p = front;
//                 while(p!=null)
//                 {
//                     System.out.print(p.info+" ");
//                     p = p.next;
//                 }
//                 System.out.println();
//             }
//         }
// }

//     class Main
//     {
//         public static void main(String[] args) 
//         {
//            QueueUsingLinkedList q = new QueueUsingLinkedList();
//            q.dequeue();
//            q.traverse();
//            q.enqueue(10);
//            q.traverse();
//            q.enqueue(20);   q.enqueue(30);  q.enqueue(40);
//            q.traverse();
//            q.dequeue();
//            q.traverse();
//         }
//     }

// https://www.javatpoint.com/implementation-of-queue-using-stacks
// Implementation of Queue using Stacks - IMP FOR INTERVIEWS

import java.util.*; 
public class Main {
  static class Queue {
      static Stack<Integer> s1 = new Stack<>();
      static Stack<Integer> s2 = new Stack<>(); 
      public static boolean isEmpty() {
          return s1.isEmpty();
      }
      public static void add(int data) {
          while(!s1.isEmpty()) {
              int v = s1.pop();
              s2.push(v);
          }
          s1.push(data);
          while(!s2.isEmpty()) {
            int v = s2.pop();
              s1.push(v);
          }
      } 
      public static int remove() {
          return s1.pop();
      }
      public static int peek() {
          return s1.peek();
      }
  }
  public static void main(String args[]) {
      Queue q = new Queue();
      q.add(1);
      q.add(2);
      q.add(3);
      while(!q.isEmpty()) {
          System.out.println(q.peek());
          q.remove();
      }
  }
}