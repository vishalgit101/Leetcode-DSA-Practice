package ex01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
	// Two ways to declare arrays in java.
		
		int [] odds = new int [5];
		odds[0] = 1;
		odds[1] = 3;
		odds[2] = 5;
		
		System.out.println( "Odds: " +Arrays.toString( odds));
		
		int [] even = {2,4,6};
		
		System.out.println("Even: " + Arrays.toString(even));
		
		int [] duplicates = {2,2, 5,5, 6, 2, 5, 7, 6};
		
		int [] uniques = duplicates(duplicates);
		
		System.out.println("Uniques: " + Arrays.toString(uniques));
		
		// finding duplicates with just arrays or arrays list
		
		ArrayList<Integer> uniques2  = duplicates2(duplicates);
		
		System.out.println("Uniques with ArrayList :" + uniques2);
		
		System.out.println(freq(duplicates));
		
		System.out.println("Primes: " +primes(0, 100));

	}
	
	// Remove Duplicates from an Array using set
	public static int[] duplicates(int[] duplicates) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int d: duplicates) {
			set.add(d);
		}
		
		int[] arr = new int[set.size()];
		
		int i = 0;
		for(Integer s : set) {
			arr[i] = s;
			i++;
		}
		
		return arr;
		
	}
	
	// Removing duplicates using just array
	public static ArrayList<Integer> duplicates2(int [] duplicates) {
		
		ArrayList<Integer> uniques = new ArrayList<Integer>();
		
		for(int i = 0; i< duplicates.length; i++) {
			if(! exists(uniques, duplicates[i])) {
				uniques.add(duplicates[i]);
			}
		}
		
		return uniques;
		
	}
	
	public static boolean exists(ArrayList<Integer> arr, int num) {
		
		for(int i = 0; i< arr.size(); i++) {
			if(arr.get(i) == num) {
				return true;
			}
		} 
		
		return false;
		
	}
	
	// finding the frequencies of numbers;
	public static HashMap<Integer,Integer> freq(int[] arr) {
		HashMap< Integer, Integer> freq = new HashMap<Integer, Integer>();
		// single for loop to register all the keys
		for(Integer i: arr) {
			if(freq.containsKey(i)) {
				int count = freq.get(i);
				freq.put(i, count +1);
			}else {
				freq.put(i, 1);
			}
			
		}
		
		// out of curiosity iterating over keys or values of a hash map
		//for(Integer i : freq.keySet())
		//for (Integer i : freq.values())
		
		return freq;
	}
	
	
	// Now Finding primes till n
	public static ArrayList<Integer> primes(int start, int end) {
		ArrayList< Integer> primes = new ArrayList<Integer>();
		for(int i = start; i < end; i ++ ) {
			if(!divisible(i)) {
				primes.add(i);
			}
		}
		
		return primes;
		
	}
	
	public static boolean divisible(int num) {
		
		// for nums below 3
		switch (num) {
			case 0: {
				return true;
			}
			case 1: {
				return true;
			}
			case 2: {
				return false;
			}
		}
		
		// for nums above 2
		for(int i = 2 ; i < num; i++) {
			if(num % i == 0) {
				return true;
			}
		}
		return false;
	}

}
