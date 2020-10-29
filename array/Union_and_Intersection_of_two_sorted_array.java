package array;

public class Union_and_Intersection_of_two_sorted_array {

	static void union(int a[],int b[]) {
		
		int i=0,j=0,n=a.length,m=b.length;
		while(i<n && j<m) {
			if(a[i]<b[j]) System.out.print(a[i++]+" "); // after printing increment the pointer
			else if(a[i]>b[j]) System.out.print(b[j++]+" ");
			else {
				System.out.print(a[i++]+" ");
				j++;
			}
		}
		while(i<n) {
			System.out.print(a[i++]+" ");
		}
		while(j<m) {
			System.out.println(b[j++]+" ");
		}
		
		System.out.println();
	}
	
	static void intersection(int a[],int b[]) {
		
		int i=0,j=0,n=a.length,m=b.length;
		while(i<n && j<m) {
			if(a[i]<b[j]) i++;
			else if(a[i]>b[j]) j++;
			else {
				System.out.print(a[i++]+" ");
				j++;
			}
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,3,4,5,7};
		int b[] = {2,3,5,6};
		union(a,b);
		intersection(a,b);
		

	}

}
