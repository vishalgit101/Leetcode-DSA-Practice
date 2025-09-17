package ex05ArraysMediums;

import java.util.ArrayList;
import java.util.List;

public class Ex06SubSet {
	
	private static List<List<Integer>> list = new ArrayList<List<Integer>>(); //  // store the subsets... [ [], [1,2,3], [1,2], [3,1], ....] so on;

	public static void  main(String[] args) {
		//int [] arr = {1,2,3,4,5,6,7,8};
		int [] arr = {1,2,3}; 
		
		//System.out.println(subset(arr));
		List<List<Integer>> rs = subset(arr);
		System.out.println(rs);
		System.out.println("Size: " + rs.size());
	
	}
	
	public static List<List<Integer>> subset(int [] arr) {
		
		List<Integer> current = new ArrayList<Integer>();
		backtrack(arr, 0, current);
		return list;
	}
	
	public static void backtrack(int[] arr, int index, List<Integer> current) {
		
		// define the base case for recursion...
		if(index == arr.length) {
			//System.out.println("Added at Index: " + index + " ==>" + current);
			list.add(new ArrayList<>(current));
			return;
		}
		
		// add element in the current node/leaf
		current.add(arr[index]);
		//System.out.println("Index: " + index);
		backtrack(arr, index + 1, current); // recursive function... i+1
		
		// backtracking and removing the previous choice...
		current.remove(current.size()-1);
		backtrack(arr, index +1, current); // i+1
		
	}

}
