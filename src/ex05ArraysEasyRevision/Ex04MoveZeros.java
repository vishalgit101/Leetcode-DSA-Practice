package ex05ArraysEasyRevision;

public class Ex04MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void shift(int[] nums){
        int i =0;
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }

}
