// Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()


package StringExercise;
import java.util.Scanner;
public class P3c8 {

	    // User-defined function
	    public static boolean isNumeric(String str) {

	        // Check each character
	        for (int i = 0; i < str.length(); i++) {

	            // If character is not a digit, return false
	            if (!Character.isDigit(str.charAt(i))) {

	                return false;

	            }
	        }

	        // If all characters are digits
	        return true;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Check numeric
	        if (isNumeric(input)) {

	            System.out.println(
	                    "The string contains only numeric characters.");

	        } else {

	            System.out.println(
	                    "The string does NOT contain only numeric characters.");

	        }

	        sc.close();
	    }
	}
