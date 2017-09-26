/**
 * 
 */
package assignment6_1;

import java.util.Arrays;

/**
 * 
 * Print even numbers in a Array of 10
 * 
 * @author Sandeep
 *
 */
public class Assignment6_1 { //  Class to load an array and print even numbers inside it

	/**
	 * @param args
	 */
	public static void main(String[] args) { // main method starts
		// TODO Auto-generated method stub
		int[] arrayNumbers = new int[10];	// Declaring integer array of size 10
		int number;							// Declaring a number 
		
		for (number=1;number<=10;number++) {// Loop from 1 to 10 
			arrayNumbers[number-1]=number;	// Assigning the value into Array
		}
		
		System.out.println(" Even numbers in Array "+Arrays.toString(arrayNumbers)); // Printing message
		
		for(number=0;number<arrayNumbers.length;number++) { // Accessing all elements of Array using for loop
			if(arrayNumbers[number]%2==0)	// If number is divisble by zero
				System.out.println(arrayNumbers[number]+" ");// Printing only those even numbers
		}

	}

}// Class closed
