//Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index



package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Pb5 {
	
	

	    public static void main(String[] args) {

	        // Create ArrayList
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display original list
	        System.out.println("Original Colors:");
	        System.out.println(colors);

	        // Take index input from user
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the index of element to delete: ");
	        int n = sc.nextInt();

	        // Check valid index
	        if (n >= 0 && n < colors.size()) {

	            // Remove nth element
	            colors.remove(n);

	            System.out.println("After Deleting element at index " + n + ":");
	            System.out.println(colors);

	        } else {

	            System.out.println("Invalid index!");
	        }

	        sc.close();
	    }
	}

