
public class AVLTreeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   AVLTree avlTree = new AVLTree();
	        Node root = null;
	        
	        root = avlTree.insert(root, 10);
	        root = avlTree.insert(root, 5);
	        root = avlTree.insert(root, 15);
	        root = avlTree.insert(root, 3);
	        root = avlTree.insert(root, 7);
	        root = avlTree.insert(root, 12);
	        root = avlTree.insert(root, 20);
	        root = avlTree.insert(root, 9);
	        root = avlTree.insert(root, 17);
	        root = avlTree.insert(root, 30);
	        root = avlTree.insert(root, 1);
	        root = avlTree.insert(root, 8);
	        root = avlTree.insert(root, 14);
	        root = avlTree.insert(root, 25);
	        root = avlTree.insert(root, 35);
	        
	        System.out.println("Inorder traversal of AVL tree after insertion:");
	        inorderTraversal(root);

	        System.out.println("\nGraphical representation of AVL tree:");
	        //printTree(root, "", true);
	        AVLTreePrinter.printNode(root);
	        
	        int keyToDelete = 15;
	        root = avlTree.delete(root, keyToDelete);

	        System.out.println("\nInorder traversal of AVL tree after deleting " + keyToDelete + ":");
	        inorderTraversal(root);

	        System.out.println("\nGraphical representation of AVL tree:");
	        //printTree(root, "", true);
	        AVLTreePrinter.printNode(root);
	        
	}//end main
	
	 public static void inorderTraversal(Node node) {
	        if (node != null) {
	            inorderTraversal(node.left);
	            System.out.print(node.data + " ");
	            inorderTraversal(node.right);
	        }
	    }

	 
	 public static void printTree(Node node, String prefix, boolean isLeft) {
	        if (node != null) {
	            System.out.println(prefix + (isLeft ? "|-- " : "\\-- ") + node.data);
	            printTree(node.left, prefix + (isLeft ? "|   " : "    "), true);
	            printTree(node.right, prefix + (isLeft ? "|   " : "    "), false);
	        }
	    }
}//end class
