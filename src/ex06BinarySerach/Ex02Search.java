package ex06BinarySerach;

public class Ex02Search {

	public static void main(String[] args) {
		
		/*
		 * []
		42
		[7,8,8,8,8,8,8,8,8,8,8,9]
		7
		[7,8,8,8,8,8,8,8,8,8,8,9]
		8
		[7,8,8,8,8,8,8,8,8,8,8,9]
		10
		[1,2,2,2,2,3,4,5,5,5,5,6,7,8,9,10,11,12,12,12,12,12,13]
		2
		[-999985131,-999953607,-999953607,-999915742,-999883817,-999849817,-999822901,-999815377,-999810801,-68594,-49967,20394,114012,999969829,999973689,999975494]
		-999953607*/

	}
	

	// Could have been easier....
    // non-recursively
    public static int[] binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        int [] output = new int[2];
        while(start<=end){

            mid = (start+end)/2;

            if(target == nums[mid]){
                // target found... now do the binary serach to find the start and end index of that number
                output[0] = leftSearch(nums, target,start,end);
                output[1] = rightSearch(nums,target,start,end);

                return output;
            }
            
            if(target< nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return new int[]{-1,-1};
    }

    public static int leftSearch(int[] nums, int target, int start, int end){
        while(start<=end){
           int mid = (start+end)/2;
           if (nums[mid] == target) {
                end = mid - 1;   // keep searching left
            } else if (nums[mid] < target) {
                start = mid + 1; // search right
            } else {
               // end = mid - 1;   // search left
            }
        }
     // returns the index of first occurance...
        return start;
}

    public static int rightSearch(int[] nums, int target, int start, int end){
         while(start<=end){
            int mid = (start+end)/2;
           if (nums[mid] == target) {
                start = mid +1;   // keep searching right
            } else if (nums[mid] < target) {
               // start = mid + 1;   // search right
            } else {
                end = mid -1; // search left
            }
        }
        // returns the index of last occurance...
        return end;
    }

}
