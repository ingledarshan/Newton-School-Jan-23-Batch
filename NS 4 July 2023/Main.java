//  Dequeue using LinkedList
import java.util.Scanner;
class De {
    Nod front = null;
    Nod rear = null;

    class Nod {
        int data;
        Nod next;

        Nod(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void enq(int data) {
        Nod node = new Nod(data);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }

    void enq_at_end(int data) {
        if (rear == null) {
            enq(data);
            return;
        }
        Nod node = new Nod(data);
        rear.next = node;
        rear = node;
    }

    void deq() {
        if (front == null) {
            System.out.println("Queue is already empty. Cannot delete.");
        } else {
            Nod delete = front;
            front = front.next;
            delete = null;
        }
    }

    void deq_from_end() {
        if (rear == null) {
            System.out.println("Queue is already empty. Cannot delete.");
            return;
        }
        Nod temp = front;
        while (temp.next != rear) {
            temp = temp.next;
        }
        rear = null;
        rear = temp;
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Nod temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        De d = new De();
        int choice, i, n;
        while (true) {
            System.out.println("Menu\n1. Enqueue\n2. Dequeue\n3. Show\n4.Exit\nEnter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number: ");
                    n = sc.nextInt();
                    System.out.println("Enter 0 to insert at start otherwise 1:");
                    i = sc.nextInt();
                    if (i == 0) {
                        d.enq(n);
                    } else {
                        d.enq_at_end(n);
                    }
                    d.display();
                    break;
                case 2:
                    System.out.println("Enter 0 to delete from start otherwise 1:");
                    i = sc.nextInt();
                    if (i == 0) {
                        d.deq();
                    } else {
                        d.deq_from_end();
                    }
                    d.display();
                    break;
                case 3:
                    d.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Please enter correct choice.");
            }
        }
    }
}
