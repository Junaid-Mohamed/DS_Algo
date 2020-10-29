package array;

import java.util.Scanner;

public class Cyclically_rotate_array_by_one {

	static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
	
        int t = sc.nextInt();
        while(t!=0){
            int temp;
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            temp=a[n-1];
            for(int i=n-1;i>0;i--){
                a[i]=a[i-1];
            }
            a[0] = temp;
            t--;
            printArray(a);
        }
	
	}

}
