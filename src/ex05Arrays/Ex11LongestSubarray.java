package ex05Arrays;

import java.util.HashMap;

public class Ex11LongestSubarray {
	public static void main(String[] args) {
		int [] arr = {1,2,3,1,1,1,1,4,2,3};
		int[] nums = {1, 2, 3, 4, 5};
		
		System.out.println(longestSubarray(nums, 9));
		System.out.println(longestSubarray2(nums, 9));
		System.out.println(longestSubArray3(nums,9));
	}
	
	// The Most Optimized Approach but only works with positives... The Two Pointer Approach
	public static int longestSubArray3(int[] nums, int k) {
		
		int i = 0; // right 
		int j = 0; // left
		
		int sum = nums[0];
		int maxLen =0;
		
		while(i< nums.length && j< nums.length) {
			
			while(j <= i && sum > k) { // shrinking until sum comes down below 'k'
				sum = sum - nums[j];
				j++;
			}
			
			if(sum == k) {
				maxLen = Math.max(maxLen, i-j + 1);	
			}
			
			i++;
			
			if(i < nums.length) {
				sum = sum + nums[i];
			}
		}
		
		return maxLen;
	}
	
	
	// Optimized Approach... with prefix sum
	public static int longestSubarray2 (int [] nums, int k) {
		// <Sum, Index>
		HashMap<Integer, Integer> prefixSums = new HashMap<Integer, Integer>();
		int x = 0; // sum
		int maxLen = 0;
		for(int i = 0; i < nums.length; i++) {
			
			x = x + nums[i];
			
			if(x == k) {
				maxLen = maxLen < (i+1) ? i+1 : maxLen;
				// or you can use Math.max
			}
			
			// Store (x) in the HashMap with the corresponding Index
	        // only store the first occurrence of prefix sum
	        if (!prefixSums.containsKey(x)) {
	            prefixSums.put(x, i);
	        }
			
			// Do: current x - k: (x-k) to check if there exists a 'prefixSum' which when added 'k' will make x;
			int prefixSum = x - k;
			
			if(prefixSums.containsKey(prefixSum)) {
				int prevIndex = prefixSums.get(prefixSum); // will give index 
				
				int len = i - prevIndex; // i is current index
				
				if(maxLen < len) {
					maxLen = len;
				}
			}
			
			// if sum previously exists then don't re-update check striver 24m.... inshort it causes a problem with 0,0 in arrays
			
			
		}
		
		return maxLen;
		
	}
	
	// Brute Force Method....
	public static int longestSubarray(int[] arr, int k) {
		
		int maxLen = 0;
		int len = 0;
		
		
		for(int i = 0; i< arr.length; i++) {
			int sum = 0;
			for(int j = i; j< arr.length; j++) {
				sum = sum + arr[j];
				if(sum == k) {
					len = j -i;
					break;
				}else if(sum > k) {
					break;
				}
			}
			if(len > maxLen) {
				maxLen = len;
			}
		}
		
		return maxLen +1;
		
	}
	
}
