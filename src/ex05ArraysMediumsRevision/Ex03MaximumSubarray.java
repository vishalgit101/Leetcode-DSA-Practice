package ex05ArraysMediumsRevision;

public class Ex03MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4}; // [-2,1,-3,4,-1,2,1,-5,4]
		int [] arr2 = {5,4,-1,7,8};
		int [] arr3 ={-2, 1, -1, 3, 4};
		System.out.println(maxSubarraySum(arr3));
	}
	
	// Doing it with the kadane's algo...
	// It only works with negatives in the array...
	// Otherwise the longest array is the maximum, obviously, Duh!
	public static int maxSubarraySum(int [] nums) {
		// Take two vars maxSum and sum...
		// if sum is larger than max replace the max sum
		// sum becomes zero if it reaches -ve after adding new num...
		
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		
		// for printing the subarray from where to where 
		int start = 0;
		int ansStart = 0;
		int ansEnd = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			/*if(sum == 0) {
				start = i;
			}*/
			
			sum = sum + nums[i];
			if(sum > maxSum) {
				maxSum = sum;
				ansStart = start;
				ansEnd = i;
			}
			
			if(sum < 0) { // do't take the -ve sum forward...
				sum = 0;
				start = i+1;
			}
		}
		System.out.println("Subarray: " + ansStart + "--" + ansEnd);
		return maxSum;
	}

}
