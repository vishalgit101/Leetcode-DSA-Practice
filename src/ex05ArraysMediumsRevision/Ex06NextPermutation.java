package ex05ArraysMediumsRevision;

import java.util.Arrays;

public class Ex06NextPermutation {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		nextPer(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void nextPer(int[] nums) {
		
		int breakPoint = -1;
		int breakNum = 0;
		
		
		for(int i = nums.length -1; i >0; i--) {
			if(nums[i] > nums[i-1]) {
				breakPoint = i-1;
				breakNum = nums[i-1];
				break;
			}
		}
		
		if(breakPoint == -1) { // if breakPoint remains the same then break never happened, means permutation was the lastOne
			
			int l = 0;
			int r = nums.length-1;
			
			while(l<=r) {
				int tem = nums[l];
				nums[l] = nums[r];
				nums[r] = tem;
				l++;
				r--;
			}
			
			return;
			
		}
		
		// pick first from right
		int index = 0;
		for(int i = nums.length-1; i > breakPoint; i--) {
			if(nums[i] > breakNum) {
				index = i;
				break; // this break is important as it picks first from right
			}
		}
		
		// Do the swapping...
		int temp = nums[index];
		nums[index] = nums[breakPoint];
		nums[breakPoint] = temp;
		
		// now reverse the portion after breakpoint....
		// doing it in-place...
		int left = breakPoint+1;
		int right = nums.length-1;
		while(left <= right) {
			int tem = nums[left];
			nums[left] = nums[right];
			nums[right] = tem;
			left++;
			right--;
		}
		
	}
}
