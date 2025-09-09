package ex03Sorting;

import java.util.Arrays;

public class QuickSort {
	
	public  static void main(String[] args) {
		// Quick Sort...
		int[] arr = {8,6,2,4,5,9,7,3};
		
		quickSort(arr, 0, arr.length -1);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		
		if(start < end) {
			
			int i = start - 1;
			int j = start;
			
			while(j <= end) {
				if(arr[j] <= pivot) {
					i++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					j++;
				}else {
					j++;
				}
				
			}
			
			
			quickSort(arr, start, i -1);
			quickSort(arr, i + 1, end);
			
		}
		
	}
}
