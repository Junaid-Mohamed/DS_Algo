package linked_list;



public class Reverse_a_LL {

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

	// recursive approach to just to print LL in reverse order	

	public void recPrint(Node node) {
		
		 if(node == null) return;
		
		 recPrint(node.next);
		 System.out.print(node.data+" ");
		
	}
	
	public void print() {
		Node currNode = head;
		System.out.print("Linked List data ");
		while (currNode != null) {
			System.out.print(currNode.data);
			currNode = currNode.next;
			if (currNode != null)
				System.out.print("->");
		}
		System.out.println();
	}

	//iterative method to reverse a LL
	public Node reverse(Node node) {
		
		/* 	Time Complexity: O(n) 
			Space Complexity: O(1)*/
		
		Node prev=null,next = null;
		Node curr = node;
		while(curr!=null) {
			
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		node = prev;
		return node;
		
		
	}
	
	// recursive method
	
	/* 	1) Divide the list in two parts - first node and 
      	 rest of the linked list.
   		2) Call reverse for the rest of the linked list.
   		3) Link rest to first.
   		4) Fix head pointer*/
	
	public Node recReverse(Node head) {
		
		if(head == null || head.next == null) return head;
		
		Node rest = recReverse(head.next);
		Node q = head.next;
		q.next = head;
		// the above two lines is same as below one line.
//		head.next.next = head;
		head.next = null;
		/* fix the head pointer */
		return rest;	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse_a_LL rll = new Reverse_a_LL();
		
		rll.insert(0);
		rll.insert(1);
		rll.insert(2);
		rll.insert(3);
		rll.insert(4);
		System.out.println("Given LL");
		rll.print();
		System.out.println("Reversed LL");
		rll.head = rll.recReverse(rll.head);
		rll.print();
		
	}

}
