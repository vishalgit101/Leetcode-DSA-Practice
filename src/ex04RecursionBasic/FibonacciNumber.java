package ex04RecursionBasic;

public class FibonacciNumber {
	public static void main(String[] args) {
		System.out.println(fib(4));
	}
	
	public static int fib(int n) {
		
		int current = 0;
		int last = current ;
		int secondLast = 1;
		
		//int sum = 0;
		for(int i = 1; i <= n; i++) {
			
			current = last + secondLast;
			
			secondLast = last;
			last = current;
			
			
		}
		
		return current;
		
	}
}
