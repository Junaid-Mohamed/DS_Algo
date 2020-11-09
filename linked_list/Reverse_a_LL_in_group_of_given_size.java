package linked_list;



public class Reverse_a_LL_in_group_of_given_size {

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
	
	// recursive approach
	public Node recReverse(Node node,int k) {
		
		Node curr = node,prev=null,next=null;
		int counter = 0;
		while(counter<k && curr!=null) {
			
			next=curr.next;
			curr.next=prev;
			prev = curr;
			curr = next;
			counter++;
		}
		
		if(next!=null) node.next = recReverse(next,k);
		
		return prev;
	}
	
	
	//iterative approach
	
	public Node itrReverse(Node node,int k) {
		
		Node curr = node,prev = null,temp = null,tail=null,join=null,newHead = null;
		int c = 0;
		
		// Traverse till the end of the linked list
		while(curr!=null) {
			
			c = k;
			join = curr;
			prev = null;
			 // Reverse group of k nodes of the linked list  
			while(curr!= null && c-- !=0) {
				
				temp = curr.next;
				curr.next = prev;
				prev = curr;
				curr = temp;
				
			}
			 // Sets the new head of the input list  
			if(newHead == null) newHead = prev;
			/* Tail pointer keeps track of the last node  
	        of the k-reversed linked list. We join the  
	        tail pointer with the head of the next  
	        k-reversed linked list's head */
			if(tail!=null) tail.next = prev;
			/* The tail is then updated to the last node  
	        of the next k-reverse linked list */
			tail = join;	
		}
		return newHead;
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
	
	public static void main(String[] args) {
		
		Reverse_a_LL_in_group_of_given_size rll = new Reverse_a_LL_in_group_of_given_size();
		rll.insert(1);
		rll.insert(2);
		rll.insert(3);
		rll.insert(4);
		rll.insert(5);
		rll.insert(6);
		rll.insert(7);
		rll.insert(8);
		System.out.println("Given LL");
		rll.print();
		System.out.println("Reversed LL in given group of size.");
		rll.head = rll.itrReverse(rll.head, 4);
		rll.print();
		
		

	}

}
