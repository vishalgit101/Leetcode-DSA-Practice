package ex08StringsMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex01SortByFreq {

	public static void main(String[] args) {
		
		String str = "tree";
		String str2 ="cccaaa";
		freqSort(str2);

	}
	
	// Can be solved with either priorityQueues or with Bucket Sort...
	// With Bucket Sort we have the Arrays of list with index being their frequency
	public static String freqSort(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int maxFreq = 1;
		for(char c: s.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				int freq = map.get(c) +1;
				map.put(c, freq);
				
				if((freq) > maxFreq) {
					maxFreq = freq;
				}
			}
		}
		
		// but the store keys with same frequencies in a list on that bucket index.
		
		//int [] arr = new int[map.size()]; ARRAY OF INTS
		
		List<Character>[] bucket = new List[maxFreq +1]; // ARRAY OF List<Character>
		
		// Initialize the ArrayList inside of the arrays
		for(int i = 0; i< bucket.length; i++) {
			bucket[i] = new ArrayList<Character>();
		} 
		
		for(char c: map.keySet()) {
			int val = map.get(c);
			bucket[val].add(c);
		}
		
		// Now Bucket index denote the freq of each of the character
		StringBuilder sb = new StringBuilder();
		
		// Build result from high → low
		for(int i = bucket.length-1; i > 0 ; i--) {
			
			List<Character> individualList = bucket[i];
			
			for(int j = 0; j<individualList.size(); j++) {
				
				for(int k = 0; k<i; k++) {
					sb.append(individualList.get(j));
				}
				
			}
		}
		//System.out.println(sb.toString());
		return sb.toString();
		
	}

}
