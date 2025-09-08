package ex04RecursionBasic;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {2, 5, 6, 7, 8, 9, 10, 15, 18};
		
		binarySearch(arr, 0, arr.length, 5);

	}
	
	// Binary Search with Recursion
	public static int binarySearch(int [] arr, int start, int end, int num) {
		
		if(start > end) {
			return - 1;
		}
		
		int mid = (start + end)/2; 
		
		if(num == arr[mid]) {
			System.out.println("Found: " + arr[mid] + " at index of: " + mid);
			return mid;
		}else if(num < arr[mid]) {
			return binarySearch(arr, start, mid -1, num);
		}else {
			return binarySearch(arr, mid +1, end, num);
		}
	}

}
