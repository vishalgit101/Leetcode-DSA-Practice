package ex06BinarySerach;

public class Ex09MinimumRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int minRotated(int[] nums) {
	    int start = 0;
	    int end = nums.length - 1;
	    int smallest = Integer.MAX_VALUE;

	    while (start <= end) {
	        int mid = (start + end) / 2;
	        
	     // If the current segment is sorted
	        // Striver 15min BS-6
	        // notice its start and end
	        if (nums[start] <= nums[end]) {
	            smallest = Math.min(smallest, nums[start]);
	            break; // no need to search further
	        }

	        // Left half is sorted
	        if (nums[start] <= nums[mid]) {
	            smallest = Math.min(smallest, nums[start]);
	            start = mid + 1; // search right half
	        }
	        // Right half is sorted
	        else {
	        	// Striver BS-6 12:40 to understand why we are doing smallest check 
	        	// basically we have to pick smallest from each half
	            smallest = Math.min(smallest, nums[mid]);
	            end = mid - 1; // search left half
	        }
	    }

	    return smallest;
	}
}
