//Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))



package LinkedList;
import java.util.LinkedList;

public class Pc3 {
	
	

	    public static void main(String[] args) {

	        // Create LinkedList
	        LinkedList<String> l_listobj = new LinkedList<>();

	        // Add elements
	        l_listobj.add("Red");
	        l_listobj.add("Blue");
	        l_listobj.add("Green");
	        l_listobj.add("Yellow");

	        // Display original list
	        System.out.println("Original Linked List:");
	        System.out.println(l_listobj);

	        // Insert element at end using offerLast()
	        l_listobj.offerLast("Pink");

	        // Display updated list
	        System.out.println("After inserting 'Pink' at the end:");
	        System.out.println(l_listobj);
	    }
	}

