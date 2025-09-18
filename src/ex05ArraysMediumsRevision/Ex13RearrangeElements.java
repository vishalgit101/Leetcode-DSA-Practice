package ex05ArraysMediumsRevision;

public class Ex13RearrangeElements {

	public static void main(String[] args) {
		int [] nums = {3,1,-2,-5,2,-4};
	}
	
	// single pass solution...
	public static int[] rearrange2(int[] nums) {
		int [] arr = new int[nums.length];
		int pos = 0;
		int neg = 1;
		
		// if num is negative put it on the odds place 
		// if num is postive put it on the evns place
		// works for only even length arrays
		for(int i = 0; i< nums.length; i++) {
			if(nums[i] > 0) {
				arr[pos] = nums[i];
				pos = pos +2;
			}else {
				arr[neg] = nums[i];
				neg = neg + 2;
			}
		}
		
		return arr;
		
	}
	
	// doing with extra space... +ve and -ve arrays and double pass
	public static int[] rearrange(int[] nums) {
		// nums is of even size
		int m = nums.length/2;
		
		int[] postives = new int[m];
		int[] negetives = new int[m];
		
		int countPos = 0;
		int countNeg = 0;
		for(int n: nums) {
			// pass positives and negatives on their respective arrrays
			if(n > 0) {
				postives[countPos] = n;
				countPos++;
			}else {
				negetives[countNeg] = n;
				countNeg++;
			}
		}
		
		
		countPos = 0;
		countNeg = 0;
		// Now pass +ve and -ve on even their respective index
		for(int i = 0; i < nums.length; i++) {
			if(i%2==0) {
				nums[i] = postives[countPos];
				countPos++;
			}else {
				nums[i] = negetives[countNeg];
				countNeg++;
			}
		}
		
		return nums;
	}
}
