package ex05ArraysMediums;

public class Ex01SortColor {
	
	public static void main(String[] args) {
		int [] arr = /*00000*/ {0,1,1,0,1,2,1,2,0,0,0}; // 22222
	}
	
	// Now with the most optimized approach DNF algo.. Dutch National Flag
	public static void dnf(int [] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length -1;
		
		//NOTE: Using if and if and if... will cause problem as conditions will get rechecked after swap in lower ifs
		// to avoid that we do if else else instead
		
		while(mid <= high) { // till we have unsorted section...
			
			if(nums[mid] == 0) { // then swap low and mid with each other
				int temp = nums[mid];
				nums[mid] = nums[low];
				nums[low] = temp;
				low++;
				mid++;
			}else if(nums[mid] == 1) { // mid++; move mid
				mid++;
			}else {
			 // swap mid and high and shrink window by reducing high
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
				
			}	
			
		}
	}
	
	// Brute Force is with Sorting algos...
	
	// Better is with counting algo...
	public static void sortColor(int [] nums) {
		int red = 0;
        int white = 0;
        int blue = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                red++;
            }else if(nums[i] == 1){
                white++;
            }else{
                blue++;
            }
        }
        
        int i = 0;
        for(; i < red; i++) {
        	nums[i] = 0;

        }
        
        for(; i < red + white; i++) {
        	nums[i] = 1;
        }
        
        for(; i <nums.length; i++) {
        	 nums[i] = 2;
        }

        /*int i = 0; // redundant... use 3 for loops instead... i< red, i < white etc
        //and i will be 0 for first loop...
        // second loop: i = i + red
        // i = red+white
        while(i< nums.length){

           while( red > 0){
            nums[i] = 0;
            i++;
            red--;
           }

            while( white > 0){
            nums[i] = 1;
            i++;
            white--;
           }

            while( blue > 0){
            nums[i] = 2;
            i++;
            blue--;
           }

           i++;
            
        }*/
	}
}
