// Doubly Linked List
class DoublyLinkedList
    {
        class Node
        {
            int info;
            Node next;
            Node prev;
        }

        Node Begin = null;
        Node End = null;

        void insert_right_end(int data)
        {
            Node newNode = new Node();
            newNode.info = data;

            if (Begin == null)
            {
                Begin = newNode;
                End = newNode;
                newNode.prev = null;
                newNode.next = null;
            }
            else
            {
                Node p;
                p = End;
                newNode.next = null;
                newNode.prev = p;
                p.next = newNode;
                End = newNode;
            }
        }

        void insert_left_end(int data)
        {
            Node newNode = new Node();
            newNode.info = data;

            if (Begin == null)
            {
                Begin = newNode;
                End = newNode;
                newNode.prev = null;
                newNode.next = null;
            }
            else
            {
                Node p;
                p = Begin;
                newNode.next = p;
                newNode.prev = null;
                p.prev = newNode;
                Begin = newNode;
            }
        }

        
        void traverse_right_to_left()
        {
            if(Begin==null)
            {
                System.out.println("LL empty.");
            }
            else
            {
                Node p = End;
                while(p!=null)
                {
                    System.out.print(p.info+" ");
                    p = p.prev;
                }
                System.out.println();
            }
        }
        

        void traverse_left_to_right()
        {
            if(Begin==null)
            {
                System.out.println("LL empty.");
            }
            else
            {
                Node p = Begin;
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
           DoublyLinkedList l = new DoublyLinkedList();
           l.traverse_left_to_right();
           l.traverse_right_to_left();
           l.insert_right_end(10);
           l.traverse_left_to_right();
           l.insert_right_end(20);
           l.traverse_left_to_right();
           l.traverse_right_to_left();
           l.insert_right_end(30);
           l.traverse_left_to_right();
           l.traverse_right_to_left();
           l.insert_right_end(99);
           l.traverse_left_to_right();
           l.traverse_right_to_left();
        }
    }
