package ex05ArraysEasyRevision;

import java.util.ArrayList;

public class Ex08Union {

	public static void main(String[] args) {
		// two approaches to do this set and two pointers
		
		int[] arr1= {1,2,3,4,5,6}; // i...
		int[] arr2= {2,3,4,4,5}; // j...
		
		ArrayList<Integer> union = unionTwoPointers(arr1, arr2);
		
		System.out.println(union);

	}

	// Using Set too, simple... So will so two pointers one only
	
	// Union using two pointers - works only for sorted arrays
	private static ArrayList<Integer> unionTwoPointers(int[] arr1, int[] arr2) {
		
		ArrayList<Integer> union = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		
		while( i < arr1.length && j < arr2.length){
			if(arr1[i] <= arr2[j]) {
				if(union.size() == 0 || union.getLast() != arr1[i] ) {
					union.add(arr1[i]);
				}
				i++;
			}else {
				if(union.size() == 0 || union.getLast() != arr2[j] ) {
					union.add(arr2[j]);
				}
				j++;
			}
		}
		
		while( i< arr1.length) {
			if(union.size() == 0 || union.getLast() != arr1[i] ) {
				union.add(arr1[i]);
			}
			i++;
		}
		
		while( i< arr1.length) {
			if(union.size() == 0 || union.getLast() != arr2[j] ) {
				union.add(arr2[j]);
			}
			j++;
		}
		
			
		return union;
	}

}
