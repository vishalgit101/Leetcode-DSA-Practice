package ex05Arrays;
// Problem Statement: Given an array, we have to find the largest element in the array.
public class Ex01LargestElement {
	public static void main(String[] args) {
		int [] arr= {2,5,1,3,0};
		
		int[] arr2 = {8,10,5,7,9};
		
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0; i< arr2.length; i++) {
			
			if(arr2[i] > largest) {
				largest = arr2[i];
			}
			
		}
		
		System.out.println(largest);
	}
}
