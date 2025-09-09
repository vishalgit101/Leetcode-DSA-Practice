package ex05Arrays;
// Find Second Smallest and Second Largest Element in an array
public class Ex02SecondLargest {
	public static void main(String[] args) {
		int [] arr = {1,2,4,7,7,5};
		int [] arr2 = {1};
		secondLargetSmallest(arr);
	}
	
	public static void secondLargetSmallest(int[] arr) {
		
		if(arr.length == 1) {
			System.out.println(-1);
		}
		
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		int secondLarget = largest -1;
		int secondSmallest = smallest -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				secondLarget = largest;
				largest = arr[i];
				
			}else if(arr[i] > secondLarget && arr[i] < largest) {
				secondLarget = arr[i];
			}
			
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
				
			}else if(arr[i] < secondSmallest && arr[i] > smallest) {
				secondSmallest = arr[i];
			}
		}
		
		System.out.println("Largest: " +largest);
		System.out.println("Smallest: " +smallest);
		
		
		System.out.println();
		
		System.out.println("Second largest: " +secondLarget);
		System.out.println("Second smallest: " +secondSmallest);
		
	}
}
