package ex05ArraysEasyRevision;

import java.util.HashMap;

// 560. SubArray Sum Equals K
public class Ex11SubarraySum {

	public static void main(String[] args) {
		int [] arr = {1,2,3,1,1,1,1,4,2,3};
		System.out.println(subArraysCount(arr, 3));

	}

	private static int subArraysCount(int[] nums, int k) {
		//<Sum, freq> We add sum and the number of freq that particular sum appeared
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		int sum = 0;
		for(int i = 0; i< nums.length; i++) {
			sum = sum + nums[i];
			
			int prevSum = sum - k;
			
			// if all +ve in an array we can do:
			/*
			 if(map.containsKey(prevSum)){
			  	count ++; 
			  }
			*/
			
			if(map.containsKey(prevSum)) {
				int freq = map.get(prevSum);
				count = count + freq;
			}
			
			// arr could have -ve and zeros so same sum may appear more than once...
			if (map.containsKey(sum)) {
			    map.put(sum, map.get(sum) + 1);
			} else {
			    map.put(sum, 1);
			}

			
		}
		
		return count;
	}

}
