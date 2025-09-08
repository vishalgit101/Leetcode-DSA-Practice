package ex03Sorting;

public class BinarySearch {

	public static void main(String[] args) {
		
		// liner search
		//int[] arr = {2,5,6,7,8,2,5,6,1,1,5, 10, 15}; this is unsorted array
		
		int [] arr = {2, 5, 6, 7, 8, 9, 10, 15, 18};
		
		linearSearch(arr, 5);
		
		// binary search - non recursively
		binarySearch(arr, 10);
	}
	
	// linear search - print index position with the number
	public static void linearSearch(int[] arr, int num) {
		boolean found = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				System.out.println("Found Num: " + arr[i] + " at index of: " + i);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Number does not exist in the array");
		}
		
	}
	
	
	// WRONG!!!!
	/*// binary search - it works on sorted arrays only
	public static void binarySearch(int[] arr, int num) {
	
		// divide the array in two halves
		int mid = 0;
		int start = 0;
		int end = arr.length;
		boolean found = false;
		
		// wrong it will take while loop instead... this for loop is also dividing array, kind of like how it happens with the recursion
		for(int i = start; i <= end ; i++) {
			 mid = (start + end)/2; // auto floors
			
			if(num == arr[mid]) {
				System.out.println("Found Num: " + arr[mid] + " at index of " + mid);
				found = true;
				break;
			}else if(num < arr[mid]) {
				end = mid;
			}else {
				start = mid;
			}
		}
		
		if(!found) {
			System.out.println("Number does not exist in the array");
		}
	}*/
	
	public static void binarySearch( int [] arr, int num) {
		
		int mid = 0;
		int start = 0;
		int end = arr.length -1;
		boolean found = false;
		
		while(start <= end) {
			
			mid = (start+end)/2;
			
			if(num == arr[mid]) {
				System.out.println("Found Num: " + arr[mid] + " at index of: " + mid);
				found = true;
				break;
			}else if(num < arr[mid]) {
				end = mid - 1;
			}else {
				start = mid +1;
			}
			
		}
		
		if(!found) {
			System.out.println("Number does not exist in the array");
		}
		
	}

}
