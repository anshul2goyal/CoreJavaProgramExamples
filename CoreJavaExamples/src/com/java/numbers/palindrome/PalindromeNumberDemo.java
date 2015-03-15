package com.java.numbers.palindrome;

import java.util.Scanner;

/**
 * @author Anshul_Goyal
 * 
 * Class to identify whether the number is a palindrome or not
 *
 */
public class PalindromeNumberDemo {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number...");
		
		int number = scanner.nextInt();
		
		palindromeNumber(number);
		
		scanner.close();
	}
	
	/**
	 * Method to identify whether the number is a palindrome or not.
	 * 
	 * Logic:
	 * a. Take the remainder of the number by dividing it with 10.
	 * b. Reverse the number and add the remainder to it
	 * c. divide the number by 10 to get the quotient
	 * 
	 * for example: input number is 121
	 * 
	 * a. Take the remainder:
	 * 		(121 % 10) = 1
	 * b. initialize the new reference with 0 (once only so outside the loop) and add the remainder:
	 * 		(0  * 10) + 1 (remainder from step1) = 1
	 * c. divide the number with 10 to get the quotient
	 * 		(121/10) = 12
	 * 
	 * d. repeat the steps 1~3 till the number becomes 0.
	 * 
	 * 
	 * Result:
	 *  If the number is equal to the new reverse number, then it is a palindrome otherwise it is not.
	 * 
	 * 
	 * @param number
	 */
	private static void palindromeNumber(int number) {
		
		int palindrome = number;
		
		int reverse = 0;
		
		while(palindrome > 0){
			int remainder = palindrome % 10;
			reverse = (reverse * 10) + remainder;
			palindrome /= 10;
		}
		
		if(number == reverse ){
			System.out.printf("Number %d is a palindrome", number);
		} else {
			System.out.printf("Number %d is not a palindrome", number);	
		}
	}
	

}
