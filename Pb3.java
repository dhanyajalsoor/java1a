//Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)

package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Pb3 {
	    public static void main(String[] args) {

	        // Create ArrayList
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display original list
	        System.out.println("Original Colors:");
	        System.out.println(colors);

	        // Sort colors using Collections.sort()
	        Collections.sort(colors);

	        // Display sorted list
	        System.out.println("Sorted Colors:");
	        System.out.println(colors);
	    }
	}

