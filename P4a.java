// Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing Programming in Blue color plain
//font with font size of 32 using Jframe and Jlabel


package Swings;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class P4a {

    // Constructor
    P4a() {

        // Create JFrame
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Set size
        jfrm.setSize(700, 200);

        // Close program when window closes
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JLabel
        JLabel jlab = new JLabel(
                "Hello! VI C , Welcome to Swing Programming"
        );

        // Set font
        jlab.setFont(new Font("Verdana", Font.PLAIN, 32));

        // Set Blue color
        jlab.setForeground(Color.BLUE);

        // Center text
        jlab.setHorizontalAlignment(JLabel.CENTER);

        // Add label to frame
        jfrm.add(jlab);

        // Make frame visible
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {

        // Run Swing safely
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                new P4a(); // Correct object creation

            }
        });
    }
}