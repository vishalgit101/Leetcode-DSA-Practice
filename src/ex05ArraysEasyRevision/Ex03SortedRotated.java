package ex05ArraysEasyRevision;

public class Ex03SortedRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean sorted(int [] nums){
        int dropIndex = 0;
        int dropCount = 0;
        for(int i = 0; i< nums.length -1; i++){
            if(nums[i] > nums[i+1]){
                dropIndex = i+1;
                dropCount++;
            }
        }

        if(nums[nums.length-1] > nums[0]){
            dropCount++; 
        }

        if(dropCount > 1){
            return false;
        }

        int rotate =  nums.length - dropIndex;

        int[] temp = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            int x = (i+rotate) % nums.length;
            temp[x] = nums[i];
        }

        // Now we can either iterate through entire array to check it its sorted
        // Or we can keep dropCount var that checks if there were more than 1 drop points...

        return true;
    }

}
