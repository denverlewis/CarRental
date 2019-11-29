package Other.ConceptUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Denver Lewis - B00530157
 * Created on 28/11/2019
 * Program info
 */
public class Menu extends JPanel implements ActionListener {

    // Creates the menu bar
    public Menu() {

        // Creates Buttons
        JButton makeBooking = new JButton("Make Booking");
        JButton showReport = new JButton("Show Report");

        // Sets layout
        setLayout(new FlowLayout(FlowLayout.LEFT, 35, 5));
        add(makeBooking);
        add(showReport);

        // Adds action listeners to buttons
        makeBooking.addActionListener(this);
        showReport.addActionListener(this);
    }


    // Method handles button clicks and gets and sets data
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Make Booking")) {
            System.out.println("Make Booking clicked");
        }
        if (e.getActionCommand().equals("Show Report")) {
            System.out.println("Show Report Clicked");
        }

    }
}
