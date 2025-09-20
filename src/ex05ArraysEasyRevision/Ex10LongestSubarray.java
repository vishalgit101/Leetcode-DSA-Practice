package ex05ArraysEasyRevision;

import java.util.HashMap;

public class Ex10LongestSubarray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,1,1,1,1,4,2,3};
		int[] nums = {1, 2, 3, 4, 5};
		
		//System.out.println(longestSubarray(nums, 9));
		System.out.println(longestSubarray(arr, 9));
		System.out.println(longestSubArray3(arr,9));

	}
	
	// using HashMap and prefix sum
	private static int longestSubArray3(int[] nums, int k) {
		
		// Sum: Index...
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int sum = 0;
		int longest = 0;
		// Store Sums for all the elements from 0-->element
		for(int i = 0; i<nums.length; i++) {
			sum = sum + nums[i];
			
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
			
			
			if(sum == k) {
				if(i+1 > longest) {
					longest = i+1;
				}
			}
			
			// x - k part
			int prevSum = sum - k;
			
			if(map.containsKey(prevSum)) {
				int gap =  i -map.get(prevSum);
				if( gap > longest) {
					longest = gap;
				}
			}
		}
		
		
		
		return longest;
	}

	// Using two pointer and sliding window approach...
	// Only works only work for +ve numbers...
	private static int longestSubarray(int[] nums, int k) {
		
		int i = 0; // left 
		int j = 0; // right
		
		int sum = 0;
		int len = 0;
		while(i <nums.length && j < nums.length) {
			sum = sum + nums[j];
			
			if(sum > k) {
				while(sum > k) {
					sum = sum - nums[i];
					i++;
				}
			}
			
			if(sum == k) {
				len = Math.max(len, j-i+1);
			}
			
			j++;
			
		}
		
		return len;
	}

}
