// Develop a java program for performing various string operations with different string handling functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching,
//Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()


package String;

public class p3a {

	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "Java";

	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("\nLength of str1: "
	                + str1.length());

	        System.out.println("Character at index 1: "
	                + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "hello";

	        System.out.println("\nstr1 equals str2: "
	                + str1.equals(str2));

	        System.out.println("str1 equalsIgnoreCase str3: "
	                + str1.equalsIgnoreCase(str3));

	        // 4. String Searching
	        String text = "Java Programming";

	        System.out.println("\nIndex of 'Pro': "
	                + text.indexOf("Pro"));

	        System.out.println("Contains 'Java': "
	                + text.contains("Java"));

	        // 5. Substring Operations
	        String sub = text.substring(5);

	        System.out.println("\nSubstring from index 5: "
	                + sub);

	        // 6. String Modification
	        String replaced =
	                text.replace("Java", "Python");

	        System.out.println("\nAfter Replacement: "
	                + replaced);

	        // 7. Whitespace Handling
	        String spaceStr =
	                "   Welcome to Java   ";

	        System.out.println("\nBefore Trim: '"
	                + spaceStr + "'");

	        System.out.println("After Trim: '"
	                + spaceStr.trim() + "'");

	        // 8. String Concatenation
	        String concat =
	                str1 + " " + str2;

	        System.out.println("\nConcatenated String: "
	                + concat);

	        // 9. String Splitting
	        String fruits =
	                "Apple,Banana,Orange";

	        String[] arr =
	                fruits.split(",");

	        System.out.println("\nAfter Splitting:");

	        for (String f : arr) {
	            System.out.println(f);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb =
	                new StringBuilder("Java");

	        sb.append(" Programming");

	        System.out.println("\nStringBuilder Output: "
	                + sb);

	        // 11. String Formatting
	        String name = "Ravi";
	        int age = 21;

	        String formatted =
	                String.format(
	                        "Name: %s Age: %d",
	                        name, age);

	        System.out.println("\nFormatted String:");
	        System.out.println(formatted);

	        // 12. Email Validation
	        String email =
	                "student@gmail.com";

	        if (email.contains("@")
	                && email.startsWith("student")
	                && email.endsWith(".com")) {

	            System.out.println(
	                    "\nValid Email Address");

	        } else {

	            System.out.println(
	                    "\nInvalid Email Address");
	        }

	    }
	}

