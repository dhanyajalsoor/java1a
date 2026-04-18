//. Write a Java Program for Reversing the characters in a string using user defined function reverseString().


package StringExercise;
import java.util.Scanner;

public class p3b3 {
	
	    // User-defined function to reverse string
	    public static String reverseString(String str) {

	        String reversed = "";

	        // Loop to reverse characters
	        for (int i = str.length() - 1; i >= 0; i--) {

	            reversed = reversed + str.charAt(i);

	        }

	        return reversed;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Get input from user
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Call reverse function
	        String result = reverseString(input);

	        // Display reversed string
	        System.out.println("Reversed String: "
	                + result);

	        sc.close();
	    }
	}
