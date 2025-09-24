package ex08StringsMedium;

public class Ex06LongestPalindrome {

	public static void main(String[] args) {
		String s = "babad";
		String s2 = "abacdfgdcaba";
		longest1(s);

	}
	
	// With optimized On^2 solution...
	// Check symmetry starting from i, expanding the both side
	public static String longest2(String s) {
		
		String res = "";
		int maxLen = 0;
		
		for(int i = 0; i<s.length(); i++) {
			
			int len1 = expandFromCenterOdd(s, i); // odd palindrome; Comparing 1,3,5...
			int len2 = expandFromCenterEven(s, i, i+1); // end palindrome 2,4,6...
			
			int len = Math.max(len1, len2);
			
			if(len > maxLen) {
				maxLen = len;
				int start, end;
				if (len % 2 == 1) { // odd length palindrome
				    start = i - len / 2; // i is the center and start is towards the left and end is towards the right
				    end = i + len / 2;
				} else { // even length palindrome
				    start = i - (len / 2 - 1); // 
				    end = i + len / 2;
				}
				
				res = s.substring(start, end + 1);
			}
		}
		
		return res;  
	}
	
	public static int expandFromCenterOdd(String s, int start) {
		int left = start;
		int right = start;
		
		while(left >= 0 && right < s.length()) {
			
			char c1 = s.charAt(left);
			char c2 = s.charAt(right);
			
			if(c1 != c2) {
				break;
			}
			
			left--;
			right++;
			
		}
		
		// right - left - 1 because when the loop breaks left and right are beyond the palindrome boundaries.
		
		return right-left-1;
	}
	
	public static int expandFromCenterEven(String s, int left, int right) {
		
		while(left >= 0 && right < s.length()) {
			
			char c1 = s.charAt(left);
			char c2 = s.charAt(right);
			
			if(c1 != c2) {
				break;
			}
			
			left--;
			right++;
			
		}
		
		// right - left - 1 because when the loop breaks left and right are beyond the palindrome boundaries.
		
		return right-left-1;
	}
	
	
	// On^3 very inefficient
	public static String longest1(String s) {
		int maxLen = 0;
		String str = "";
		
		String palindrome = "";
		
		for(int i = 0; i<s.length(); i++) {
			
			for(int j = i; j<s.length(); j++) {
				str = s.substring(i,j+1);
				
				boolean pal = isPal(str);
				
				if(pal) {
					if(str.length() > maxLen) {
						maxLen = str.length();
						palindrome = str;
					}
				}
			}
		}
		System.out.println(palindrome);
		return palindrome;
		
	}
	
	public static boolean isPal(String s) {
		boolean pal = true;
		int left = 0;
		int right = s.length()-1;
		while(left<=right) {
			char c1 = s.charAt(left);
			char c2 = s.charAt(right);
			
			if(c1 != c2) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return pal;
	}
	
	//WRONG fail for cases like this: abacdfgdcaba
	public static String longest(String s){
		
		if(s.length() <=1) {
			return s;
		}
		String str = s;
		
		int start = 0;
		int end = 0;
		
		int max = 0;
		String palindrome = "";
		
		int j = s.length();
		for(int i = 0; i<s.length()/2; i++ ) {
			boolean pal = true;
			start = 0;
			str = s.substring(i,j);
			end = str.length();
			System.out.println(start + "" + end);
			while(start<=end) {
				char c1 = str.charAt(start);
				char c2 = str.charAt(end-1);
				
				if(c1 != c2) {
					pal = false;
				}
				
				start++;
				end--;
			}
			
			if(pal) {
				if(str.length()> max) {
					max = str.length();
					palindrome = str;
				}
			}

			j--;
		}
		System.out.println(palindrome);
		return palindrome;
	
	}

}
