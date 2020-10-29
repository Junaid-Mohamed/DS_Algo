package array;

public class Sort_Array_of_0_1_2 {

	static void sortArray(int arr[]) {
		// Time = O(N) and Space = O(1) 
		int temp, low = 0, mid = 0, high = arr.length - 1;

		while (mid <= high) {

			switch (arr[mid]) {
			case 0:
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				mid++;
				low++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
				break;
			}
		}

	}

	static void displayArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

		sortArray(arr);
		displayArray(arr);

	}

}
