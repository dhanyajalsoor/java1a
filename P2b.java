// Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for 
//appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which one is better.

package String;

public class P2b {

	    public static void main(String[] args) {

	        // Performance test for StringBuffer
	        long startTimeBuffer = System.currentTimeMillis();

	        StringBuffer sbuffer = new StringBuffer();

	        for (int i = 0; i < 10000; i++) {
	            sbuffer.append("AIET");
	        }

	        long endTimeBuffer = System.currentTimeMillis();

	        System.out.println("Time taken by StringBuffer: "
	                + (endTimeBuffer - startTimeBuffer)
	                + " milliseconds");


	        // Performance test for StringBuilder
	        long startTimeBuilder = System.currentTimeMillis();

	        StringBuilder sbuilder = new StringBuilder();

	        for (int i = 0; i < 10000; i++) {
	            sbuilder.append("AIET");
	        }

	        long endTimeBuilder = System.currentTimeMillis();

	        System.out.println("Time taken by StringBuilder: "
	                + (endTimeBuilder - startTimeBuilder)
	                + " milliseconds");


	        // Justification
	        if ((endTimeBuilder - startTimeBuilder)
	                < (endTimeBuffer - startTimeBuffer)) {

	            System.out.println(
	                "\nStringBuilder is faster than StringBuffer.");

	        } else {

	            System.out.println(
	                "\nStringBuffer is faster than StringBuilder.");
	        }
	    }
	}

