package ex05ArraysMediumsRevision;

import java.util.HashMap;

public class Ex02MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =  {3,2,3};
		int [] arr2 = {2,2,1,1,1,2,2};
		
		System.out.println(majority(arr));
		System.out.println(majority(arr2));
		
		System.out.println();
		System.out.println(majority2(arr));
		System.out.println(majority2(arr2));
		

	}
	
	// Three Approach; Brute, Better, Boor's Voting Algo...
	// Brute - double for loops and greatest element as variable
	// Better is with HashMap with num freq and greatest element as variable
	// Best is with Boor's voting algo which works for n/2 being the majority and n/3 for its modified version
	
	//Optimized Approach...
	public static int majority2(int[] nums) {
		// Canceling and picking new candidate when count drops to 0;
		int count = 1;
		int majority = nums[0];
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == majority) {
				count++;
			}else {
				count--;
			}
			
			if(count == 0) {
				majority = nums[i];
				count = 1;
			}
		}
		
		return majority;
	}
	
	//Better HashMap Solution...
	public static int majority(int nums[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int majority = nums[0];
		int occurance = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				int freq = map.get(nums[i]);
				map.put(nums[i], freq +1);
			}else {
				map.put(nums[i], 1);
			}
			
			// check/update majority after every insertion
	        if (map.get(nums[i]) > occurance) {
	            occurance = map.get(nums[i]);
	            majority = nums[i];
	        }
		}
		System.out.println("Majority Element: " + majority + " Occurance: " + occurance);
		return majority;
	}

}
