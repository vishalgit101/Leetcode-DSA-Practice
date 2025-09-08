package ex03Sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5,5,6,8,1,2,4,3,6,7,2};
		
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
	
	// Bubble Sort - in place sorting algo
	public static int[] bubbleSort(int [] arr) {
		boolean sorted = false;
		
		while(!sorted) {
			sorted = true;
			for(int i= 0; i < arr.length -1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					
					sorted = false;
				}
			}
		}
		return arr;
	}
}
