package ex05ArraysMediumsRevision;

public class Ex12StockBuySell {

	public static void main(String[] args) {
		
		int [] prices = {7,1,5,3,6,4};
		
		System.out.println(maxProfit(prices));
		System.out.println(maxProfit2(prices));

	}
	
	public static int maxProfit2(int [] nums) {
		
		int maxProfit = Integer.MIN_VALUE;
		int el = nums[0];
		for(int n: nums) {
			int profit = n-el;
			if(profit > maxProfit) {
				maxProfit = profit;
			}
			
			if(profit < 0) {
				el = n;
			}
		}
		
		return maxProfit;
		
	}
	
	// Keeping track of the minimal and updating the it when n/i < min (current num is smaller than min)
	 public static int maxProfitOptimised(int[] prices){
        int maxProfit = 0;
        int min = prices[0];

        for(int i: prices){
            if(min > i){
                min = i;
            }
            if(maxProfit < i - min){
                maxProfit = i-min;
            }
        }

        return maxProfit;
}
	
	
	// WRONG!!! [2,4,1] fails
	public static int maxProfit(int [] nums) {
		//int profit = 0;
		int smallest = Integer.MAX_VALUE;
		int index = 0;
		int greatest = 0;
		for(int i = 0; i <nums.length; i++){
			if(nums[i]< smallest) {
				smallest = nums[i];
				index = i;
			}
		}
		
		for(int i = index; i < nums.length; i++) {
			if(nums[i] > greatest) {
				greatest = nums[i];
			}
		}
		
		//System.out.println("Smallest: " + smallest + " Greatest: " + greatest);
		if(greatest == 0) {
			return 0;
		}
		return greatest - smallest;
	}

}
