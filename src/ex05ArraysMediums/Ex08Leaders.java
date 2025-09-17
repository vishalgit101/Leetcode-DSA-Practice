package ex05ArraysMediums;

import java.util.ArrayList;
import java.util.List;

public class Ex08Leaders {

	public static void main(String[] args) {
		
		int[] arr = {4,7,1,0};
		
		int[] arr2 = {10, 22, 12, 3, 0, 6};
		
		rightLeaders(arr2);
		
		rightLeadersOptimal(arr2);

	}
	
	// Optimal Solution...
	// for any num to be leaders all the nums on its right should be smaller than that number...
	// we dont have to check all the numbers though...
	// we can just check if the number was geater than the last max number and if it was tehn we just upadate the max to
	// current max and that's it!
	public static List<Integer> rightLeadersOptimal(int[] nums){
		List<Integer> leaders = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		//leaders.add(max);
		for(int i = nums.length-1; i >=0; i-- ) {
			if(nums[i] > max) {
				
				max = nums[i];
				leaders.add(max);
			}
		}
		
		System.out.println(leaders);
		
		return leaders;
	}
	
	// Brute Force solution....
	public static List<Integer> rightLeaders(int[] nums){
		
		List<Integer> leaders = new ArrayList<>();
		
		for(int i = nums.length-1; i >=0; i--  ) {
			
			boolean lead = true;
			int leadNum = nums[i];
			for(int j = i ; j < nums.length; j++) {
				if(leadNum < nums[j]) {
					lead = false;
					break;
				}
			}
			
			if(lead) {
				leaders.add(leadNum);
			}
			
		}
		
		System.out.println(leaders);
		return leaders;
		
	}

}
