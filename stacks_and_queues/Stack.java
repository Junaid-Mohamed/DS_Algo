package stacks_and_queues;

public class Stack {

	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int s) {
		
		maxSize = s;
		stackArray = new long[maxSize];
		top=-1;
	}
	
	public void push(long data) {
		stackArray[++top] = data;
	}
	
	public long pop() {
		return stackArray[top--];
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==maxSize-1;
	}
	
	
	public static void main(String[] args) {
		Stack s = new Stack(10);
		
		for(int i=0;i<7;i++) {
			s.push(i);
		}

		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
		System.out.println(s.peek());
	}

}
