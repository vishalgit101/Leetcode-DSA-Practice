package ex05ArraysMediumsRevision;

import java.util.ArrayList;
import java.util.List;

public class Ex07Ledaers {

	public static void main(String[] args) {
		int [] arr = {1, 2, 5, 3, 1, 2};
		int [] arr2 = {-3, 4, 5, 1, -4, -5};
		System.out.println(leaders(arr));

	}
	
	public static List<Integer> leaders(int [] nums){
		List<Integer> leaders = new ArrayList<Integer>();
		
		int lead = nums[ nums.length-1];
		leaders.add(lead);
		
		for(int i = nums.length-1; i >=0; i--) {
			if(nums[i] > lead) {
				lead = nums[i];
				leaders.add(lead);
			}
		}
		return leaders.reversed();
		//return leaders;
	}

}
