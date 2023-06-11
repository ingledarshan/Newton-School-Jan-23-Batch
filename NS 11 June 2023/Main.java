// Singly Linked List

import org.w3c.dom.Node;

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

        void deletenode(int data)
        {
            if(Begin==null)
            {
                System.out.println("LL empty.");
            }
            else
            {
                Node p, follow;
                p = Begin;
                follow = null;
                while(p!=null)
                {
                    if(p.info == data)
                        break;
                    else
                    {
                        follow = p;
                        p = p.next;
                    }
                }
                if(p==null)
                {
                    System.out.println("Node not found.");
                }
                else if(p==Begin)
                {
                    Begin = p.next;
                    p = null;
                }
                else
                {
                    follow.next = p.next;
                    p = null; // free(p) i.e. free the memory occupied by p
                }
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
        void search(int data){
            if(Begin==null)
            {
                System.out.println("LL empty.");
            }
            else{
                boolean flag=false;
                Node p=Begin;
                while(p !=null){
                    if(p.info==data){
                        flag=true;
                        break;
                    }
                    else
                    p=p.next;
                }
                if(flag==true){
                    System.out.println("Element " + data+" found at address: "+p);
                }
                else{
                    System.out.println("Element " + data+"  not found in LL.");
                }
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
           l.deletenode(30);
           l.traverse();
           l.deletenode(10);
           l.traverse();
           l.deletenode(20);
           l.traverse();
           l.deletenode(60);
           l.traverse();
           l.search(50);
           l.search(40);
           l.search(11);
        }
    }

// https://my.newtonschool.co/playground/code/6alru5tlosmj

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
public static void printList(Node head) {
    Node curr = head;
    while (curr != null) {
        System.out.print(curr.val + " ");
        curr = curr.next;
    }
    System.out.println();
    }

// https://my.newtonschool.co/playground/code/6qqa7f0zv07o
public static Node addElement(Node head,int k) {
Node temp =new Node(k);
temp.next=head;
head = temp;
return temp;
    }
