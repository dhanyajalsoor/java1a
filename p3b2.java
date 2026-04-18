// Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()

package StringExercise;
import java.util.Scanner;

public class p3b2 {
	
	    // User-defined function
	    public static int countOccurrences(String mainStr, String subStr) {

	        int count = 0;
	        int index = 0;

	        // Loop to find substring occurrences
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {

	            count++;
	            index = index + subStr.length();

	        }

	        return count;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input main string
	        System.out.print("Enter the main string: ");
	        String mainString = sc.nextLine();

	        // Input substring
	        System.out.print("Enter the substring to search: ");
	        String subString = sc.nextLine();

	        // Call function
	        int result = countOccurrences(mainString, subString);

	        // Display result
	        System.out.println("Substring appears "
	                + result + " times.");

	        sc.close();
	    }
	}
