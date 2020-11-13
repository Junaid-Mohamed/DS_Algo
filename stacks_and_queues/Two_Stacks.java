package stacks_and_queues;

public class Two_Stacks {

	int top1,top2,a[];
	
	public Two_Stacks(int size) {
		
		a = new int[size];
		top1 = -1;
		top2=size;
		
	}
	
	void push1(int data) {
	
		if(top1<top2) {
			a[++top1] = data;
		}
		else {
			System.out.println("Stack 1 Overflow");
			System.exit(1);
		}
	}
	
	void push2(int data) {
		if(top1<top2) {
			a[--top2] = data;
		}
		else {
			System.out.println("Stack 2 Overflow");
			System.exit(1);
		}
	}
	
	int pop1() {
		if(top1>=0) {
			return a[top1--];
		}
		else {
			System.out.println("Stack 1 Underflow");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2() {
		if(top2<a.length) {
			return a[top2++];
		}
		else {
			System.out.println("Stack 2 Underflow");
			System.exit(1);
		}
		return 0;
	}
	public static void main(String[] args) {

		Two_Stacks ts = new Two_Stacks(5);
		
	        ts.push1(5); 
	        ts.push2(10); 
	        ts.push2(15); 
	        ts.push1(11); 
	        ts.push2(7); 
	        System.out.println("Popped element from"
	                           + " stack1 is " + ts.pop1()); 
	        ts.push2(40); 
	        System.out.println("Popped element from"
	                           + " stack2 is " + ts.pop2()); 

	}

}
