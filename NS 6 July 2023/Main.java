// Binary Tree
public class Main {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree() {
            root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
        }

        void inorderTraversal(Node node) {
            if (node != null) {
                inorderTraversal(node.left);        // L
                System.out.print(node.data + " ");  // V
                inorderTraversal(node.right);       // R
            }
        }

        void preorderTraversal(Node node) {
            if (node != null) {
                System.out.print(node.data + " "); // V
                preorderTraversal(node.left);      // L
                preorderTraversal(node.right);     // R
            }
        }

        void postorderTraversal(Node node) {
            if (node != null) {
                postorderTraversal(node.left);      // L
                postorderTraversal(node.right);     // R
                System.out.print(node.data + " ");  // V
                
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.inorderTraversal(binaryTree.root);
        System.out.println();
        binaryTree.preorderTraversal(binaryTree.root);
        System.out.println();
        binaryTree.postorderTraversal(binaryTree.root);
    }
}

// HW: Write a function to find the sum of all the nodes of a given binary tree.