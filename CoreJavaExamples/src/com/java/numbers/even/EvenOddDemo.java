/**
 * 
 */
package com.java.numbers.even;

import java.util.Scanner;

/**
 * @author Anshul_Goyal
 *
 */
public class EvenOddDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number :");
		
		try{
			long number = scanner.nextLong();
			
			System.out.println("Use Modulus operator for finding even/odd number ");
			
			System.out.printf("The number passed is even : %s",evenOrOddNumber(number) +"\n\n");
			
			System.out.println("Use Bitwise operator for finding even/odd number ");
			
			eventOrOddBitwise(number);
		}catch(Exception ex){
			System.out.printf("The number passed is not a natural number\n\n");
		}finally{
			scanner.close();
		}
	}
	
	/**
	 * This method checks whether the number provided as an input is completely divisible by 2,
	 * 
	 * if yes then number is even number and if not then it is an odd number
	 * 
	 * @param number Number to be checked for even/odd
	 * @return flag true when number is even and false if number is odd.
	 */
	private static boolean evenOrOddNumber(long number){
		
		boolean evenFlag = false;
		if(number % 2 == 0){
			evenFlag = true;
		}
		
		return evenFlag;
	}
	
	/**
	 * Method to check whether the passed number is even/odd using the bitwise & operator.
	 * 
	 * @param number
	 */
	private static void eventOrOddBitwise(long number){
		
		if( (number&1) == 0){
			System.out.printf("Number %d is even.", number);
		}else {
			System.out.printf("Number %d is odd.", number);
		}
	}
}
