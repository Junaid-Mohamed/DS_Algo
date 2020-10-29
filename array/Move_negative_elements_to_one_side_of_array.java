package array;

public class Move_negative_elements_to_one_side_of_array {

	// partition method of quick sort process.
	static void partition(int arr[]) {
		int temp, j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}

	}

	// two pointer approach
	static void twoPointer(int arr[]) {
		int left = 0, right = arr.length - 1, temp;
		while (left <= right) {

			if (arr[left] < 0 && arr[right] < 0)
				left++;
			else if (arr[left] > 0 && arr[right] < 0) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			} else if (arr[left] > 0 && arr[right] > 0)
				right--;
			else {
				left++;
				right--;
			}

		}
	}

	static void displayArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		partition(arr);
		System.out.println("partition solution.");
		displayArray(arr);
		System.out.println("Two pointer solution.");
		int arr1[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		twoPointer(arr1);
		displayArray(arr1);
		// Time = O(N) and Space = O(1) both solutions.
	}

}
