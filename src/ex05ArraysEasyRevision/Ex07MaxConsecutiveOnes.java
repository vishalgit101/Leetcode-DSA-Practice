package ex05ArraysEasyRevision;

public class Ex07MaxConsecutiveOnes {

	public static void main(String[] args) {
		int [] nums = {1,1,0,1,1,1};
		
		System.out.println(maxCon(nums));
	}
	
	public static int maxCon(int[] nums) {
		int maxCount = 0;
		int count = 0;
		for(int n : nums) {
			if(n ==1) {
				count++;
				if(count > maxCount) {
					maxCount = count;
				}
			}else {
				count = 0;
			}
		}
		return maxCount;
	}

}
