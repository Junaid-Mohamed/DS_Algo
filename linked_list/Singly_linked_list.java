package linked_list;



// implementation of singly Linked list.


public class Singly_linked_list {

	
	// This inner class as well as other methods are made static 
	 // so that main() can access it 
	static class Node{
		
		int data;
		Node next;
		
		public Node(int d) {
			data = d;
			next = null;
		}
		
	}
	
	 Node head;
	
	
	
	static Singly_linked_list insert(Singly_linked_list list,int data) {
		
		Node toAdd = new Node(data);
		if(list.head == null) {
			list.head = toAdd;
			return list;
		}
		
		Node currNode = list.head;
		while(currNode.next != null) currNode=currNode.next;
		
		currNode.next = toAdd;
		
		return list;
	}
	
	static void print(Singly_linked_list list) {
		Node currNode = list.head;
		System.out.print("Linked List data ");
		while(currNode!=null) {
			System.out.print(currNode.data);
			currNode = currNode.next;
			if(currNode != null) System.out.print("->");
		}	
		System.out.println();
		}
	
	
	static void deleteAtPosition(Singly_linked_list list,int index) {
		
		Node currNode = list.head,prev=null;
		
		// CASE 1: 
        // If index is 0, then head node itself is to be deleted 
		if(index==0 && currNode!=null) {
			list.head=currNode.next;
			System.out.println("Element "+currNode.data+" is deleted from index 0");
			return ;
		}
		
		// CASE 2: 
        // If the index is greater than 0 but less than the size of LinkedList 
		
		int counter = 0;
		
		// Count for the index to be deleted, 
        // keep track of the previous node 
        // as it is needed to change currNode.next
		while(currNode != null) {
			
			if(counter==index) {
				//Since the currNode is the required position 
                // Unlink currNode from linked list 
				prev.next = currNode.next;
				System.out.println("Element "+currNode.data+" is deleted from index "+index);
				break;
			}
			else {
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}
		
		// If the position element was not found,
        // the currNode shall be null 
        // 
        // CASE 3: The index is greater than the size of the LinkedList
		if(currNode == null) System.out.println("Index is greater than the size of the LinkedList");
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Singly_linked_list list = new Singly_linked_list();
		
		// insert into the list.
		 list = insert(list, 1); 
	     list = insert(list, 2); 
	     list = insert(list, 3); 
	     list = insert(list, 4); 
	     list = insert(list, 5); 
	     list = insert(list, 6); 
	     list = insert(list, 7); 
	     list = insert(list, 8); 
	    // print the linked list
	     print(list);
	     
	     //delete operation
	     deleteAtPosition(list, 0); 
	     print(list);	     
	     deleteAtPosition(list, 2); 	     
	     print(list);
	     deleteAtPosition(list, 10); 
	     print(list);
	}

}
