package array;

public class Kadanes_algo {

	public static void main(String[] args) {
		
		int b[] = {-2,-3,4,-1,-2,1,5,-3};
		int a[] = {-2,-3,4,-1};
		
		int sum = 0, max = b[0];
		
		for(int i=0;i<b.length;i++) {
			sum+=b[i];
			if(sum<0) sum=0;
			 /* Do not compare for all 
	           elements. Compare only  
	           when sum > 0 --> more optimized method */ 
			else if(sum>max) max = sum;
		}

		System.out.println(max);
	}

}
