//Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))


package LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;
public class Pc1 {
	
	    public static void main(String[] args) {

	        // Create LinkedList
	        LinkedList<String> listobj = new LinkedList<>();

	        // Add elements
	        listobj.add("Red");
	        listobj.add("Blue");
	        listobj.add("Green");
	        listobj.add("Yellow");
	        listobj.add("Black");

	        // Display original list
	        System.out.println("Linked List Elements:");
	        System.out.println(listobj);

	        // Iterator starting from 2nd position (index 1)
	        ListIterator<String> iteratorobj =
	                listobj.listIterator(1);

	        // Iterate from 2nd element
	        System.out.println("Iterating from 2nd position:");

	        while (iteratorobj.hasNext()) {
	            System.out.println(iteratorobj.next());
	        }
	    }
	}

