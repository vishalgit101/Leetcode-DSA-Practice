package ex05ArraysMediums;


import java.util.Arrays;


public class Ex07NextPermutation {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		nextPer(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void nextPer(int [] nums) {
		int brk = 0; // index  of the break; from right to left... need to find a num smaller from right to define the break point
		int brkNum = 0;
		
		boolean occur = false;
		// find the break point...
		for(int i = nums.length -1; i > 0; i--) {
			
			if(nums[i] > nums[i-1]) {
				brk = i -1;
				brkNum = nums[i-1];
				occur = true;
				break;
			}
		}
		
		if(!occur) { // if didnt occur then reverse the array
			int[] reversed = new int[nums.length];
			
			int x = 0;
			for(int i = nums.length -1; i >= 0; i--) {
				reversed[x] = nums[i];
				x++;
			}
			
			for(int i = 0; i< nums.length; i++) {
				nums[i] = reversed[i];
			}
			
			return;
		}
		
		//System.out.println(brk);
		//System.out.println(brkNum);
		
		// Now from that break point find the num which is smaller than the num at break point
		int num = Integer.MAX_VALUE;
		int index = 0;
		for(int i = brk; i< nums.length; i++) {
			if(nums[i] > brkNum && nums[i] < num) {
				num = nums[i];
				index = i;
			}
		}
		
		// now sawp the break point num with the num
		nums[brk] = num;
		nums[index] = brkNum;
		
		/*// 5. reverse the suffix in place
        int left = brk + 1;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }*/ 
		
		// remove below
		
		// Now form an array from brk + 1 to nums len
		 int l = nums.length - (brk+1);
		 int [] arr = new int [l];
		
		 //System.out.println("Length" + l);
		 
		 int count = 0;
		for(int i = brk+1; i< nums.length; i++ ) {
			arr[count] = nums[i];
			count++;
			//System.out.println("check");
		}
		
		Arrays.sort(arr);
		/*System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(nums));*/
		
		count = 0;
		for(int i = brk +1; i< nums.length;i++) {
			nums[i] = arr[count];
			count++;
		}
		
	}
}
