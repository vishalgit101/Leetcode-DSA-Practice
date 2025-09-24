package ex07Strings;

public class Ex02LargestOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String odd(String num){
        int index = -1;
        StringBuilder str = new StringBuilder();

        for(int i = num.length()-1; i>= 0; i--){
            int number = num.charAt(i) - '0';

            if(number % 2 != 0){ // means odd
                index = i;
                break;
            }
        }

        if(index == num.length()-1){
            return num;
        }

        for(int i = 0; i<=index; i++){
            str.append(num.charAt(i));
        }

        if(index == -1){ // no odd found
            return "";
        }

        return str.toString();

    }

    // using substring and single pass
    public static String odd2(String num){

        for(int i = num.length()-1; i>=0; i--){
            int number = num.charAt(i) - '0';

            if(number % 2 != 0){
                return num.substring(0,i+1);
            }
        }

        return "";
    }

}
