package linked_list;

import java.util.HashSet;

public class Detect_loop_in_LL {

	class Node {

		int data;
		Node next;

		public Node(int d) {
			data = d;
			next = null;
		}

	}

	Node head;

	public void insert(int data) {

		Node toAdd = new Node(data);
		if (head == null) {
			head = toAdd;
			return;
		}

		Node currNode = head;
		while (currNode.next != null)
			currNode = currNode.next;

		currNode.next = toAdd;

	}

	// hashing technique
	/*
	 * Time complexity: O(n). Only one traversal of the loop is needed. Auxiliary
	 * Space: O(n). n is the space required to store the value in hashmap.
	 */
	boolean detectLoop(Node head) {

		HashSet<Node> hs = new HashSet<Node>();
		while (head != null) {

			if (hs.contains(head))
				return true;
			hs.add(head);
			head = head.next;

		}

		return false;

	}

//	Floyd’s Cycle-Finding Algorithm
	/*
	 * Time complexity: O(n). Only one traversal of the loop is needed. Auxiliary
	 * Space:O(1). There is no space required.
	 */
	boolean detectLoop1(Node head) {

		Node slow = head, fast = head;
		while (slow.next != null && fast.next.next != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;

		}
		return false;

	}

	// same question used to find starting point of the loop using hashing technique
		int detectLoop2(Node head) {

			HashSet<Node> hs = new HashSet<Node>();
			while (head != null) {

				if (hs.contains(head))
					return head.data;
				hs.add(head);
				head = head.next;

			}

			return -1;

		}
		
	// finding starting point of loop using	Floyd’s Cycle-Finding Algorithm
		int detectLoop3(Node head) {

			Node slow = head, fast = head;
			while (slow.next != null && fast.next.next != null) {

				slow = slow.next;
				fast = fast.next.next;
				if (slow == fast)
					break ;

			}
			
			if(slow != fast) return -1;
			
			slow = head;
			while(slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}
			
			return slow.data;

		}
		
	
	public static void main(String[] args) {

		Detect_loop_in_LL dl = new Detect_loop_in_LL();

		dl.insert(50);
		dl.insert(20);
		dl.insert(15);
		dl.insert(4);
		dl.insert(10);

		// create a loop for testing.
		dl.head.next.next.next.next.next = dl.head.next.next;

		if (dl.detectLoop(dl.head)||dl.detectLoop1(dl.head) ) // can use any one method so or func.
			System.out.println("Loop detected");
		else
			System.out.println("Loop not detected.");

		// detecting starting point of the loop.
		System.out.print("Starting point of the loop -> ");
//		System.out.println(dl.detectLoop2(dl.head)); this or below one.
		System.out.println(dl.detectLoop3(dl.head));
		
		
	}

}
