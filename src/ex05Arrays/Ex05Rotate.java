package ex05Arrays;

import java.util.Arrays;

public class Ex05Rotate {
	public static void main(String[] args) {
		
		int [] nums = {1,2,3,4,5,6,7};
		int[] nums2 = {-1,-100,3,99};
		rotateArray(nums2, 2);
		System.out.println(Arrays.toString(nums2));
		
		// [3,99,-1,-100] Expected
		
	}
	
	// very imp note: k+1 was causing to misbehave because of how rotation were taking place.
	// in question i had to rotate to right: with temp[position] = nums[i];
	// left rotation: with temp[i] = nums[position];
	public static void rotateArray(int[]nums, int k)  {
		int [] temp = new int[nums.length];
		
		 for(int i = 0; i< nums.length; i++){
	            int position = (i+k ) % nums.length; 
	            //temp[i] = nums[position];
	            temp[position] = nums[i];
	        }
		 
		 for(int i = 0; i< nums.length; i++) {
			 nums[i] = temp[i];
		 }
		 
		 //System.out.println(Arrays.toString(temp));
	}
}
