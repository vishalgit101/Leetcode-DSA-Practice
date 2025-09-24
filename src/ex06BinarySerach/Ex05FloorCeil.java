package ex06BinarySerach;

public class Ex05FloorCeil {

	public static void main(String[] args) {
		
		int [] nums = {3, 4, 4, 7, 8, 10};
		
		floorCeil(nums, 5);
		floorCeilRecursion(nums, 5);
		
	}
	
	public static void floorCeil(int[] nums, int x) {
		int start = 0;
		int end = nums.length-1;
		int ans = nums.length;
		// first find floor and then ceiling.
		int floor = floor(nums, x, start, end, ans);
		int ceil = ceil(nums, x, start, end, ans);
		
		System.out.println("Floor: " + floor + " Ceil: " + ceil);
		
	}
	
	public static int ceil(int[] nums, int x, int start, int end, int ans) {
		int mid = (start+end)/2;
		
		while(start<=end) {
			mid = (start+end)/2;
			
			if(nums[mid] == x) {
				ans = nums[mid];
				return ans;
			}
			
			if(nums[mid] > x) { // move left
				end = mid-1;
				ans = nums[mid];
			}else {
				start = mid+1;
			}
		}
		
		return ans;
	}
	
	public static int floor(int[] nums, int x, int start, int end, int ans) {
		int mid = (start+end)/2; // redundant
		
		while(start<=end) {
			mid = (start+end)/2;
			
			if(nums[mid] == x) {
				ans = nums[mid];
				return ans;
			}
			
			if(nums[mid] > x) { // move left
				end = mid-1;
				
			}else { // move right
				start = mid+1;
				ans = nums[mid];
			}
		}
		
		return ans;
	}
	
	// GPT single pass solution
	public static void floorCeil2(int[] nums, int x) {
	    int floor = Integer.MIN_VALUE;
	    int ceil = Integer.MAX_VALUE;

	    int start = 0, end = nums.length - 1;
	    while (start <= end) {
	        int mid = start + (end - start) / 2;

	        if (nums[mid] == x) {
	            floor = nums[mid];
	            ceil = nums[mid];
	            break;
	        }

	        if (nums[mid] < x) {
	            floor = nums[mid];  // candidate for floor
	            start = mid + 1;
	        } else {
	            ceil = nums[mid];   // candidate for ceil
	            end = mid - 1;
	        }
	    }

	    System.out.println("Floor: " + floor + " Ceil: " + ceil);
	}
	
	// with recursion...
	public static void floorCeilRecursion(int [] nums, int x) {
		int start = 0;
		int end = nums.length-1;
		int ansFloor = 0;
		int ansCeil = 0;
		
		ansFloor = floorRecursion(nums, x, start, end, ansFloor);
		ansCeil = ceilRecursion(nums, x, start, end, ansCeil);
		
		System.out.println("Floor: " + ansFloor + " Ceil: " + ansCeil);
		
	}
	
	public static int ceilRecursion(int [] nums, int x, int start, int end, int ans) {
		int mid = (start+end)/2;
		
		if(start>end) {
			return ans;
		}
		
		 if (nums[mid] == x) {
			 return nums[mid];
		 }
		
		if(nums[mid] > x) { // move left
			return ceilRecursion(nums, x, start, mid-1, nums[mid]);
		}else {
			return ceilRecursion(nums, x, mid+1, end, ans);
		}
		
	}

	public static int floorRecursion(int [] nums, int x, int start, int end, int ans) {
		int mid = (start+end)/2;
		
		if(start>end) {
			return ans;
		}
		
		 if (nums[mid] == x) {
			 return nums[mid];
		 }
		
		if(nums[mid] > x) { // move left
			return floorRecursion(nums, x, start, mid-1, ans);
		}else {
			return floorRecursion(nums, x, mid+1, end, nums[mid]);
		}
		
	}


}
