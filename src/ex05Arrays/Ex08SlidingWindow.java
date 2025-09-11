package ex05Arrays;

import java.util.HashSet;
import java.util.Set;

public class Ex08SlidingWindow {
	
	public static void main(String[] args) {
		// find the highest sum of 5 continuous numbers in the array
		int arr[] = {12,9,23,17,25,19,4,8,21,34,26,17,19,14,27,22,15,7,2,14,5,18,24};
		
		System.out.println(nonSlidingWindow(arr, 5));
		System.out.println(slidingWindow(arr, 5));
		
		// maximum number of vowels in a substring
		// can do this multiple ways; either we could have a string of vowels: "aeiou" or array of chars:
		char[] vow = {'a','e','i','o','u'};
		// or with Set or ArrayList to use contains
		HashSet<Character> vowels = new HashSet<Character>();
		
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		String s = "bacacbefaobeacfe";
		
		System.out.println(maxVowles(s, vowels, 5));
		
		System.out.println(maxVowels2(s, vowels, 5));
		
		
 	}
	
	
	// with sliding windows
	public static int maxVowels2(String s, Set<Character> vowels, int k) {
		int maxVowels = 0;
		int tempCount = vowelCount2(s, vowels, k);
		
		for(int i = 0; i< s.length() -k; i++) {
			if(vowels.contains(s.charAt(i))) {
				tempCount = tempCount - 1;
			}
			
			if(vowels.contains(s.charAt(i + k))) {
				tempCount = tempCount + 1;
			}
			
			if(tempCount > maxVowels) {
				maxVowels = tempCount;
			}
		}
		
		return maxVowels;
		
	}
	
	public static int vowelCount2(String s, Set<Character> vowels, int k) {
		int count = 0;
		for(int i = 0; i < k; i++) {
			if(vowels.contains(s.charAt(i))) {
				count++;
			}
			
		}
		
		return count;
	}
	
	
	// non sliding windows
	public static int maxVowles(String s, Set<Character> vowels, int k) { // k: window
		int maxVowels = 0;
		
		for(int i = 0; i< s.length() -k; i++) {
			int tempCount = vowelCount(s, vowels, k, i);
			if(tempCount > maxVowels) {
				maxVowels = tempCount;
			}
		}
		
		return maxVowels;
	}
	
	public static int vowelCount(String s, Set<Character> vowels, int k, int start) {
		int count = 0;
		
		for(int i = start; i< start + k ; i++) {
			if(vowels.contains(s.charAt(i))) {
				count++;
			}
		}
		
		return count;
	}
	
	
	// with Sliding windows
	public static int slidingWindow(int [] arr, int k) {
		int maxSum = 0;
		// find the sum once
		int tempSum = sumSlidingWindow(arr, k);
		
		for(int i =0; i< arr.length -k; i++) {
			tempSum = (tempSum - arr[i]) + arr[i+k];
			
			if(tempSum > maxSum) {
				maxSum = tempSum;
			}
		}
		
		return maxSum;
		
	}
	
	public static int sumSlidingWindow(int [] arr, int end) { // end or window, whatever
		int sum = 0;
		 for(int i = 0; i< end; i++) {
			 sum = sum + arr[i];
		 }
		 
		 return sum;
	}
	
	
	
	// brute force way
	public static int nonSlidingWindow(int[] arr, int k) { 
		int maxSum = 0;
		for(int i = 0; i< arr.length -k; i++) {
			int tempSum = sum(arr, i, k);
			if(tempSum > maxSum) {
				maxSum =  tempSum;
			}
		}
		
		return maxSum;
		
	}
	
	public static int sum(int[] arr, int start, int window) {
		int sum = 0;
		for(int i = start ; i< start + window; i++) { // star + window/end is important for correct indexing, otherwise with increasing i summation window will reduce
			sum = sum + arr[i];
		}
		
		return sum;
	}
	
	
	
}
