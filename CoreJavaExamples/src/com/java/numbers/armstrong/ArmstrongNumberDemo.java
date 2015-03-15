package com.java.numbers.armstrong;

import java.util.Scanner;

/**
 * @author Anshul_Goyal
 * 
 * Class to find the Armstrong number of any number.
 *
 */
public class ArmstrongNumberDemo {

	/**
	 * @param args
	 * 
	 */
	public static void main(String... args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number ....");
		
		int number = scanner.nextInt();
		
		findArmstrongnumber(number);
		
		scanner.close();
	}
	
	/**
	 * Method to find the Armstrong number, an Armstrong number is three digit number for which
	 * the cube of its digit is equal to the sum of the digit
	 * 
	 * e.g. 153 = 1 + 125 + 27 so 153 is an Armstrong number.
	 *  
	 * @param number
	 */
	private static void findArmstrongnumber(int number){
		
		int result = 0;
		int orig = number;
		while(number > 0){
			int remainder = number % 10;
			result += (remainder*remainder*remainder);
			number /= 10;
		}
		
		if(orig == result){
			System.out.printf("Number %d is an Armstrong number", orig);
		}else {
			System.out.printf("Number %d is not an Armstrong number", orig);
		}
	}

}
