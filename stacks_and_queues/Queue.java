package stacks_and_queues;

public class Queue {

	int front,rear,size,capacity,array[];
	
	public Queue(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
		front = size = rear=0;
		
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	boolean isFull() {
		return size == capacity;
	}
	
	void enqueue(int data) {
		
		if(isFull()) {
			System.out.println("Queue is full.");
			return;
		}
		array[rear++] = data;
		size++;
	}
	
	int dequeue() {
		
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return 0;
		}
		
		size--;
		return array[front++];
	}
	
	void peek() {
		
		if(isEmpty()) {
			System.out.println("Cannot peek in an empty queue");
			return;
		}
		
		System.out.println(array[front]);
		
	}
	
	
	public static void main(String[] args) {
		
		Queue q = new Queue(10);
		
		for(int i=1;i<7;i++) {
			q.enqueue(i);
		}
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		System.out.println(q.dequeue());
		q.peek();
	}

}
