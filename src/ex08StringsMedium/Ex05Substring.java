package ex08StringsMedium;

public class Ex05Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class SubstringsExample {
	    public static void main(String[] args) {
	        String s = "abc";
	        int n = s.length();

	        // Outer loop for starting index
	        for (int i = 0; i < n; i++) {
	            // Inner loop for ending index
	            for (int j = i; j < n; j++) {
	                // substring from i to j (inclusive)
	                String sub = s.substring(i, j + 1);
	                System.out.println(sub);
	            }
	        }
	    }
	}
	
	// if we only want to the count the number of substrings 
	public class SubstringCount {
	    public static void main(String[] args) {
	        String s = "abc";
	        int n = s.length();

	        int total = n * (n + 1) / 2;
	        System.out.println("Total substrings: " + total);
	    }
	}



}
