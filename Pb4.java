//Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()


package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Pb4 {
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

	        // Extract 1st and 2nd elements (index 0 to 2)
	        List<String> subColors = colors.subList(0, 2);

	        // Display extracted elements
	        System.out.println("Extracted 1st and 2nd Elements:");
	        System.out.println(subColors);
	    }
	}

