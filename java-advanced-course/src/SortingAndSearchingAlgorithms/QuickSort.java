package SortingAndSearchingAlgorithms;

public class QuickSort {

	public static void display(int[] data) {
		for (int i = 0; i < data.length; ++i) {
			System.out.println(data[i]);
		}
	}

	public static void quickSort(int[] arr, int left, int right) {
		int i = left;
		int j = right;
		int temp;
		int pivot = arr[(left + right)/ 2] ;
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (left < j)
			quickSort(arr, left, j);
		if (i < right)
			quickSort(arr, i, right);

	}

	public static void main(String[] args) {
		int[] data = new int[] { 5, 10, 1, 9, 4, 8, 3, 6, 2, 7 };
		System.out.println("unsorted array: ");
		display(data);
		quickSort(data, 0, data.length - 1);
		System.out.println("sorted array: ");
		display(data);
	}

}
