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
        
        void delete_node(int data)
        {
            if(Begin==null)
            {
                System.out.println("LL empty. Cannot delete.");
            }
            else if((Begin.info==data) && (Begin.next==null) && (End.prev==null))
            {
                Begin = null;
                End = null;
            }
            else if (Begin.info == data)
            {
                Node p = Begin;
                Begin = Begin.next;
                Begin.prev = null;
                p = null;
            } 
            else if (End.info==data)
            {
                Node p = End;
                End = End.prev;
                End.next = null;
                p = null;
            }
            else
            {
                Node p = Begin.next;
                while(p!=End)
                {
                    if(p.info==data)
                        break;
                    else
                        p = p.next;
                }
                if(p!=End)
                {
                    p.prev.next = p.next;
                    p.next.prev = p.prev;
                    p = null;
                }
                else if(p==End)
                    System.out.println("Node to be deleted not found in the LL.");
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
           l.delete_node(99);
           l.traverse_left_to_right();
           l.delete_node(30);
           l.traverse_left_to_right();
           l.insert_right_end(30);
           l.insert_right_end(40);
           l.insert_right_end(50);
           l.traverse_left_to_right();
           l.delete_node(30);
           l.traverse_left_to_right();
           l.delete_node(19);
           l.traverse_left_to_right();
        }
    }


    // https://my.newtonschool.co/playground/code/ge5bthjvoo66

    /*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/


public static Node insertnew(Node head,int k) {   
    Node newNode = new Node(k);
    newNode.prev = null;
    newNode.next = head;
    head = newNode;
    return head;
}


// https://my.newtonschool.co/playground/code/eqkl0wizy38p

static Node sortedInsertion(Node head, Node newNode)
    {
        Node current;
 
            if (head == null)
                head = newNode;
            else if (head.data >= newNode.data)
            {
                newNode.next = head;
                newNode.next.prev = newNode;
                head = newNode;
            }
 
            else
            {
                current = head;
                while (current.next != null &&
                        current.next.data < newNode.data)
                    current = current.next;
                newNode.next = current.next;
                if (current.next != null)
                    newNode.next.prev = newNode;
 
                current.next = newNode;
                newNode.prev = current;
             
            }
            return head;
    }