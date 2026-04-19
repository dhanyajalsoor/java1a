//Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned 
//color whenever the specific tab is selected in the Pan


package Swings;

	import javax.swing.*;
	import javax.swing.event.ChangeEvent;
	import javax.swing.event.ChangeListener;
	import java.awt.*;

	public class P5d extends JFrame {

	    JTabbedPane tabbedPane;

	    public P5d() {

	        // Create TabbedPane
	        tabbedPane = new JTabbedPane();

	        // Create Panels
	        JPanel cyanPanel = new JPanel();
	        JPanel magentaPanel = new JPanel();
	        JPanel yellowPanel = new JPanel();

	        // Set Background Colors
	        cyanPanel.setBackground(Color.CYAN);
	        magentaPanel.setBackground(Color.MAGENTA);
	        yellowPanel.setBackground(Color.YELLOW);

	        // Add Tabs
	        tabbedPane.addTab("Cyan", cyanPanel);
	        tabbedPane.addTab("Magenta", magentaPanel);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        // Add Change Listener
	        tabbedPane.addChangeListener(new ChangeListener() {

	            public void stateChanged(ChangeEvent e) {

	                int index =
	                        tabbedPane.getSelectedIndex();

	                String tabName =
	                        tabbedPane.getTitleAt(index);

	                // Print selected tab name
	                System.out.println(
	                        tabName + " Tab Selected");
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

	        new P5d();

	    }
	}
