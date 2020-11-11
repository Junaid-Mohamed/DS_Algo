package binary_trees;




public class Diameter_of_a_tree {

	Node root;
	// this node comes from the first program which lies in the same package.
	
	
	int height(Node root) {

		if (root == null)
			return 0;

		int rightHeight = height(root.right);
		int leftHeight = height(root.left);
		if (rightHeight > leftHeight)
			return rightHeight + 1;
		return leftHeight + 1;

	}
	
	// recursive way to find diameter(The diameter of a tree (sometimes called the width) 
	// is the number of nodes on the longest path between two end nodes. ) of BT
	
	int diameter(Node root) {
		
		if(root == null) return 0;
		
		int lheight = height(root.left);
		int rheight = height(root.right);
		int ldiameter = diameter(root.left);
		int rdiameter = diameter(root.right);
		
		return Math.max(lheight+rheight+1, Math.max(ldiameter, rdiameter));
		
	}
	
	public static void main(String[] args) {
		
		Diameter_of_a_tree tree = new Diameter_of_a_tree();
		
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		int fd = tree.diameter(tree.root);
		System.out.println("Diameter of the tree is -> "+fd);
	}

}
