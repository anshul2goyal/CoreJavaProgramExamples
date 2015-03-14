package com.java.numbers.prime;

import java.util.Scanner;

/**
 * @author Anshul_Goyal
 * 
 * Program to find the largest prime factor of a positive Integer
 * 
 * @see Prime factors of a positive integer number are the prime numbers. 
 * 
 *  
 *
 */
public class LargestPrimeNumber {

	/**
	 * @param args
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String... args) {
		
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number for which prime factor needs to be calculated ::");
		
		
		long number = scanner.nextLong();
		
		System.out.printf("The largest prime factor is : %d\n",largestPrimeFactor(number));
		
		scanner.close();
		
	}
	
	
	/**
	 * Algorithm: 
	 * a. Divide the number with 2 (smallest prime number), start the loop with 2
	 * b. If number is divisible, then divide the number until its not divisible any more
	 * c. If number is not divisible, move to the next number.
	 */
	
	private static int largestPrimeFactor(long number){
		
		int i;
		
		for(i=2 ; i<= number; i++){
			
			if(number % i == 0){
				number /= i;
				i--;
			}
			
		}
		
		return i;
	}

}
