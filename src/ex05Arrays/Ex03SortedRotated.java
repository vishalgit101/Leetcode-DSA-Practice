package ex05Arrays;

import java.util.Arrays;

//1752: Check if Array Is Sorted and Rotated...


public class Ex03SortedRotated {
	public static void main(String[] args) {
		int[] arr = {3,4,5,1,2};
		sortedRotated(arr);
	}
	
	public static boolean sortedRotated(int[] arr) {
		// we need to first find k
		int drop = 0;
		int dropIndex = 0;
		for(int i = 0; i < arr.length -1; i++) {
			if(arr[i] > arr[i+1]) {
				dropIndex = i;
				drop++;
			}
		}
        if(drop == 0){
            return true;
        }
		System.out.println(drop);
		
		if(drop > 1) {
			return false;
		}
		
		// find k with dropIndex
		int k = (arr.length ) - dropIndex;
		
		// now create a new array
		int[] temp = new int[arr.length];
		
		for(int i = 0; i< arr.length; i++) {
			int position = (k + i) % arr.length;
			temp[i] = arr[position];
		}
		
		System.out.println(Arrays.toString(temp));
		
		// now check if the array that just formed is sorted or not
		for(int i = 0; i< temp.length -1; i++) {
			if(temp[i] > temp[i+1]) {
				return false;
			}
		}
		
		
		
		return true;
				
	}
}
