package ex08StringsMedium;

import java.util.HashMap;

public class Ex03RomanIntegerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int roman(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
        	
            int curr = map.get(s.charAt(i));
            
            if (i < s.length() - 1 && curr < map.get(s.charAt(i+1))) {
                sum -= curr; // subtract in case of IV, IX, etc.
            } else {
                sum += curr;
            }
        }
        return sum;
    }

}
