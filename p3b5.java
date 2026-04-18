// Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()


package StringExercise;
import java.util.Scanner;
public class p3b5 {
	

	    // User-defined function
	    public static String removeWhitespace(String str) {

	        // Remove all whitespace characters
	        String result = str.replaceAll("\\s", "");

	        return result;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Call function
	        String output = removeWhitespace(input);

	        // Display result
	        System.out.println("String after removing whitespace:");
	        System.out.println(output);

	        sc.close();
	    }
	}

