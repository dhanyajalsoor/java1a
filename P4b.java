// Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed” depending upon the 
//Jbutton either Srilanka or India is pressed by implementing the event handling mechanism with addActionListener( ).


package Swings;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class P4b implements ActionListener {

	    JFrame frame;
	    JButton btnIndia, btnSrilanka;
	    JLabel label;

	    // Constructor
	    P4b() {

	        // Create JFrame
	        frame = new JFrame("Country Button Example");

	        // Create Buttons
	        btnIndia = new JButton("India");
	        btnSrilanka = new JButton("Srilanka");

	        // Create Label
	        label = new JLabel("Press a Button");

	        // Set Font
	        label.setFont(new Font("Arial", Font.PLAIN, 18));

	        // Set Layout
	        frame.setLayout(new FlowLayout());

	        // Add ActionListener
	        btnIndia.addActionListener(this);
	        btnSrilanka.addActionListener(this);

	        // Add components to frame
	        frame.add(btnIndia);
	        frame.add(btnSrilanka);
	        frame.add(label);

	        // Frame settings
	        frame.setSize(300, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }

	    // Event Handling Method
	    public void actionPerformed(ActionEvent e) {

	        if (e.getSource() == btnIndia) {

	            label.setText("India is pressed");

	        }
	        else if (e.getSource() == btnSrilanka) {

	            label.setText("Srilanka is pressed");

	        }
	    }

	    public static void main(String[] args) {

	        new P4b();

	    }
	}
