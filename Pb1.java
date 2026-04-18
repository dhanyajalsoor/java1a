//Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not


package ArrayList;
import java.util.ArrayList;
public class Pb1 {
	public static void main(String[] args) {

	        // Creating ArrayList
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors to ArrayList
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Black");

	        // Displaying colors
	        System.out.println("Colors in ArrayList:");
	        System.out.println(colors);

	        // Searching for "Red"
	        if (colors.contains("Red")) {
	            System.out.println("Color 'Red' is available in the list.");
	        }
	        else {
	            System.out.println("Color 'Red' is NOT available in the list.");
	        }
	    }
	}

