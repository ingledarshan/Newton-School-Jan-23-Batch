// // Binary Tree
// public class Main {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         Node root;

//         BinaryTree() {
//             root = new Node(1);
//             root.left = new Node(2);
//             root.right = new Node(3);
//             root.left.left = new Node(4);
//             root.left.right = new Node(5);
//         }

//         void inorderTraversal(Node node) {
//             if (node != null) {
//                 inorderTraversal(node.left);        // L
//                 System.out.print(node.data + " ");  // V
//                 inorderTraversal(node.right);       // R
//             }
//         }

//         void preorderTraversal(Node node) {
//             if (node != null) {
//                 System.out.print(node.data + " "); // V
//                 preorderTraversal(node.left);      // L
//                 preorderTraversal(node.right);     // R
//             }
//         }

//         void postorderTraversal(Node node) {
//             if (node != null) {
//                 postorderTraversal(node.left);      // L
//                 postorderTraversal(node.right);     // R
//                 System.out.print(node.data + " ");  // V
                
//             }
//         }

//         int sumOfNodes(Node node) 
//         {
//             if(node == null)
//                 return 0;
//             return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
//         }

//         int heightOfTree(Node node) 
//         {
//             if(node == null)
//                 return 0;
//             return 1 + Math.max( heightOfTree(node.left) , heightOfTree(node.right));
//         }

//         int maxElement(Node node) 
//         {
//             if(node == null)
//                 return -1;
//             return Math.max( node.data, Math.max(maxElement(node.left), maxElement(node.right)));
//         }

//         boolean searchNode(Node node, int target) 
//         {
//             if(node == null)
//                 return false;
//             if(node.data == target)
//                 return true;
//             return searchNode(node.left, target) || searchNode(node.right, target);
//         }

//         boolean isFullTree(Node node) 
//         {
//             if(node == null)
//                 return true;
//             if(node.left == null && node.right == null)
//                 return true;
//             if(node.left != null && node.right != null)
//                 return isFullTree(node.left) && isFullTree(node.right);
//             return false;
//         }

//         boolean isSkewedTree(Node node) 
//         {
//             if(node == null || (node.left == null && node.right==null))
//                 return true;
//             else if (node.left == null)
//                 return isSkewedTree(node.right);
//             else if (node.right == null)
//                 return isSkewedTree(node.left);
//             else
//                 return false;
//         }

//     }

//     public static void main(String[] args) {
//         BinaryTree binaryTree = new BinaryTree();
//         binaryTree.inorderTraversal(binaryTree.root);
//         System.out.println();
//         binaryTree.preorderTraversal(binaryTree.root);
//         System.out.println();
//         binaryTree.postorderTraversal(binaryTree.root);
//         System.out.println("\nSum of Nodes: "+binaryTree.sumOfNodes(binaryTree.root));
//         System.out.println("\nHeight of Tree: "+binaryTree.heightOfTree(binaryTree.root));
//         System.out.println("\nMaximum Element of Tree: "+binaryTree.maxElement(binaryTree.root));
//         System.out.println("\nSearch Element 3 found?: "+binaryTree.searchNode(binaryTree.root, 3));
//         System.out.println("\nSearch Element 13 found?: "+binaryTree.searchNode(binaryTree.root, 13));
//         System.out.println("\nIs it a Strict/Full Binary Tree: "+binaryTree.isFullTree(binaryTree.root));
//         // Skewed Tree: The binary tree in which each node has either one or no child
//         System.out.println("\nIs it a Skewed Binary Tree: "+binaryTree.isSkewedTree(binaryTree.root));

//     }
// }


// Java program to see if two trees
// are mirror of each other

// A binary tree node
class Node
{
	int data;
	Node left, right;

	public Node(int data)
	{
		this.data = data;
		left = right = null;
	}
}

class Main
{
	Node a, b;
	
	/* Given two trees, return true if they are
	mirror of each other */
	boolean areMirror(Node a, Node b)
	{
		/* Base case : Both empty */
		if (a == null && b == null)
			return true;

		// If only one is empty
		if (a == null || b == null)
			return false;

		/* Both non-empty, compare them recursively
		Note that in recursive calls, we pass left
		of one tree and right of other tree */
		return a.data == b.data
				&& areMirror(a.left, b.right)
				&& areMirror(a.right, b.left);
	}

	// Driver code to test above methods
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		Node a = new Node(1);
		Node b = new Node(1);
		a.left = new Node(2);
		a.right = new Node(3);
		a.left.left = new Node(4);
		a.left.right = new Node(5);

		b.left = new Node(3);
		b.right = new Node(2);
		b.right.left = new Node(5);
        // b.left.left = new Node(5);
		b.right.right = new Node(4);

		if (tree.areMirror(a, b) == true)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}

