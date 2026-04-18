//. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()


package StringExercise;
import java.util.Scanner;

public class p3c6 {
	

	    // User-defined function
	    public static String capitalizeWords(String str) {

	        // Split string into words
	        String[] words = str.split("\\s+");

	        String result = "";

	        // Capitalize first letter of each word
	        for (String word : words) {

	            if (word.length() > 0) {

	                String firstLetter =
	                        word.substring(0, 1).toUpperCase();

	                String remainingLetters =
	                        word.substring(1).toLowerCase();

	                result = result
	                        + firstLetter
	                        + remainingLetters
	                        + " ";
	            }
	        }

	        // Remove extra space at end
	        return result.trim();
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a sentence: ");
	        String input = sc.nextLine();

	        // Call function
	        String output = capitalizeWords(input);

	        // Display result
	        System.out.println(
	                "After Capitalizing Words:");
	        System.out.println(output);

	        sc.close();
	    }
	}

