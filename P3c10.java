//Write a Java Program for Counting the number of words in a string using user defined function countWords()



package StringExercise;
import java.util.Scanner;

public class P3c10 {

	    // User-defined function
	    public static int countWords(String str) {

	        // Remove leading and trailing spaces
	        str = str.trim();

	        // If string is empty
	        if (str.isEmpty()) {
	            return 0;
	        }

	        // Split string into words
	        String[] words = str.split("\\s+");

	        // Return number of words
	        return words.length;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a sentence: ");
	        String input = sc.nextLine();

	        // Call function
	        int wordCount = countWords(input);

	        // Display result
	        System.out.println("Number of words: "
	                + wordCount);

	        sc.close();
	    }
	}
