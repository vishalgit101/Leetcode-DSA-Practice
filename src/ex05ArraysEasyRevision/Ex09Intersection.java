package ex05ArraysEasyRevision;

import java.util.ArrayList;

public class Ex09Intersection {

	public static void main(String[] args) {
		// multiple ways to do this as well
		// One way is with HashMaps and storing the frequencies
		// Another way is with visited array {0,0,0,0,0,0};
		// Another way is for sorted arrays using two pointers
		
		// Intersection of Two Sorted Arrays
		int[] arr1 = {1,2,2,3,3,4,5,6};
		int[] arr2 = {2,3,3,5,6,6,7};
		
		ArrayList<Integer> inter = intersection2Pointer(arr1, arr2);
		
		System.out.println(inter);

	}

	private static ArrayList<Integer> intersection2Pointer(int[] arr1, int[] arr2) {
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		
		int i = 0;
		int j = 0;
		
		while( i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				i++;
			}else if(arr1[i] == arr2[j]) {
				intersection.add(arr1[i]);
				i++;
				j++;
			}
			else {
				j++;
			}
			
		}
		
		return intersection;
		
	}

}
