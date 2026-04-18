//Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))


package LinkedList;
import java.util.LinkedList;
import java.util.Collections;

public class Pc5 {
	
	

	    public static void main(String[] args) {

	        // Create LinkedList
	        LinkedList<String> l_list = new LinkedList<>();

	        // Add elements
	        l_list.add("Red");
	        l_list.add("Blue");
	        l_list.add("Green");
	        l_list.add("Yellow");
	        l_list.add("Black");

	        // Display original list
	        System.out.println("Original Linked List:");
	        System.out.println(l_list);

	        // Swap first and third elements (index 0 and 2)
	        Collections.swap(l_list, 0, 2);

	        // Display updated list
	        System.out.println("After Swapping 1st and 3rd Elements:");
	        System.out.println(l_list);
	    }
	}
