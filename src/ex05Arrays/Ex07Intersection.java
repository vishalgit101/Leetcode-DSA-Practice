package ex05Arrays;

import java.util.ArrayList;

public class Ex07Intersection {
	
	public static void main(String[] args) {
		
		// multiple ways to do this as well
		// One way is with HashMaps and storing the frequencies
		// Another way is with visited array {0,0,0,0,0,0};
		// Another way is for sorted arrays using two pointers
		
		// Intersection of Two Sorted Arrays
		int[] arr1 = {1,2,2,3,3,4,5,6};
		int[] arr2 = {2,3,3,5,6,6,7};
		
		ArrayList<Integer> inter = intersection2(arr1, arr2);
		
		System.out.println(inter);

	}
	
	// Using Visited Arrays... 
	public static ArrayList<Integer> intersection(int [] arr1, int[] arr2) {
		
		ArrayList<Integer> inter = new ArrayList<Integer>();
		
		int n1 = arr1.length;
		
		int n2 = arr2.length;
		
		int[] visited = new int[n2];
		
		
		for(int i = 0; i< n1; i++) {
			
			for(int j = 0; j< n2; j++) {
				
				if(arr1[i] == arr2[j] && visited[j] == 0) {
					inter.add(arr1[i]);
					visited[j] = 1;
					break;
				}else if(arr2[j] > arr1[i]) {
					break;
				}
			}
		}
		
		return inter;
			
	}
	
	// Using two pointers...
	public static ArrayList<Integer> intersection2(int[] arr1, int[] arr2 ) {
		
		ArrayList<Integer> inter = new ArrayList<Integer>();
		
		int i = 0;
		int j = 0;
		
		while(i< arr1.length && j < arr2.length) {
			
			if(arr1[i] < arr2[j]) {
				i++;
			}else if(arr1[i] == arr2[j]) {
				inter.add(arr1[i]);
				i++; 
				j++;
			}else if( arr2[j] < arr1[i]) { // could have simple done else{j++} as well
				j++;
			}
		}
		
		return inter;
		
	}
	
}
