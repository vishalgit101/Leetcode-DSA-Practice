package ex06BinarySerach;

public class Ex06Occurance {

	public static void main(String[] args) {
		
		int [] nums = {2, 2 , 3 , 3 , 3 , 3 , 4};
		
		System.out.println(occurance(nums, 3));
	}
	
	// WRONG!!
	//✅ The problem: the middle occurrence can be counted twice, depending on how your search splits.
	public static int occurance(int [] nums, int x) {
		int start = 0;
		int end = nums.length -1;
		int mid = 0;
		int count = 0;
		
		return count = leftOccurance(nums, x, start, end, count) + rightOccurance(nums, x, start, end, count);
		
	}
	
	
	// important to do this in if if else else block
	public static int leftOccurance(int[] nums, int x, int start, int end, int count) {
		int mid = 0;
		while(start<=end) {
			mid = (start+end)/2;
			if(nums[mid] == x) {
				count++;
				end = mid-1; // keep searching left...
			}else if(nums[mid] > x) { // move left
				end = mid -1;
			}else {
				start = mid+1;
			}
		}
		
		return count;
	}
	
	// important to do this in if if else else block
	public static int rightOccurance(int[] nums, int x, int start, int end, int count) {
		int mid = 0;
		while(start<=end) {
			mid = (start+end)/2;
			if(nums[mid] == x) {
				count++;
				start = mid+1; // keep searching right...
			}else if(nums[mid] > x) { 
				end = mid -1;// move left
			}else {
				start = mid+1;
			}
		}
		
		return count;
	}
	
	
	// CORRECT APPROACH
	public static int occurance2(int[] nums, int x) {
	    int left = leftOccurance2(nums, x);
	    if(left == -1) return 0; // x not present
	    int right = rightOccurance2(nums, x);
	    return right - left + 1;
	}
	
	public static int leftOccurance2(int[] nums, int x) {
	    int start = 0, end = nums.length-1, leftIndex = -1;
	    while(start <= end) {
	        int mid = (start + end)/2;
	        if(nums[mid] == x) {
	            leftIndex = mid;
	            end = mid-1; // move left
	        } else if(nums[mid] > x) {
	            end = mid-1;
	        } else {
	            start = mid+1;
	        }
	    }
	    return leftIndex;
	}

	public static int rightOccurance2(int[] nums, int x) {
	    int start = 0, end = nums.length-1, rightIndex = -1;
	    while(start <= end) {
	        int mid = (start + end)/2;
	        if(nums[mid] == x) {
	            rightIndex = mid;
	            start = mid+1; // move right
	        } else if(nums[mid] > x) {
	            end = mid-1;
	        } else {
	            start = mid+1;
	        }
	    }
	    return rightIndex;
	}




}
