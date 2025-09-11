package ex05Arrays;

public class Ex09ConsecutiveOnes {
	
	public static void main(String[] args) {
		int[] nums = {1,1,0,1,1,1};
		
		System.out.println(maxOnes(nums));
	}
	
	public static int maxOnes(int nums[]) {
		int maxConsecutiveOnes = 0;
		int count = 0;
		//int i = 0;
		int j = 0;
		
		while(j < nums.length) {
			if(nums[j] == 1) {
				count++;
				j++;
				if(count > maxConsecutiveOnes) {
					maxConsecutiveOnes = count;
				}
			}else {
				j++;
				count = 0;
			}
		}
		
		return maxConsecutiveOnes;
	}
}
