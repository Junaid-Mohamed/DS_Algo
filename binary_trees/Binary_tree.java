package binary_trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/* This problem consist of basic implementation of binary tree, 
 to find the height of the tree, and also level order traversal(reading the data of the tree 
 by moving in level by level fashion) and reverse level order traversal of a tree.*/

class Node {

	Node left, right;
	int data;

	Node(int d) {

		data = d;
		left = right = null;
	}

}

public class Binary_tree {

	Scanner sc = new Scanner(System.in);
	Node root;

	// recursive way to find height of BT, O(n) - time complexity.

	int height(Node root) {

		if (root == null)
			return 0;

		int rightHeight = height(root.right);
		int leftHeight = height(root.left);
		if (rightHeight > leftHeight)
			return rightHeight + 1;
		return leftHeight + 1;

	}

	// recursive way to create a binary tree
	Node createTree() {

		Node root = null;

		System.out.println("Enter data:");
		int data = sc.nextInt();

		if (data == -1)
			return null;
		root = new Node(data);

		System.out.println("Enter data for left of " + data);
		root.left = createTree();

		System.out.println("Enter data for right of " + data);
		root.right = createTree();

		return root;
	}

	// finding reverse level order traversal (method 1)
	void reverseLevelOrderTraversal(Node root) {
		int h = height(root);
		System.out.println();
		System.out.print("Reverse level order traversal -> ");
		for(int i=h;i>=1;i--) {
			printGivenLevelOrder(root,i);
		}
	}
	
	// finding reverse level order traversal (method 2)
	
	void reverseOrderTraversal(Node root) {
		
		Queue<Node> q = new LinkedList<>();
		Stack<Node> s = new Stack<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node node = q.poll();
			s.push(node);
			
			if(node.right!= null) q.add(node.right);
			if(node.left != null) q.add(node.left);
			
		}
		System.out.println();
		System.out.print("Reverse level order traversal using queue -> ");
		while(!s.isEmpty()) {
			System.out.print(s.pop().data+" ");
		}
		
		
	}
	
	
	
	// finding level order traversal (method 1)
	void levelOrder(Node root) {
		int h = height(root);
		System.out.print("Level order traversal -> ");
		for(int i=1;i<=h;i++) {
			printGivenLevelOrder(root,i);
		}
		
	}
	
	// to print the given level of levelOrder Traversal
	void printGivenLevelOrder(Node root,int level) {
		
		if(root == null) return;
		
		if(level == 1) System.out.print(root.data+" ");
		else if(level>1) {
			printGivenLevelOrder(root.left,level-1);
			printGivenLevelOrder(root.right,level-1);
		}
	}
	
//	finding levelOrderTraversal using queue (method 2)
	
	void levelOrderTraversal(Node root) {
		System.out.println();
		System.out.print("Level order using queue -> ");
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node tempNode = q.poll();
			System.out.print(tempNode.data+" ");
			if(tempNode.left!= null) q.add(tempNode.left);
			if(tempNode.right!=null) q.add(tempNode.right);
			
		}
		
	}
	
	// main method
	public static void main(String[] args) {

		Binary_tree tree = new Binary_tree();
		// to create a tree, iterative way
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		// to find height of tree
		System.out.println("Height of the tree -> "+tree.height(tree.root));
		// level order traversal
		tree.levelOrder(tree.root);
		tree.levelOrderTraversal(tree.root);
		// reverse level order traversal
		tree.reverseLevelOrderTraversal(tree.root);
		tree.reverseOrderTraversal(tree.root);
		//to create a tree recursive way 
		
//		Binary_tree tree1 = new Binary_tree();
//		tree1.root=tree1.createTree();
//		tree1.levelOrder(tree1.root);
		
	}

}
