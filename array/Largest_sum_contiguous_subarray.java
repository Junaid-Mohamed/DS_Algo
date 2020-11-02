package array;

public class Largest_sum_contiguous_subarray {

	// linear solution using kadane's algorithm.
	static int kadanesAlgo(int b[]) {
		int sum = 0, max = b[0];
		int start = 0, end = 0;

		for (int i = 0; i < b.length; i++) {
			sum += b[i];
			if (sum > max) {
				max = sum;
				end = i;
			}
			if (sum < 0) {
				sum = 0;
				start = i + 1;
			}
		}

		System.out.println(start + " " + end);
		return max;
	}

	// O(N^2) solution

	static int subArraySum1(int a[]) {

		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if (sum > max)
					max = sum;
			}

		}

		return max;
	}

	// O(N^3) solution
	static int subArraySum(int a[]) {

		int max = a[0], sum;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				sum = 0;
				for (int k = i; k <= j; k++) {
					sum += a[k];
				}
				if (sum > max)
					max = sum;

			}
		}

		return max;
	}

	public static void main(String[] args) {

		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int b[] = { -2, -3, 4, -1 };
		int sol = subArraySum(b);
//		int sol1 = kadanesAlgo(a);
		System.out.println(sol);
//		System.out.println(sol1);

	}

}
