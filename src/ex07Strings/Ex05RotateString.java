package ex07Strings;

public class Ex05RotateString {

	public static void main(String[] args) {
		String s = "abcde", goal = "cdeab";
		
		rotate(s,goal);
		System.out.println();
		rotate2(s, goal);
	}
	

    public static boolean rotate(String s, String goal){
        int end = goal.length();
        int i = 0;
        String str = "";
        while(i<end){
           StringBuilder sb = new StringBuilder();
            str = s.substring(i+1,end); // inclusive, exclusive;
            sb.append(str);
            //System.out.println(sb.toString());
            for(int j = 0; j <= i; j++){
                sb.append(s.charAt(j));
            }

            if(sb.toString().equals(goal)){
                //return true;
            }
            
            System.out.println(sb.toString());

            //end--;
            i++;
        }

        return false;
    }
    
    // Optimized
    public static boolean rotate2(String s, String goal){
    	 int end = goal.length();
         int i = 0;
         String str = "";
         
         while(i<end) {
        	 str =  s.substring(i+1,end) + s.charAt(0);
        	 
        	 if(str.equals(goal)) {
        		 return true;
        	 }
        	 
        	 System.out.println(str);
        	 i++;
         }
         
         return false;
         
    }
    
    // GPT 
    public static boolean rotate3(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
    
    //SMART
    public boolean rotateString(String s, String goal) {
        for(int i =0;i<s.length();i++){
            String rotated = s.substring(i) + s.substring(0, i);
            if(rotated.equals(goal)){
                return true;
            }
        }
        return false;
    }

    

}
