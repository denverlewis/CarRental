package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * Created by Denver Lewis - B00530157
 * Created on 28/11/2019
 * A main menu that that contains buttons allowing the user to get and set data
 */
public class Menu extends JPanel implements ActionListener {

    // Creates the menu bar
    public Menu() {

        // Creates Buttons
        JButton makeBooking = new JButton("Make Booking");
        JButton showReport = new JButton("Show Report");
        JButton retrieveBooking = new JButton("Get Booking");
        JButton save = new JButton("Save to File");

        // Sets layout
        setLayout(new FlowLayout(FlowLayout.CENTER, 35, 5));
        add(makeBooking);
        add(showReport);
        add(retrieveBooking);
        add(save);


        // Adds action listeners to buttons
        makeBooking.addActionListener(this);
        showReport.addActionListener(this);
        retrieveBooking.addActionListener(this);
        save.addActionListener(this);
    }


    // Method handles button clicks and gets and sets data
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Make Booking")) {
            if (checkInvalid())
                JOptionPane.showMessageDialog(null,
                        "Please enter all required fields");
            else if (RentalForm.getAge() < 18)
                if (RentalForm.getAge() == -1) {
                    JOptionPane.showMessageDialog(null, "Enter valid age");
                } else
                    JOptionPane.showMessageDialog(null,
                            "Must be 18 or over to rent a car");
            else Controller.setValues();

        }
        if (e.getActionCommand().equals("Show Report")) {
            //System.out.println("Show Report Clicked");
            Controller.printData();
        }
        if (e.getActionCommand().equals("Get Booking")) {
            Controller.getBooking();
        }
        if (e.getActionCommand().equals("Save to File")) {
            Controller.saveOutput();
        }

    }

    private boolean checkInvalid() {
        return RentalForm.getFName().equals("") ||
                RentalForm.getSName().equals("") ||
                RentalForm.getAddressLine1().equals("")
                || RentalForm.getPostCode().equals("") ||
                RentalForm.getCity().equals("") || RentalForm.getAge() == 0 ||
                RentalForm.getDays() == 0;
    }
}
