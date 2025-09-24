package ex06BinarySerach;

public class Ex07RotatedSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// with duplicates Leetcode 81 add this condition: 
	/*
	  if(nums[start] == nums[mid] && nums[mid] == nums[end] ){
                start = start +1;
                end = end -1;
                continue;
       }
	 */
	
	 // binary search in a rotated but sorted arary
    public static int rotatedSorted(int[] nums, int target ){
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[start]<= nums[mid]){ // left portion is sorted
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{ // right portion is sorted
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }

        }

        return -1;
    }

}
