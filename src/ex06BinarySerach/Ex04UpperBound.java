package ex06BinarySerach;

public class Ex04UpperBound {

	public static void main(String[] args) {
		
		int [] nums = {3,5,8,15,19};
		
		System.out.println(upperBound(nums, 9));
		System.out.println(upperBoundRecursion(nums, 9));
		
	}
	
	public static int upperBound(int[] nums, int x) {
		int start = 0;
		int end = nums.length -1;
		int ans = nums.length; // ans stores the first index where nums[i] > x
		int mid = 0;
		
		while(start<=end) {
			mid = (start+end)/2;
			
			if(nums[mid]> x) { // move left
				ans = mid;
				end = mid-1;
			}else {
				start = mid+1; // move right
			}
		}
		
		// current mid could be probably not be the first index where arr[mid] > x
		// so ans variable is needed to store the previous mid
		return ans;
	}
	
	public static int upperBoundRecursion(int [] nums, int x) {
		int start = 0;
		int end = nums.length-1;
		int ans = nums.length; // ans stores the first index where nums[i] > x
		
		return recursion(nums, x, start, end, ans);
	}
	
	public static int recursion(int[] nums, int x, int start, int end, int ans) {
		int mid = (start+end)/2;
		
		if(start>end) { // base case
			return ans;
		}
		
		if(start<=end) { // can remove the check from here, its redundant...
			if(nums[mid] > x) { // move left
				return recursion(nums, x, start, mid-1, mid);
			}else {
				return recursion(nums, x, mid+1, end, ans); // move right
			}
		}
		
		return ans;
	}

}
