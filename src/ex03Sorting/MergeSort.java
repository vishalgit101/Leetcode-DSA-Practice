package ex03Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		// MeargeSort Algo.... Divide and Conquer. Recursive Algorithm
		
		int[] arr = {8,6,2,4,5,9,7,3};
		
		mergeSort(arr, 0, arr.length -1);
		
		System.out.println(Arrays.toString(arr));

	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		
		// need the base case
		
		if(left < right) {
			
			//mid
			int mid = (left + right)/2;
			
			// step 1: recursively divide the array: left side
			mergeSort(arr, left, mid );
			
			// right side
			mergeSort(arr, mid +1  , right);
			
			merge(arr, left, right, mid);
			
		}
		
		
		
	}
	
	// for merging the arrays
	public static void merge(int[] arr, int left, int right, int mid) { // mid is needed dividing in two halves
		// size of temp arrays
		int n1 =  mid - left + 1; // because this side has extra... i.e mid included that's why +1
		int n2 = right - mid ; // this side skipped mid while doing +1 before which skipped the element so no need for +1 here
		
		int[] leftHalf = new int[n1];
		int[] rightHalf = new int[n2];
		
		int count = left;
		
		for(int i = 0; i < leftHalf.length; i++) {
			leftHalf[i] = arr[count];
			count++;
		}
		
		for(int j = 0; j < rightHalf.length; j++) {
			rightHalf[j] = arr[count];
			count++;
		}
		
		int i = 0;
		int j = 0;
		int k = left;
		
		while(i < n1 && j < n2) {
			if(leftHalf[i] <= rightHalf[j]) {
				arr[k] = leftHalf[i];
				i++;
				k++;
			}else {
				arr[k] = rightHalf[j];
				j++;
				k++;
			}
			
		}
		
		while( i < n1) {
			arr[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = rightHalf[j];
			j++;
			k++;
		}
		
	}

}
