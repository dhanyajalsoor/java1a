//. Write a Java Program for Checking if a given string is null or contains only
//whitespace using user defined function isNullOrEmpty().


package StringExercise;
import java.util.Scanner;

public class p3b1 {
	
	    // User-defined function
	    public static boolean isNullOrEmpty(String str) {

	        // Check if string is null or empty after trimming
	        if (str == null || str.trim().isEmpty()) {
	            return true;
	        }

	        return false;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Get input from user
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Call user-defined function
	        if (isNullOrEmpty(input)) {

	            System.out.println(
	                "The string is NULL or contains only whitespace.");

	        } else {

	            System.out.println(
	                "The string contains valid characters.");

	        }

	        sc.close();
	    }
	}

