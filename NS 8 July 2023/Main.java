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

        int sumOfNodes(Node node) 
        {
            if(node == null)
                return 0;
            return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
        }

        int heightOfTree(Node node) 
        {
            if(node == null)
                return 0;
            return 1 + Math.max( heightOfTree(node.left) , heightOfTree(node.right));
        }

        int maxElement(Node node) 
        {
            if(node == null)
                return -1;
            return Math.max( node.data, Math.max(maxElement(node.left), maxElement(node.right)));
        }

        boolean searchNode(Node node, int target) 
        {
            if(node == null)
                return false;
            if(node.data == target)
                return true;
            return searchNode(node.left, target) || searchNode(node.right, target);
        }

        boolean isFullTree(Node node) 
        {
            if(node == null)
                return true;
            if(node.left == null && node.right == null)
                return true;
            if(node.left != null && node.right != null)
                return isFullTree(node.left) && isFullTree(node.right);
            return false;
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.inorderTraversal(binaryTree.root);
        System.out.println();
        binaryTree.preorderTraversal(binaryTree.root);
        System.out.println();
        binaryTree.postorderTraversal(binaryTree.root);
        System.out.println("\nSum of Nodes: "+binaryTree.sumOfNodes(binaryTree.root));
        System.out.println("\nHeight of Tree: "+binaryTree.heightOfTree(binaryTree.root));
        System.out.println("\nMaximum Element of Tree: "+binaryTree.maxElement(binaryTree.root));
        System.out.println("\nSearch Element 3 found?: "+binaryTree.searchNode(binaryTree.root, 3));
        System.out.println("\nSearch Element 13 found?: "+binaryTree.searchNode(binaryTree.root, 13));
        System.out.println("\nIs it a Strict/Full Binary Tree: "+binaryTree.isFullTree(binaryTree.root));
    }
}

// HW: Write a function to find the sum of all the nodes of a given binary tree.