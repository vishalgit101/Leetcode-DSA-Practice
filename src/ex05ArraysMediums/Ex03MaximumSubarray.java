package ex05ArraysMediums;

public class Ex03MaximumSubarray {
	
	public static void main(String [] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int [] arr3 ={-2, 1, -1, 3, 4};
		System.out.println(maxSubarray(arr3));
	}
	
	public static int maxSubarray(int [] nums) { // kadane algo...
		// Given an integer array nums, find the subarray with the largest sum, and return its sum.
		int maxSum = 0;
		int currentSum = 0;
		
		int start = 0;
		int ansStart = -1;
		int ansEnd = -1;
		for(int i = 0; i< nums.length; i++) {
			
			if(currentSum == 0) {
				start = i;
			}
			
			currentSum = currentSum + nums[i];
			
			if(currentSum > maxSum) {
				maxSum = currentSum;
				ansStart = start;
				ansEnd = i;
				
			}
			
			if(currentSum < 0) { // don't take the negative sum forward
				currentSum = 0;
			}
		}
		
		System.out.println(ansStart + " " + ansEnd);
		return maxSum;
		
	}
}
