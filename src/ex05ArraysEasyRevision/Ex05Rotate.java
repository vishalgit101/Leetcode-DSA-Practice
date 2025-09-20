package ex05ArraysEasyRevision;

public class Ex05Rotate {
	public static void main(String[] args) {
		
	}
	
	public static void rotateArr(int [] nums, int k){
        // rotate the array to the right
        int[] arr = new int[nums.length];

        for(int i = 0; i< nums.length; i++){
            int x = (i+k)%nums.length;
            arr[x] = nums[i];
        }

        for(int i = 0; i<nums.length; i++){
            nums[i] = arr[i];
        }
    }
}
