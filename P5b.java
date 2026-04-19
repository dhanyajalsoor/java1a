//. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display the concerned color 
//whenever the specific tab is selected in the Pan.



package Swings;

	import javax.swing.*;
	import javax.swing.event.ChangeEvent;
	import javax.swing.event.ChangeListener;
	import java.awt.*;

	public class P5b extends JFrame {

	    JTabbedPane tabbedPane;

	    public P5b() {

	        // Create TabbedPane
	        tabbedPane = new JTabbedPane();

	        // Create Panels
	        JPanel redPanel = new JPanel();
	        JPanel bluePanel = new JPanel();
	        JPanel greenPanel = new JPanel();

	        // Set Background Colors
	        redPanel.setBackground(Color.RED);
	        bluePanel.setBackground(Color.BLUE);
	        greenPanel.setBackground(Color.GREEN);

	        // Add Tabs
	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("BLUE", bluePanel);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Add Change Listener
	        tabbedPane.addChangeListener(new ChangeListener() {

	            public void stateChanged(ChangeEvent e) {

	                int index =
	                        tabbedPane.getSelectedIndex();

	                String tabTitle =
	                        tabbedPane.getTitleAt(index);

	                System.out.println(
	                    tabTitle + " Tab Selected");
	            }
	        });

	        // Add TabbedPane to Frame
	        add(tabbedPane);

	        // Frame Settings
	        setTitle("Tabbed Pane Color Example");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {

	        new P5b();

	    }
	}
