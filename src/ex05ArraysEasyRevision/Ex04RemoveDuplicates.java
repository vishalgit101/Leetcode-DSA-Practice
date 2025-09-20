package ex05ArraysEasyRevision;

import java.util.Arrays;

public class Ex04RemoveDuplicates {

	public static void main(String[] args) {
		
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		
		
		System.out.println(removeDuplicates2(nums));

	}
	
	  public static int removeDuplicates1(int[] nums){

	        // Removing duplicates from already sorted array...
	        // if it was not sorted then we use another trick...

	        // Optimised Two Pointer Appoach works for only sorted arrays...
	        int i = 0;
	        int j = 1;
	        int uniq = 1;
	        while(j < nums.length){
	            if(nums[i] == nums[j]){
	                j++;
	            }else{
	                i++;
	                nums[i] = nums[j];
	                j++;
	                uniq++;
	            }
	        }

	        return uniq;

	    }
	  
	  // with marking approach...
	  public static int removeDuplicates2(int[] nums) {
		  int i = 0;
		  int j = 1;
		  
		  int uniques = 1;
		  while(j < nums.length) {
			  if(nums[i] == nums[j]) {
				  // its the same the mark the num at j index
				  nums[j] = Integer.MIN_VALUE;
				  j++;
			  }else { // num differs, jump i to j position and do j++;
				  i=j;
				  j++;
				  uniques++;
			  }
		  }
		  
		  //At this point all the duplicates has been marked
		  // Move the marked numbers to the end...
		  shift(nums);
		  System.out.println(Arrays.toString(nums));
		  return uniques;
	  }
	  
	  // shifting is done in the marking approach...
	  public static void shift(int[] nums) {
		  int i = 0;
		  int j = 1;
		  
		  while(j<nums.length) {
			  if(nums[j] != Integer.MIN_VALUE) {
				  i++;
				  int temp = nums[j];
				  nums[j] = nums[i];
				  nums[i] = temp;
				  j++;
			  }else {
				  j++;
			  }
		  }
	  }

}
