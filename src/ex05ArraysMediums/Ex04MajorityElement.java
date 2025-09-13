package ex05ArraysMediums;

import java.util.HashMap;

public class Ex04MajorityElement {
	// 169
	/*Given an array nums of size n, return the majority element.
	The majority element is the element that appears more than ⌊n / 2⌋ times. 
	You may assume that the majority element always exists in the array.*/
	
	public static void main(String[] args) {
		
	}
	
	// Moore's Algo...
	public static int majorityElement(int[] nums) {
		
		int el = nums[0];
		int count = 0;
		
		for(int i = 0; i<nums.length; i++) {
			
			if(count == 0) {
				count++;
				el = nums[i];
			}else if(el == nums[i]) {
				count++;
			}else if(el != nums[i]) {
				count--;
			}
		}
		
		return el;
		
	}
	
	// with hashMap
	public static int maxEl(int[] nums) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
        int majority = nums[0];

        for(int i: nums){ // key:val = num:freq
            if(map.containsKey(i)){
                map.put(i, map.get(i) +1);

                if(map.get(i) > map.get(majority)){
                    majority = i;
                }
            } else{
                map.put(i, 1);
            }     
        }

        return majority;
	}
}
