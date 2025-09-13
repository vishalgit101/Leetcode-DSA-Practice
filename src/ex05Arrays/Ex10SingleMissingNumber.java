package ex05Arrays;

import java.util.HashMap;

public class Ex10SingleMissingNumber {
	
	// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

	public static void main(String[] args) {
		
		int[] arr = {4,1,2,1,2};
		
		System.out.println(singleNumber(arr));

	}
	
	public static int singleNumber(int[] nums) {
		
		// pass all the nums in a hashmap
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int missing = 0;
		
		for(int i: nums) {
			if(!map.containsKey(i)) {
				map.put(i, 1);
			}else {
				map.put(i, map.get(i) +1);
			}
			
		}
		
		for(Integer i: map.keySet()) {
			if(map.get(i) == 1) {
				missing = i;
				break;
			}
		}
		
		return missing;
		
	}

}
