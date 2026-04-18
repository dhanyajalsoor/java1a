//Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) 
//using user defined function isPalindrome():


package StringExercise;
import java.util.Scanner;

public class p3b4 {
		    // User-defined function to check palindrome
	    public static boolean isPalindrome(String str) {

	        // Remove punctuation and spaces, convert to lowercase
	        String cleaned =
	                str.replaceAll("[^a-zA-Z0-9]", "")
	                   .toLowerCase();

	        // Reverse the cleaned string
	        String reversed = "";

	        for (int i = cleaned.length() - 1; i >= 0; i--) {

	            reversed = reversed + cleaned.charAt(i);

	        }

	        // Compare original cleaned string with reversed
	        if (cleaned.equals(reversed)) {

	            return true;

	        } else {

	            return false;

	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Call function
	        if (isPalindrome(input)) {

	            System.out.println(
	                    "The string is a Palindrome.");

	        } else {

	            System.out.println(
	                    "The string is NOT a Palindrome.");

	        }

	        sc.close();
	    }
}
