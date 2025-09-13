package ex05Arrays;

import java.util.HashMap;

public class Ex12SubarraySum {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,1,1,1,1,4,2,3};
		System.out.println(subArraysCount(arr, 3));
	}
	
	public static int subArraysCount(int[] nums, int k) {
		
		HashMap<Integer, Integer> prefixSums = new HashMap<Integer, Integer>();
		prefixSums.put(0,1); // imp for when sum - k == 0; meaning current num is k
		// int maxLen = 0; needed for finding the max len of SubArray with sum equals k
		
		int sum = 0 ; // x
		int subArrayCount = 0;
		
		for(int i =0; i< nums.length; i++) {
			
			
			
			sum = sum + nums[i];
			
			/*if(!prefixSums.containsKey(sum)) { This is overriding the freq
				prefixSums.put(sum, i);
				
				Each prefix sum (sum) is stored only once, the first time it’s seen.
				If the same prefix sum happens again later, the if (!prefixSums.containsKey(sum))
				check prevents updating — so duplicates are ignored.
				
			}*/
			
			// and if i only do: prefixSums.put(sum, i); It replaces the previous value for longest SubArrays
			// and replaces it with the shortest...
			
			int prefixSum = sum - k;
			
			if(prefixSums.containsKey(prefixSum)) {
				
				subArrayCount = subArrayCount + prefixSums.get(prefixSum);
				//prefixSums.put(sum, subArrayCount +1);	
			}
			
			prefixSums.put(sum, prefixSums.getOrDefault(sum, 0) + 1); // store freq
			
		}
		
		return subArrayCount;
		
	}
	
	/*
	 * Exactly 👍 — the frequency map becomes absolutely critical when negatives or zeros are involved.

		Why?
		
		With only positives, prefix sums are strictly increasing → the same sum can never repeat.
		
		Example: [1,2,3] → prefix sums [1,3,6]. Always new values.
		
		In that case, you could “get away” with storing just the first index.
		
		With negatives or zeros, prefix sums can repeat.
		
		That’s when a single prefix sum value may appear multiple times, and each occurrence opens up new valid subarrays.*/
}
