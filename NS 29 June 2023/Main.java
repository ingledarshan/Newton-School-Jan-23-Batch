// // Queue
// import java.util.*;
// class Main
// {
//     public static void main(String[] args)
//     {
//         Queue<Integer> q = new LinkedList<Integer>();
//         System.out.println(q);
//         System.out.println("Poll(): Returned head of the queue: "+q.poll());
//         // System.out.println("Poll(): Returned head of the queue: "+q.remove()); //java.util.NoSuchElementException
//         q.add(10);  q.add(20);  q.add(30);  q.add(40);  q.offer(50);
//         System.out.println(q);
//         System.out.println("Element removed from queue: "+q.remove());
//         System.out.println(q);
//         System.out.println("Poll(): Returned head of the queue: "+q.poll());
//         System.out.println(q);
//         System.out.println("Peek(): Returned head of the queue: "+q.peek());
//         System.out.println(q);
//         q.add(60);  q.add(70);
//         System.out.println(q);

//         // Traversing using Iterator
//         Iterator iterator = q.iterator();
//         while(iterator.hasNext())
//         {
//             System.out.println(iterator.next()+" ");
//         }
//     }
// }

// Queue Implementation using Array
class QueueArray
{
    int[] q;
    int front, rear, QUEUESIZE;

    QueueArray(int size)
    {
        QUEUESIZE = size;
        q = new int[QUEUESIZE];
        front = 0;
        rear = -1;
    }

    void enqueue(int data)
    {
        if(rear==(QUEUESIZE-1))
            System.out.println("Queue is full. Cannot enqueue.");
        else
            q[++rear] = data;
    }

    int dequeue()
    {
        if(rear < front)
            {
                System.out.println("Queue is empty. Cannot remove.");
                return -1;
            }
        else
            return q[front++];
    }

    void display()
    {
        if(rear < front)
            {
                System.out.println("Queue is empty. Cannot remove.");
            }
        System.out.println(); 
        for(int i=front; i<=rear; i++)
            System.out.print(q[i]+" ");
    }
}

class Main
{
    public static void main(String[] args)
    {
        QueueArray q = new QueueArray(5);
        q.display();
        q.enqueue(10);
        q.display();
        q.enqueue(20);  q.enqueue(30);  q.enqueue(40);
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(10);
        q.display();
        q.enqueue(22);
    }
}
