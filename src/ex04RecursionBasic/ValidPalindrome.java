package ex04RecursionBasic;

public class ValidPalindrome {

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		
		System.out.println(isValid(s));

	}
	
	public static boolean isValid (String s) {
		 // i have to remove all the spaces and non alphanumeric charaters and
        // then do the checks...

        // Character.isLetterOrDigit(c)
		
		s = s.toLowerCase();

        String str = "";

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str = str+s.charAt(i);
            }
        }
        
       return isPal(str);
	}
	
	public static boolean isPal(String s) {
		if(s.length() == 1 || s.length() == 1 ){
           return  true;
        }

        if(s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }

        return isPal(s.substring(1, s.length() - 1));
	}

}
