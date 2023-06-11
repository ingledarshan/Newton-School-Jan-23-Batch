// Singly Linked List
class SinglyLinkedList
    {
        class Node
        {
            int info;
            Node next;
        }

        Node Begin = null;

        void add(int data)
        {
            Node newNode = new Node();
            newNode.info = data;

            if(Begin == null)
            {
                Begin = newNode;
                newNode.next = null;
            }
            else
            {
                Node p = Begin;
                while(p.next!=null)
                    p = p.next;
                p.next = newNode;
                newNode.next = null;
            }
        }

        void traverse()
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
           SinglyLinkedList l = new SinglyLinkedList();
           l.traverse();
           l.add(10);
           l.add(20);
           l.traverse();
           l.add(30);
           l.add(40);
           l.traverse();
           l.add(50);
           l.add(60);
           l.traverse();
        }
    }

