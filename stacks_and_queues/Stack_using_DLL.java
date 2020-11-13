package stacks_and_queues;

public class Stack_using_DLL {

	class Node{
		
		Node prev,next;
		int data;
		
		Node(int d){
			data= d;
		}
	}	
	
	class Stack{
			Node mid,top;
			int count;
		}
		
	Stack createStack() {
		
		Stack s = new Stack();
		s.count=0;
		return s;
		
	}
		
	void push(Stack s,int data) {
		
		Node toAdd = new Node(data);
		
		toAdd.prev = null;
		
		toAdd.next = s.top;
		
		s.count++;
		
		if(s.count == 1) s.mid = toAdd;
		
		else {
			s.top.prev = toAdd;
			if(s.count%2==0) s.mid = s.mid.prev;
		}
		
		s.top = toAdd;
		
	}
		
	int pop(Stack s) {
		
		if(s.count == 0) {
			System.out.println("Stack is empty");
			return -1;
		}
		
		Node top = s.top;
		int data = top.data;
		s.top = top.next;
		
		if(s.top != null) s.top.prev = null;
		
		s.count--;
		
		if(s.count%2!=0) s.mid = s.mid.next;
		
		return data;
	}
	
	int middleElement(Stack s) {
		if(s.count==0) {
			System.out.println("Stack is empty");
			return -1;
		}
		
		return s.mid.data;
	}
	
	int deleteMid(Stack s) {
		if(s.count==0) {
			System.out.println("Stack is empty");
			return -1;
		}
		
		Node mid = s.mid;
		int data = mid.data;
		s.count--;
		if(s.count==1) {
			s.top = s.top.next;
			s.mid = s.top;
		}
		else if(s.count>1) {
			s.mid.next.prev = s.mid.prev;
			s.mid.prev.next = s.mid.next;
			if(s.count%2!=0) s.mid = s.mid.next;
			else s.mid = s.mid.prev;
		}
		return data;
		
	}
	
	public static void main(String[] args) {
		
		Stack_using_DLL sd = new Stack_using_DLL();
		Stack s = sd.createStack();
		sd.push(s,1);
		sd.push(s,2);
		sd.push(s,3);
		sd.push(s,4);
		sd.push(s,5);
		System.out.println(sd.middleElement(s));
		System.out.println(sd.pop(s));
		System.out.println(sd.middleElement(s));
		System.out.println(sd.deleteMid(s));
		System.out.println(sd.middleElement(s));
	}

}
