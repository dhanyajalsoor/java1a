//Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()


package StringExercise;
import java.util.Scanner;
import java.util.Random;
public class P3c9 {

	    // User-defined function
	    public static String generateRandomString(int length) {

	        // Characters to be used in random string
	        String characters =
	                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	        Random rand = new Random();

	        String result = "";

	        // Generate random characters
	        for (int i = 0; i < length; i++) {

	            int index =
	                    rand.nextInt(characters.length());

	            result =
	                    result + characters.charAt(index);
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input length
	        System.out.print("Enter length of random string: ");
	        int len = sc.nextInt();

	        // Call function
	        String randomStr =
	                generateRandomString(len);

	        // Display result
	        System.out.println(
	                "Generated Random String:");
	        System.out.println(randomStr);

	        sc.close();
	    }
	}
