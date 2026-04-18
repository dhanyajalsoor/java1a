//Write a java program for getting different colors through ArrayList interface and remove the
//2nd element and color &quot;Blue&quot; from the ArrayList

package ArrayList;
import java.util.ArrayList;
public class Pb2 {
	
	

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

	        // Remove 2nd element (index 1)
	        colors.remove(1);

	        // Remove color "Blue" (if still present)
	        colors.remove("Blue");

	        // Display updated list
	        System.out.println("After Removing 2nd Element and 'Blue':");
	        System.out.println(colors);
	    }
	}

