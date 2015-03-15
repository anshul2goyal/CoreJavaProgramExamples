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
		
		return (number%2 == 0);
	}
	
	/**
	 * Method to check whether the passed number is even/odd using the bitwise & operator.
	 * 
	 * For example, if a number is even then the pattern in binary form is XXX...X0, i.e. the first low order bit is 0 and X can be 0/1
	 * 
	 *  8 : 00001000
	 * 16 : 00010000
	 * 12 : 00001100  
	 * 
	 * Now binary representation of 1 is always : 00000001
	 * 
	 * So using the AND operation in binary
	 * ---------------------------------------
	 * 
	 *  1 & 1 = 1
	 *  0 & 0 = 0
	 *  1 & 0 = 0
	 *  0 & 1 = 0
	 *  
	 *  --------------------------------------
	 *  
	 *  XXX0
	 *  0001
	 *  ----
	 *  0000
	 *  
	 *  so the equivalent decimal number of 0000 is 0;
	 *  
	 *  This means if (number&1) == 0 then it is an even number.
	 * 
	 * @param number number passed to check for even or odd
	 */
	private static void eventOrOddBitwise(long number){
		
		if( (number&1) == 0){
			System.out.printf("Number %d is even.", number);
		}else {
			System.out.printf("Number %d is odd.", number);
		}
	}
}
