package ex08StringsMedium;

public class Ex02ParanthesesDepth {

	public static void main(String[] args) {
		
		String s = "(1+(2*3)+((8)/4))+1";

	}
	
    public static int depth(String s){
        int maxCount = 0;
        int count = 0;

        for(char c: s.toCharArray()){

            if(c == '('){
                count++;
            }

            if(c == ')'){
                
                if(count > maxCount){
                    maxCount = count;
                }
                count--;
            }

        }

        return maxCount;
    }

}
