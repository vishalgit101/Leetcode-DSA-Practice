package ex01Basic;

public class ReverseInteger {
	
	public static void main(String[] args) {
		
		int num = -1234;
		
		System.out.println(reverseInteger2(num));
		
	}

	// does not handle negative
	private static int reverseInteger(int num) {
		
		// convert the int to str
		String strNum = String.valueOf(num);
		
		String reverse = "";
		
		for(int i = strNum.length() -1; i >= 0; i-- ) {
			reverse = reverse + strNum.charAt(i);
		}
		
		return Integer.valueOf(reverse);
	}
	
	// also handle negative
	
	private static int reverseInteger2(int num) {
		
		// convert the int to str
		String strNum = String.valueOf(Math.abs(num));
		
		String reverse = "";
		
		if(num < 0) {
			reverse = reverse + "-";
		}
		
		for(int i = strNum.length() -1; i >= 0; i-- ) {
			reverse = reverse + strNum.charAt(i);
		}
		
		return Integer.valueOf(reverse);
	}
}
