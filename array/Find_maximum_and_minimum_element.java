package array;

public class Find_maximum_and_minimum_element {

	static class Pair{
		int min;
		int max;
	}
	
	// O(n) complexity solution.
	static Pair getMinMax(int a[],int n) {
		
		Pair minmax = new Pair();
		if(n==1) {
			minmax.max = a[0];
			minmax.min = a[0];
		}
		if(a[0]>a[1]) {
			minmax.max = a[0];
			minmax.min = a[1];
		}
		else {
			minmax.max = a[1];
			minmax.min = a[0];
		}
		
		for(int i=2;i<n;i++) {
			if(a[i]>minmax.max) {
				minmax.max = a[i];
			}
			else if(a[i]<minmax.min) {
				minmax.min = a[i];
			}
		}
		
		return minmax;
	}
	
	
	public static void main(String[] args) {
		int a[] = {10,9,8,7,6};
		int min = a[0],max = a[a.length-1];
//		Pair minmax = getMinMax(a,a.length);
//		System.out.println("Minimum element of array: "+minmax.min);
//		System.out.println("Maximum element of array: "+minmax.max);
//		
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) min = a[i];
			else if(max<a[i]) max = a[i];
		}
		
		System.out.println("Minimum element is "+min+" Maximum element is "+max);
		
	}

}
