//Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()


package StringExercise;
import java.util.Scanner;
public class P3c7 {
	
	    // User-defined function
	    public static String truncate(String str, int length) {

	        // Check if string length is greater than specified length
	        if (str.length() > length) {

	            // Shorten string and add ellipsis
	            return str.substring(0, length) + "...";

	        } else {

	            // Return original string if shorter
	            return str;
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Input length
	        System.out.print("Enter maximum length: ");
	        int len = sc.nextInt();

	        // Call function
	        String result = truncate(input, len);

	        // Display result
	        System.out.println("Truncated String:");
	        System.out.println(result);

	        sc.close();
	    }
	}

