package ex06BinarySerach;

public class Ex01Search {

	public static void main(String[] args) {
		int [] nums = {-1,0,3,5,9,12};
		System.out.println(binarySearch(nums, 9));
		
		System.out.println(binarySearch2(nums, 13));

	}
	  // using non-recursive way...
    public static int binarySearch(int [] nums, int target){

        int start = 0;
        int end = nums.length-1;
        
        int mid = 0;
        while(start <= end){
        	
        	mid = (start + end)/2;
        	
            if(nums[mid] == target){
                return mid;
            }

            // else change start and end
            if(target > nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
    
    // with recursion
    public static int binarySearch2(int[] nums, int target) {
    	int start = 0;
    	int end = nums.length -1;
    	
    	return recurse(start, end, nums, target);
    	
    }
    
    public static int recurse(int start,int end, int [] nums, int target) {
    	int mid = (start+end)/2;
    	
    	// define the base case...
    	if(nums[mid] == target) {
    		return mid;
    	}
    	
    	if(start <= end) {
    		if(target > nums[mid]) {
        		return recurse(mid+1, end, nums, target);
        	}else {
        		return recurse(start, mid-1, nums, target);
        	}
    	}
    	
    	/*if(start>end) {
    		if(target < nums[mid]) {
    			return mid;
    		}else {
    			return mid+1;
    		}
    		
    	}*/
    	
    	return start;
    	
    	
    }

}
