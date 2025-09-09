package ex04RecursionBasic;

public class StringReversal {
	public static void main(String [] args) {
		// string reversal with recursion
		String str = "hello";
		
		System.out.println(strReversal(str));
		
		// Palindrome - non recursively
		String pal = "kayak";
		System.out.println(isPalindrome(pal));
		
		System.out.println(isPal(pal)); 
		
		// Sum
		System.out.println(sum(10));
	}
	
	public static String strReversal(String str) {
		String s = str;
		// base case for recursion to end
		if(s.equals("")) {
			return s ;
		}
		
		return  strReversal(str.substring(1)) + str.charAt(0);
		
		//return s;
	} 
	
	
	// Non Recursively
	public static boolean isPalindrome(String str) {
		
		// first and last digit check for match on each iteration
		
		for(int i = 0; i < str.length()/2; i++) {
			
			if(str.charAt(i) != str.charAt(str.length() - i -1)) { // -1 cos str.length is > than actual length similar to arrays
				return false;
			}
			
		}
		
		return true;
		
	}
	
	// With Recursion
	public static boolean isPal(String str) {
		
		// define the base case
		if(str.length() == 0 || str.length() == 1) {
			return true;
		}
		
		if(str.charAt(0) != str.charAt(str.length() -1 )) {
			return false;
		}
		
		return isPal(str.substring(1, str.length() - 1));
		
	}
	
	// Decimal to Binary with Recursion
	
	public static String decBin(int dec, String result) {
		if(dec == 0) {
			return result;
		}
		
		result = dec % 2 + result;
		
		return decBin(dec / 2, result);
	}
	
	// Sum of all the natural numbers till n with Recursion
	public static int sum(int n) {
		if( n <= 0) {
			return n;
		}
		
		n = n + sum(n -1);
		
		return n;
	}
	
	
}
