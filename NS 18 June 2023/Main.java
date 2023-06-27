// Circular Linked List
class CircularLinkedList
    {
        class Node
        {
            int info;
            Node next;
        }

        Node Begin = null;

        void add_start(int data)
        {
            Node newNode = new Node();
            newNode.info = data;

            if(Begin == null)
            {
                newNode.next = newNode;
                Begin = newNode;
            }
            else
            {
                Node p = Begin;
                while(p.next!=Begin)
                    p = p.next;
                newNode.next = Begin;
                p.next = newNode;
                Begin = newNode;
            }
        }

        void add_end(int data)
        {
            Node newNode = new Node();
            newNode.info = data;

            if(Begin == null)
            {
                newNode.next = newNode;
                Begin = newNode;
            }
            else
            {
                Node p = Begin;
                while(p.next!=Begin)
                    p = p.next;
                newNode.next = Begin;
                p.next = newNode;
            }
        }

        
        void traverse()
        {
            if(Begin==null)
            {
                System.out.println("CLL empty.");
            }
            else
            {   
                System.out.print(Begin.info+" ");
                Node p = Begin.next;
                while(p!=Begin)
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
           CircularLinkedList l = new CircularLinkedList();
           l.traverse();
           l.add_start(20);
           l.traverse();
           l.add_start(10);
           l.traverse();
           l.add_end(30);;
           l.traverse();
        }
    }

    // https://my.newtonschool.co/playground/code/aw740oaivu5w

    public static Node Insertion(Node head, int K)
        {
        Node node=head;
        while ( node.next != head) 
                {
                        node = node.next; 
                }
        Node temp = new Node(K);
        node.next=temp;
        temp.next=head;
        return head;
        }


        // https://my.newtonschool.co/playground/code/eme7gkta6nkd

        public static int  check(Node head) {
 if (head == null) 
    return 1; 
   
    Node node = head.next; 
  
    while (node != null && node != head) 
    node = node.next; 
  
    if(node==head){return 1;}
    else {return 0;}
        
    }