package linked_list;



public class Remove_duplicate_in_sorted_LL {

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
	
	//iterative approach with o(n) complexity
	public Node removeDuplicate(Node head) {
		
		Node curr = head;
		while(curr!= null){
		    
		    Node temp = curr;
		    while(temp!= null && temp.data == curr.data) temp = temp.next;
		    curr.next = temp;
		    curr=curr.next;
		    
		    
		}
		return head;
		
	}
	
	//recursive approach
	
	public Node recRemoveDuplicate(Node head) {
		
		if(head == null || head.next == null) return head;
		
//		Node toRem;
		
		if(head.next != null) {
			
			if(head.data == head.next.data) {
				
//				toRem = head.next;
				head.next = head.next.next;
				recRemoveDuplicate(head.next);
				
			}
			else {
				recRemoveDuplicate(head.next);
			}
			
		}
		return head;
		
	}
	
	
	public static void main(String[] args) {
		
		Remove_duplicate_in_sorted_LL rd = new Remove_duplicate_in_sorted_LL();
		
		for(int i=1;i<=5;i++) {
			rd.insert(i);
			rd.insert(i);
		}
		
		rd.print();
		rd.recRemoveDuplicate(rd.head);
		rd.print();
	}

}
