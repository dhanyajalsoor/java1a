//Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())


package LinkedList;
import java.util.LinkedList;
import java.util.Iterator;

public class Pc2 {
	
	

	    public static void main(String[] args) {

	        // Create LinkedList
	        LinkedList<String> objlist = new LinkedList<>();

	        // Add elements
	        objlist.add("Red");
	        objlist.add("Blue");
	        objlist.add("Green");
	        objlist.add("Yellow");
	        objlist.add("Black");

	        // Display original list
	        System.out.println("Original Linked List:");
	        System.out.println(objlist);

	        // Reverse iteration using descendingIterator()
	        Iterator<String> iterator =
	                objlist.descendingIterator();

	        System.out.println("Linked List in Reverse Order:");

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}

