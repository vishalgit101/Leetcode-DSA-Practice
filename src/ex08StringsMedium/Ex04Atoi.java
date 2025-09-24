package ex08StringsMedium;

public class Ex04Atoi {

	public static void main(String[] args) {
		
		String str = "-042";
		
		System.out.println(Integer.parseInt(str));
		
		

	}
	
	public static int myAtoi(String s) {
		String str = "";
		
		for(char c:s.toCharArray()) {
			
			if(c == ' ') {
				continue;
			}else if(c == '-' && str.isEmpty()) {
				str = str + c;
			}else if(!Character.isDigit(c)) {
				break;
			}else {
				str = str + c;
			}
		}

        /*for(char c:s.toCharArray()){
            
            if(c == '-' && str.isEmpty()){
                str = str + c;
            }else if(Character.isDigit(c)){
                str = str+c;
            }
        }*/

        System.out.println(str);
        return Integer.parseInt(str);
		
	}

}
