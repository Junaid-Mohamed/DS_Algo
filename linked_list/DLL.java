package linked_list;

public class DLL {

	static class Node{
		
		int data;
		Node next,prev;
		
		public Node(int d) {
			data = d;
		}
		
	}
	
	Node head;
	
	// Adding a node at the front of the list 
	
	public void push(int data) {
		
		Node toAdd = new Node(data);
		
		toAdd.next = head;
		toAdd.prev = null;
		
		if(head!= null) head.prev = toAdd; // if there was already a data in the list
		
		head = toAdd;
		
	}
	
	/* Given a node, insert a new node after the given node */
	
	public void insertAfter(Node currNode,int data) {
		
		if(currNode == null) {
			System.out.println("Given node cannot be null");
			return;
		}
		
		Node toAdd = new Node(data);
		
		toAdd.next = currNode.next; 
		currNode.next = toAdd;
		toAdd.prev = currNode;
		
		if(toAdd.next != null) toAdd.next.prev = toAdd;
		
	}
	
	/* Given a node, insert a new node before the given node */
	
	public void insertBefore(Node currNode,int data) {
		
		if(currNode == null) {
			System.out.println("Given node cannot be null");
			return;
		}
		
		Node toAdd = new Node(data);
		
		toAdd.prev = currNode.prev;
		currNode.prev = toAdd;
		toAdd.next = currNode;
		
		if(toAdd.prev != null) toAdd.prev.next = toAdd;
		else head = toAdd;
		
	}
	
	// Add a node at the end of the list 
	
	public void append(int data) {
		
		Node toAdd = new Node(data);
		
		Node currNode = head;
		
		toAdd.next = null;
		
		if(head == null) {
			toAdd.prev = null;
			head = toAdd;
			return;
		}
		
		while(currNode.next != null) currNode = currNode.next;
		
		currNode.next = toAdd;
		toAdd.prev = currNode;
		
	}
	
	// print DLL in both directions
	
	public void print(Node node) {
		
		Node last = null;
		System.out.println("Traversal in forward direction");
		
		while(node != null) {
			
			System.out.print(node.data+" ");
			last=node;
			node=node.next;
			
		}
		
		System.out.println();
		System.out.println("Traversal in reverse direction");
		
		while(last != null) {
			System.out.print(last.data+" ");
			last = last.prev;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		DLL dll = new DLL();
		
		  // Insert 6. So linked list becomes 6->NULL 
        dll.append(6); 
  
        // Insert 7 at the beginning. So linked list becomes 7->6->NULL 
        dll.push(7); 
  
        // Insert 1 at the beginning. So linked list becomes 1->7->6->NULL 
        dll.push(1); 
  
        // Insert 4 at the end. So linked list becomes 1->7->6->4->NULL 
        dll.append(4); 
  
        // Insert 8, after 7. So linked list becomes 1->7->8->6->4->NULL 
        dll.insertAfter(dll.head.next, 8); 
  
        // Insert 0, before 1. So linked list becomes 0->1->7->8->6->4->NULL 
        dll.insertBefore(dll.head, 0);
        
        System.out.println("Created DLL is"); 
        dll.print(dll.head);
	}

}
