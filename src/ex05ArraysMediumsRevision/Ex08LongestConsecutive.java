package ex05ArraysMediumsRevision;

import java.util.HashSet;

public class Ex08LongestConsecutive {

	public static void main(String[] args) {
		
		int [] arr = {100,4,200,1,3,2};
		System.out.println(longestConsecutive(arr));

	}
	
	// Brute force is sorting the array and the iterating over it to find the longest consecutive...
	public static int longest(int[] nums) {
		return -1;
	}
	
	// Optimized Approach with HashSet...
	public static int longestConsecutive(int [] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		int longest = 0;
		for(int n: nums) {
			set.add(n);
		}
		
		for(Integer n: set) {
			if(set.contains(n-1)) {
				continue;
			}else {
				int count = 0;
				int num = n;
				while(set.contains(num)) {
					count++;
					if(count> longest) {
						longest = count;
					}
					num++;
				}
			}
		}
		
		return longest;
	}

}
