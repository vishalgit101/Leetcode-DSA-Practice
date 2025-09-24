package ex06BinarySerach;

public class Ex03LowerBound {

	public static void main(String[] args) {
		
		int [] nums = {3,5,8,15,19};
		
		System.out.println(lowerBound(nums, 9));
		System.out.println(lowerBoundRecursion(nums, 9));

	}
	
	// DO it with both recursion and non-recursively
	
	// find the lower bound of a number (x)....
	public static int lowerBound(int[]nums, int x) {
		
		int start = 0;
		int end = nums.length -1;
		int mid = 0;
		int ans = nums.length;
		while(start<=end) {
			mid = (start+end)/2;
			
			
			if(nums[mid] >= x) { // move left
				ans = mid;
				end = mid-1;
			}else {
				start = mid+1;	// else move right
			}
		}
		
		return ans;
		
	}
	
	// Now with recursion
	public static int lowerBoundRecursion(int[] nums, int x) {
		int start = 0;
		int end = nums.length-1;
		int mid = nums.length;  // not found returns the size of the arr
		return recurse(nums, x, start, end, mid);
	}
	
	public static int recurse(int[] nums, int x, int start, int end, int ans) { // we need to remember last mid
		int mid = (start+end)/2;
		
		if(start>end) {
			return ans; // base case: return the best candidate
		}
		
		if(start<=end) {
			if(nums[mid] >= x) { // move left
				return recurse(nums, x, start, mid-1, mid);
			}else {
				return recurse(nums, x, mid+1, end, ans); // move right
				// if it keeps moving right then lowerBound wont be found and 
				// not found returns the size of the arr
			}
			
		}
		
		return ans;
	}
	
	
	// 		Can also do something like this
	/*	 	mid is a candidate, but check left side too
	        return Math.min(mid, recurse(nums, x, start, mid - 1));
	        Here, if recursion finds a better (smaller) index on the left, that wins.
			If not, mid stays as the answer.
	 */
	
	
	/*		Correct Way
		
			You need to remember the best candidate before the base case happens.
			That’s why we either:
			Pass ans as a parameter, or
			Use Math.min(mid, recurse(...)) when exploring left.*/


}
