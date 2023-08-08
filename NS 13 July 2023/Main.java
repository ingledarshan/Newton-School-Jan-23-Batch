import java.util.Scanner;

class Queue {
    private int front, rear;
    private int[] items;
    private static final int QUEUESIZE = 5;

    public Queue() {
        front = 0;
        rear = -1;
        items = new int[QUEUESIZE];
    }

    public void enqueue(int x, int flag) {
        if (rear == QUEUESIZE - 1) {
            System.out.println("\nQueue Overflow.");
            return;
        }
        if (flag == 0) { // insert at front
            for (int i = rear; i >= front; i--)
                items[i + 1] = items[i];
            items[front] = x;
            rear++;
        } else if (flag == 1) { // insert at rear
            items[++rear] = x;
        } else {
            System.out.println("\nInvalid flag");
            return;
        }
    }

    public void dequeue(int flag) {
        if (rear < front) {
            System.out.println("\nQueue Underflow. Cannot remove.");
            return;
        }
        if (flag == 0) { // remove from front
            System.out.println("\nThe value removed is " + items[front]);
            for (int i = front; i <= rear; i++)
                items[i] = items[i + 1];
            items[rear] = 0; // optional
            rear--;
        } else if (flag == 1) { // remove at rear
            System.out.println("\nThe value removed is " + items[rear]);
            items[rear] = 0;
            rear--;
        } else {
            System.out.println("\nInvalid flag");
            return;
        }
    }

    public void show() {
        if (rear < front) {
            System.out.println("\nQueue Underflow. Cannot remove.");
            return;
        }
        System.out.print("\nQueue from the frontmost element is as shown: ");
        for (int i = front; i <= rear; i++)
            System.out.print(items[i] + " ");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        int x, choice, fg;
        Queue q = new Queue();
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("\n\nMENU");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Show");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("\nEnter the element to be inserted: ");
                    x = scanner.nextInt();
                    System.out.print("Enter flag=0 to insert at front, 1 otherwise: ");
                    fg = scanner.nextInt();
                    q.enqueue(x, fg);
                    q.show();
                    break;
                case 2:
                    System.out.print("\nEnter flag=0 to remove from front, 1 otherwise: ");
                    fg = scanner.nextInt();
                    q.dequeue(fg);
                    q.show();
                    break;
                case 3:
                    q.show();
                    break;
                case 4:
                    System.out.println("\nExit Point.");
                    break;
                default:
                    System.out.println("\nPlease enter correct choice (1, 2, 3, 4).");
            }
        } while (choice != 4);
        scanner.close();
    }
}

// https://my.newtonschool.co/playground/code/l8awfod3m6wd

static void push_back_pb(Deque<Integer> dq, int x)
{
         //Your code
         dq.add(x);
 }
 static void push_front_pf(Deque<Integer> dq, int x)
 {
         // Your code here
         dq.addFirst(x);
 }
 static void pop_back_ppb(Deque<Integer> dq)
 {
        // Your code here
        if(!dq.isEmpty())
                dq.pollLast();
        else return;

 }
static int front_dq(Deque<Integer> dq)
{
         // Your code here
         if(!dq.isEmpty())
                dq.peek();
        else return -1;

}


// https://my.newtonschool.co/playground/code/z6oa8427pl1l

static void circularRotate(Deque<Integer> deq, int d, int n)
    {
        // Push first d elements 
        // from last to the beginning 
        for (int i = 0; i < d%n; i++) { 
            int val = deq.peekLast(); 
            deq.pollLast(); 
            deq.addFirst(val); 
        } 
    }