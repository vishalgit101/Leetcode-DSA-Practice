package ex05ArraysEasyRevision;

public class Ex06MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

    // sum all the nums in the range as it should be - sum of nums
    public static int missing(int[] nums){
        int sum = 0;
        int orignalSum = 0;

        int j = 1;
        for(int i = 0; i< nums.length; i++){
            sum = sum + nums[i];
            orignalSum = orignalSum + j;
            j++;
        }
        return orignalSum - sum;
    }
}


