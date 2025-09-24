package ex06BinarySerach;

public class Ex11SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 // Two ways... One with linear search checking left right being equal
    // Binary search with even odd and checking left right
    public static int singleElement(int[] nums){

        int start = 1;
        int end = nums.length-2;
        int mid = 0;
        while(start<=end){
            mid = (start+end)/2;

            // edge cases...left most, right most.
            if(nums[0] != nums[1]){
                return nums[0];
            }

            if(nums[nums.length-1] != nums[nums.length-2]){
                return nums[nums.length-1];
            }

            // binary serach on the middle portion...
            // check if is is the single element
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }

            // check which half you are on...
            if((mid % 2 == 1 && nums[mid] == nums[mid-1]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])){ // means you are on the left half
                // eliminate the left half
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return nums[mid];
    }

}
