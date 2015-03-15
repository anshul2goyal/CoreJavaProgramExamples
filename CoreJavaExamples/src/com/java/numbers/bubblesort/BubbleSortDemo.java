/**
 * 
 */
package com.java.numbers.bubblesort;

import java.util.Arrays;

/**
 * @author Anshul_Goyal
 * 
 * This class will sort the unsorted array without using any in-build sorting API.
 *  
 * This will use the example of bubble sort 
 *
 */
public class BubbleSortDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] unsortedArray = {12,33,4,22,423,444,41};
		
		bubbleSort(unsortedArray);
	}
	
	/**
	 * Method to swap the two adjacent numbers in the array to push the largest number to the end. 
	 * 
	 * @param unsortedArray
	 */
	private static void bubbleSort(int [] unsortedArray){
		
		System.out.println("Array before sorting :: "+ Arrays.toString(unsortedArray));
		
		// First pass to loop through all the elements in the array
		for(int i=0; i< unsortedArray.length -1; i++){
			
			// Inner loop to compare the elements with each other and swap the places. 
			for(int j=1; j<=unsortedArray.length -1; j++){
				
				if(unsortedArray[j-1] > unsortedArray[j]){
					int temp = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j-1];
					unsortedArray[j-1] = temp;
				}
			}
			System.out.printf("unsorted array after %d pass %s: %n", i+1, Arrays.toString(unsortedArray));
		}
	}

}
