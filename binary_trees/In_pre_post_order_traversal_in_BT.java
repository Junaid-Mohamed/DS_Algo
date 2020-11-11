package binary_trees;

import java.util.Stack;

public class In_pre_post_order_traversal_in_BT {

	Node root;
	
	// recursive approach for in,pre and post order traversal 
	
	 void inOrder(Node root) {
//		System.out.println("inOrder traversal");
//		Inorder->(Left, Root, Right)
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	void preOrder(Node root) {
//		System.out.println("preOrder traversal");
//		Preorder->(Root, Left, Right) 
		if(root == null) return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	void postOrder(Node root) {
//		System.out.println("postOrder traversal");
//		Postorder ->(Left, Right, Root)
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	// iterative approach for in,pre and post order traversal using stack 
	void InOrder(Node root) {
		
		Stack<Node> s = new Stack<>();
		Node curr = root;
		
		while(!s.isEmpty()||curr!=null) {
			
			if(curr!=null) {
				s.push(curr);
				curr = curr.left;
			}
			else {
				curr = s.pop();
				System.out.print(curr.data+" ");
				curr = curr.right;
			}
		}
		
	}
	
	void PreOrder(Node root) {
		
		Stack<Node> s = new Stack<>();
		Node curr = root;
		s.push(curr);
		while(!s.isEmpty()) {
			
			curr = s.pop();
			System.out.print(curr.data+" ");
			if(curr.right!= null) s.push(curr.right);
			if(curr.left!= null) s.push(curr.left);
			
		}
		
	}
	
	void PostOrder(Node root) {
		
		Stack<Node> s = new Stack<>();
		s.push(root);
		Stack<Integer> out = new Stack<>();
		while(!s.isEmpty()) {
			
			Node curr = s.pop();
			out.push(curr.data);
			
			if(curr.right!=null) s.push(curr.right);
			if(curr.left != null) s.push(curr.left);
		}
		
		while(!out.isEmpty()) {
			
			System.out.print(out.pop()+" ");
			
		}
	}
	
	public static void main(String[] args) {
		
		In_pre_post_order_traversal_in_BT tree = new In_pre_post_order_traversal_in_BT();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
//		tree.root.left.left = new Node(4);
//		tree.root.left.right = new Node(5);
//		tree.root.right.left = new Node(6);
//		tree.root.right.right = new Node(7);
		System.out.println("traversal using iterative method");
		System.out.print("Inorder traversal -> ");
		tree.InOrder(tree.root);
		System.out.println();
		System.out.print("Preorder traversal -> ");
		tree.PreOrder(tree.root);
		System.out.println();
		System.out.print("Postorder traversal -> ");
		tree.PostOrder(tree.root);
		System.out.println();
		
		System.out.println("traversal using recursive method");
		System.out.print("Inorder traversal -> ");
		tree.inOrder(tree.root);
		System.out.println();
		System.out.print("Preorder traversal -> ");
		tree.preOrder(tree.root);
		System.out.println();
		System.out.print("Postorder traversal -> ");
		tree.postOrder(tree.root);
		System.out.println();
	}

}
