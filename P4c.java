//Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed”
//depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by implementing the event handling
//mechanism with addActionListener( ).



package Swings;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class P4c implements ActionListener {

	    JFrame frame;
	    JButton btnClock, btnHourGlass;
	    JLabel label;

	    P4c() {

	        // Create Frame
	        frame = new JFrame("Image Button Example");

	        // Load Images (place images in project folder)
	        ImageIcon clockIcon =
	                new ImageIcon("digital_clock.png");

	        ImageIcon hourGlassIcon =
	                new ImageIcon("hour_glass.png");

	        // Create Buttons with Images
	        btnClock = new JButton("Digital Clock", clockIcon);
	        btnHourGlass = new JButton("Hour Glass", hourGlassIcon);

	        // Create Label
	        label = new JLabel("Press any button");

	        label.setFont(new Font("Arial", Font.PLAIN, 18));

	        // Layout
	        frame.setLayout(new FlowLayout());

	        // Add Action Listeners
	        btnClock.addActionListener(this);
	        btnHourGlass.addActionListener(this);

	        // Add Components
	        frame.add(btnClock);
	        frame.add(btnHourGlass);
	        frame.add(label);

	        // Frame Settings
	        frame.setSize(450, 250);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }

	    // Event Handling
	    public void actionPerformed(ActionEvent e) {

	        if (e.getSource() == btnClock) {

	            label.setText("Digital Clock is pressed");

	        }
	        else if (e.getSource() == btnHourGlass) {

	            label.setText("Hour Glass is pressed");

	        }
	    }

	    public static void main(String[] args) {

	        new P4c();

	    }
	}
