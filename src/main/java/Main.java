import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		print(arr);
		int n = arr.length;
		
		Main heapSort = new Main();
		heapSort.heapSort(arr);
		
		System.out.println("Sorted array:");
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
	}
	public void heapSort(int arr[]) {
		int n = arr.length;
		
		// create heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		
		// take 1 by 1 from heap
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, i, 0);
		}
	}
	public void heapify(int arr[], int n, int i) {
		int largest = i; // largest element
		int l = 2 * i + 1; // left stream
		int r = 2 * i + 2; // right stream
		
		if (l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		
		if (r < n && arr[r] > arr[largest]) {
			largest = r;
		}
		
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			heapify(arr, n, largest);
		}
	}
	
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
	
}
