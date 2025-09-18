package ex05ArraysMediumsRevision;

import java.util.Arrays;

public class Ex01SortColor {
	public static void main(String[] args) {
		int [] arr = /*00000*/ /*11111*/ {0,1,1,0,1,2,1,2,0,0,0}; // 22222 DNF
		
		//sortColors(arr);
		
		sortColors2(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	// Most Optimized with DNF, Dutch National Flag algo...
	public static void sortColors2(int[] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length-1;
		
		while(mid <= high) {
			if(nums[mid] == 0) {
				int temp = nums[mid];
				nums[mid] = nums[low];
				nums[low] = temp;
				mid++;
				low++;
			}else if(nums[mid] == 1) {
				mid++;
			}else if(nums[mid] == 2) {
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
			}
		}
	}
	
	// This was Better Approach...
	public static void sortColors(int[] nums) { // red, white, blue: 0,1,2
		// We can either sort using any inbuilt functions... Prohibited!
		// Or via Counting...with variables
		
		int red = 0;
		int white = 0;
		int blue = 0;
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 0) {
				red++;
			}else if(nums[i] == 1) {
				white++;
			}else if(nums[i] == 2) {
				blue++;
			}
		}
		
		// either with 3 while loops and dynamic changing variable or with 3 for loops...
		
		int count = 0;
			
		// for loop for red 
		for(int i =0; i< red; i++ ) {
			nums[count] = 0;
			count++;
		}
		
		// for loop for white 
		for(int i =0; i< white; i++ ) {
			nums[count] = 1;
			count++;
		}
		
		// for loop for blue
		for(int i =0; i< blue; i++ ) {
			nums[count] = 2;
			count++;
		}
		
		
	}
}
