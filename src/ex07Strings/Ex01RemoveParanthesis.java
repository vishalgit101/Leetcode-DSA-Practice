package ex07Strings;

public class Ex01RemoveParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// careful where you inc or dec the counter
	public static String remove(String s){
        int counter = 0;
        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == ')'){
                counter--;
            }

            if(counter > 0){
                str.append(c);
            }

            if(c == '('){
                counter++;
            }
        }

        return str.toString();
    }
	
	public static String remove2(String s) {
	    StringBuilder sb = new StringBuilder();
	    int counter = 0;

	    for (char c : s.toCharArray()) {
	        if (c == '(') {
	            if (counter > 0) sb.append(c); // only append if not outermost
	            counter++;
	        } else { // c == ')'
	            counter--;
	            if (counter > 0) sb.append(c); // only append if not outermost
	        }
	    }

	    return sb.toString();
	}

	
	

}
