package Java;
import java.util.*;
public class p1 {
	  // Function to perform all operations
	    public static void performOperations(List<String> list) {

	        // 1. Adding elements
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	        System.out.println("1. After Adding Elements: " + list);

	        // 2. Adding element at specific index
	        list.add(1, "Mango");
	        System.out.println("2. After Adding at Index 1: " + list);

	        // 3. Adding multiple elements
	        List<String> moreFruits =
	                Arrays.asList("Grapes", "Pineapple");

	        list.addAll(moreFruits);
	        System.out.println("3. After Adding Multiple Elements: " + list);

	        // 4. Accessing elements
	        System.out.println("4. Element at index 2: " + list.get(2));

	        // 5. Updating elements
	        list.set(2, "Cherry");
	        System.out.println("5. After Updating index 2: " + list);

	        // 6. Removing elements
	        list.remove("Banana");
	        System.out.println("6. After Removing Banana: " + list);

	        // 7. Searching elements
	        if (list.contains("Apple"))
	            System.out.println("7. Apple Found");
	        else
	            System.out.println("7. Apple Not Found");

	        // 8. List size
	        System.out.println("8. List Size: " + list.size());

	        // 9. Iterating over list
	        System.out.println("9. Iterating using for-each:");
	        for (String fruit : list) {
	            System.out.println(fruit);
	        }

	        // 10. Using Iterator
	        System.out.println("10. Using Iterator:");
	        Iterator<String> it = list.iterator();

	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        // 11. Sorting
	        Collections.sort(list);
	        System.out.println("11. After Sorting: " + list);

	        // 12. Sublist
	        List<String> sub =
	                list.subList(0, 2);

	        System.out.println("12. Sublist (0–2): " + sub);

	        // 13. Clearing the list
	        list.clear();
	        System.out.println("13. After Clearing List: " + list);
	    }

	    public static void main(String[] args) {

	        // ArrayList
	        System.out.println("===== ArrayList Operations =====");

	        ArrayList<String> arrayList =
	                new ArrayList<>();

	        performOperations(arrayList);

	        // LinkedList
	        System.out.println("\n===== LinkedList Operations =====");

	        LinkedList<String> linkedList =
	                new LinkedList<>();

	        performOperations(linkedList);
	    }
	}
