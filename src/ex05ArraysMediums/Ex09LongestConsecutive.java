package ex05ArraysMediums;

import java.util.Arrays;
import java.util.HashSet;

public class Ex09LongestConsecutive {
	public static void main(String[] args) {
		
	}
	
	// Optimal...
	// Using HashSet...
	// We'll be looping from the smallest in set of any sequence
	public static int longestConsecutiveOptimal(int[] nums) {
		int longest = 0;
		// Pass the elements in the set...
		HashSet<Integer> set = new HashSet<Integer>();
		for(int n: nums) {
			set.add(n);
		}
		
		for(Integer n: set) {
			if(set.contains(n-1)) {
				continue;
			}
			
			// if set doesn't contains n-1 then its the smallest of a sequence
			// So we check how big of the sequence is by iterating over the set with checks...
			
			int count = 1;
			int current = n;
			while(set.contains(current+1)) {
				current++;
				count++;
			}
			
			if(count > longest) {
				longest = count;
			}
			
			
		}
		
		return longest;
		
	}
	
	// Brute...
	public static int longestConsecutive(int[] nums) {
		
		Arrays.sort(nums);
		
		int longest = 1;
		int currentStreak = 1;
		for(int i = 1; i< nums.length; i++) {
			
			if(nums[i] == nums[i-1]) {
				continue;
			}else if(nums[i] == nums[i-1] +1) {
				longest++;
			}else {
				// gap reset
				longest = Math.max(longest, currentStreak);
				currentStreak = 1;
			}
		}
		
		return Math.max(longest, currentStreak);
		
/*
		Why it fails with gaps
		
		Take [1,2,100,101] after sorting:
		
		1 → 2: consecutive → currentStreak = 2.
		
		2 → 100: gap → nothing resets → still currentStreak = 2.
		
		100 → 101: consecutive → currentStreak = 3. ❌
		
		But the real longest streaks are [1,2] (length 2) and [100,101] (length 2).
		Your code would incorrectly return 3.
		
*/
		
	}
}
