// // Stack Implementation using Array
// class StackImpl
// {
//     int maxSize, top;
//     int [] stackArray;

//     StackImpl(int size)
//     {
//         maxSize = size; // 5
//         stackArray = new int[maxSize];
//         top = -1;
//     }

//     void push(int value)
//     {
//         if(top == maxSize)
//         {
//             System.out.println("Stack is full. Cannot push element.");
//             return;
//         }
//         stackArray[++top] = value;
//     }

//     int pop()
//     {
//         if(top==-1)
//         {
//             System.out.println("Stack is empty. Cannot pop element.");
//             return -1;
//         }
//         return stackArray[top--];
//     }

//     int peek()
//     {
//         if(top==-1)
//         {
//             System.out.println("Stack is empty. Cannot peek element.");
//             return -1;
//         }
//         return stackArray[top];
//     }

//     void traverse()
//     {
//         if(top == maxSize)
//         {
//             System.out.println("Stack is full. Cannot push element.");
//         }
//         else
//         {
//             for(int i=top; i>=0; i--)
//                 System.out.print(stackArray[i]+" ");
//         }
//     }
// }
// class Main{
//     public static void main(String args[])
//     {
//         StackImpl s = new StackImpl(5);
//         // System.out.println("\n"+s.pop());
//         s.push(10); s.push(20); s.push(30);
//         s.traverse();
//         System.out.println("\n"+s.peek());
//         s.push(100); 
//         s.traverse();
//         System.out.println("\n"+s.peek());
//         System.out.println("\n"+s.top);
//         s.push(200); 
//         System.out.println("\n"+s.top);
//         s.traverse();
//         System.out.println("\n"+s.pop());
//         s.traverse();
//     }
// }

// Stack Implementation using Linked List
class StackLinkedList
    {
        class Node
        {
            int info;
            Node next;
        }

        Node top = null;

        void push(int data)
        {
            Node newNode = new Node();
            newNode.info = data;

            if(top == null)
            {
                newNode.next = null;
                top = newNode;
            }
            else
            {
                newNode.next = top;
                top = newNode;
            }
        }

        int pop()
        {
            if(top == null)
            {
                System.out.println("Stack Underflow. Cannot pop");
                return -1;
            }
            else
            {
                int x = top.info;
                Node p = new Node();
                p = top;
                top = top.next;
                p = null;
                return x;
            }
        }

        int peek()
        {
            if(top == null)
            {
                System.out.println("Stack Underflow. Cannot pop");
                return -1;
            }
            else
            {
                int x = top.info;
                return x;
            }
        }

        void traverse()
        {
            if(top == null)
                System.out.println("Stack Underflow. Cannot traverse.");
            else
            {
                Node p = new Node();
                p = top;
                while(p!=null)
                {
                    System.out.print(p.info+" ");
                    p = p.next;
                }
                System.out.println();
            }
        }
    }

    class Main
    {
        public static void main(String[] args) 
        {
           StackLinkedList s = new StackLinkedList();
           s.traverse();
           s.push(10);
           s.traverse();
           s.push(20); s.push(30); s.push(40); s.push(50); s.push(60);
           s.traverse();
           System.out.println(s.peek());
           System.out.println(s.pop());
           s.traverse();
        }
    }
