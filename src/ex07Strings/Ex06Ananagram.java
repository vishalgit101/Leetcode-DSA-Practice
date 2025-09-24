package ex07Strings;

import java.util.HashMap;

public class Ex06Ananagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Horrendously inefficient way to do this is via permutation.... with factorial time
	
	// Simpler way is to do this is with freq count of both the strings
	
	public static boolean anagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(int i = 0; i<s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			
			if(!map.containsKey(c1)) {
				map.put(c1, 1);
			}else {
				int freq = map.get(c1);
				map.put(c1, freq+1);
			}
			
			if(!map2.containsKey(c2)) {
				map2.put(c2, 1);
			}else {
				int freq = map2.get(c2);
				map2.put(c2, freq+1);
			}
			
		}
		
		// check the freq in both HashTables matches with each other or not
		for(char c: s.toCharArray()) {
			Integer freq1 = map.get(c);
			Integer freq2 = map2.get(c);
			
			if( freq1 != freq2) {
				return false;
			}
		}
			
		return true;
		
	}
	
	public static boolean anagram2(String s, String t) {
	    if (s.length() != t.length()) return false;

	    HashMap<Character, Integer> map = new HashMap<>();

	    // Count characters from s
	    for (char c : s.toCharArray()) {
	        map.put(c, map.getOrDefault(c, 0) + 1);
	    }

	    // Subtract counts using t
	    for (char c : t.toCharArray()) {
	        if (!map.containsKey(c)) return false;
	        map.put(c, map.get(c) - 1);
	        if (map.get(c) < 0) return false;
	    }

	    return true; // all counts matched
	}


}
