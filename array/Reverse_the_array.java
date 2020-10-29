package array;

public class Reverse_the_array {

	//normal solution.
	static void reverse(int a[],int low,int high) {
		
		while(low<high) {
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
		
	}
	
	//recursive solution.
	static void reverse1(int a[],int low,int high) {
		
			if(low>=high) 
				return; 
	
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			reverse1(a,low+1,high-1);
		
	}
	
	static void printArray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {10,9,8,7,6};
		System.out.println("Original array");
		printArray(a,a.length);
		reverse1(a,0,a.length-1);
		System.out.println();
		System.out.println("Reversed array");
		printArray(a,a.length);
		}
}
