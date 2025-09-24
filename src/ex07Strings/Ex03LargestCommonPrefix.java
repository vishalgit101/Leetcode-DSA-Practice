package ex07Strings;

public class Ex03LargestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		String[] strs2 ={"cir","car"};
		
		prefix(strs2);
	}
	
	public static String prefix(String [] strs){
        int largestPrefix = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        String word = "";
        
        for(String s: strs){
            if(s.length() < smallest){
                smallest = s.length();
                word = s;
            }
        }

        System.out.println(word + " length:" + smallest );
        
        for(int i = 0; i< strs.length; i++){
            int match = 0;
             for(int j = 0; j<smallest; j++){
            	 
                if(word.charAt(j) != strs[i].charAt(j)){
                   break;
                }else {
                	match++;
                }
            }
             
             System.out.println("Match: " + match);

            if(match < largestPrefix){
                largestPrefix = match;
            }
        }
        
        System.out.println(largestPrefix);
        return word.substring(0,largestPrefix);

    }
	
	//gpt
	class Solution {
	    public String longestCommonPrefix(String[] strs) {
	        if (strs == null || strs.length == 0) return "";

	        String prefix = strs[0];

	        for (int i = 1; i < strs.length; i++) {
	            // shrink prefix until it matches current string
	            while (strs[i].indexOf(prefix) != 0) {
	                prefix = prefix.substring(0, prefix.length() - 1);
	                if (prefix.isEmpty()) return "";
	            }
	        }

	        return prefix;
	    }
	}


}
