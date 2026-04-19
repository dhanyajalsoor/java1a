// Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, France, Great Britain, 
//Japan, Africa, Greenland, Singapore into a JList and display the capital of the countries on console whenever the
//countries are selected on the list.

package Swings;



	import java.util.HashMap;
	import javax.swing.*;
	import javax.swing.event.*;
	import java.awt.*;

	public class P5c extends JFrame {

	    private JList<String> countryList;
	    private HashMap<String, String> capitalMap;

	    public P5c() {

	        // Create country-capital mapping
	        capitalMap = new HashMap<>();

	        capitalMap.put("USA", "Washington D.C.");
	        capitalMap.put("India", "New Delhi");
	        capitalMap.put("Vietnam", "Hanoi");
	        capitalMap.put("Canada", "Ottawa");
	        capitalMap.put("Denmark", "Copenhagen");
	        capitalMap.put("France", "Paris");
	        capitalMap.put("Great Britain", "London");
	        capitalMap.put("Japan", "Tokyo");
	        capitalMap.put("Africa", "No single capital");
	        capitalMap.put("Greenland", "Nuuk");
	        capitalMap.put("Singapore", "Singapore");

	        // Create list model
	        DefaultListModel<String> listModel =
	                new DefaultListModel<>();

	        // Add countries
	        for (String country : capitalMap.keySet()) {
	            listModel.addElement(country);
	        }

	        // Create JList
	        countryList = new JList<>(listModel);

	        // Add selection listener
	        countryList.addListSelectionListener(
	            new ListSelectionListener() {

	            public void valueChanged(
	                    ListSelectionEvent e) {

	                if (!e.getValueIsAdjusting()) {

	                    String selectedCountry =
	                            countryList.getSelectedValue();

	                    if (selectedCountry != null) {

	                        String capital =
	                                capitalMap.get(selectedCountry);

	                        System.out.println(
	                            "Country: "
	                            + selectedCountry
	                            + " → Capital: "
	                            + capital);
	                    }
	                }
	            }
	        });

	        // Add scroll pane
	        add(new JScrollPane(countryList),
	                BorderLayout.CENTER);

	        // Frame settings
	        setTitle("Country Capital List");
	        setSize(300, 250);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {

	        new P5c();

	    }
	}
