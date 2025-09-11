package ex05Arrays;
//26. Remove Duplicates from Sorted Array

import java.util.Arrays;

public class Ex04RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		
		removeDuplicates(arr);
	}
	
	public static int removeDuplicates(int[] arr) {
		int i = 0;
		int j = 1;
		while(i < arr.length && j < arr.length) {
			if(arr[i] == arr[j]) {
				arr[j] = Integer.MIN_VALUE;
				j++;
			}else {
				i = j;
				j++;
			}
		}
		
		shift(arr);
		
		System.out.println(Arrays.toString(arr));
		
		return shift(arr);
		
	}
	
	public static int shift(int[] arr) {
		int i = 0;
		// two pointers
		for(int j = 0; j< arr.length; j++ ) {
			if(arr[j] != Integer.MIN_VALUE) {
				arr[i] = arr[j];
				i++;
			}
		}
		
		return i;
	}
	
}
