package ex08StringsMedium;

import java.util.HashMap;

public class Ex07SumofBeauty {

	public static void main(String[] args) {
		String s = 	"aabcb" ;//"aabcbaa";
		beautySum(s);
	}
	
	public static int beautySum(String s) { // TIME Exceeded 😭😭 Hence the beast in the name
		int sum = 0;
		String str = "";
		for(int i = 0; i<s.length(); i++) {
		
			for(int j = i; j<s.length(); j++) {
				str = s.substring(i, j+1);
				int beauty = computeBeauty(str);
				sum = sum + beauty;
			}
		}
		
		System.out.println(sum);
		return sum;
	}
	
	// WE CANT FIND THE LEAST DURING INITAILIZATION OF THE HASHMAP.
	// ITERATE OVER IT ONCE MORE...
	public static int computeBeauty(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int freq = 0;
		
		int most = 0;
		int least = Integer.MAX_VALUE;
		
		for(char c:str.toCharArray()) {
			if(!map.containsKey(c)) {
				freq = 1;
				map.put(c, freq);
			}else {
				freq = map.get(c) +1;
				map.put(c, freq);
			}
			
			if(freq > most) {
				most = freq;
			}
		}
		
		for(int i: map.values()) {
			if(i < least) {
				least = i;
			}
		}
		
		return most - least; // i.e return the beauty
	}

}
