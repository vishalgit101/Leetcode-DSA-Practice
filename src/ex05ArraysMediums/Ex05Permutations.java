package ex05ArraysMediums;

import java.util.ArrayList;
import java.util.List;

public class Ex05Permutations {
	public static void main(String[] args) {
		//int [] arr = {1,2,3,4,5,6,7,8,9};
		int [] arr = {1,2,3,4};
		
		//System.out.println(permute(arr));
		List<List<Integer>> rs = permute(arr);
		System.out.println(rs);
		System.out.println("Size: " + rs.size());
		
	}
	
	public static List<List<Integer>> permute(int [] nums ){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		boolean [] used = new boolean [nums.length];
		List<Integer> current = new ArrayList<Integer>();
		backtrack(nums, result, current, used);
		return result;
		
	}
	
	public static void backtrack(int [] nums, List<List<Integer>> result, List<Integer> current, boolean [] used) {
		// define the base case...
		if(current.size() == nums.length) {
			result.add(new ArrayList<Integer>(current));
		}
		
		// for loop to check for what elements got used and what are remaining....
		for(int i = 0; i< nums.length; i++) {
			if(used[i]) continue; // meaning it was True at that index...
			
			// else... we will add and choose
			current.add(nums[i]);
			used[i] = true;
			
			backtrack(nums, result, current, used);
			current.remove(current.size()-1);
			used[i] = false;
		}
	}
	
}
