package Other.ConceptUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Denver Lewis - B00530157
 * Created on 28/11/2019
 * Program info
 */
public class Controller extends JFrame {

    // Creates the User interface
    public Controller() {

        // Sets default parameters
        super("Magee Car Rental");
        final int HEIGHT = 600;
        final int WIDTH = 800;
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Creates Component objects
        JTextArea outputScreen = new JTextArea();
        JLabel header = new JLabel("Magee Car Rental");
        Menu menu = new Menu();
        RentalForm rentalForm = new RentalForm();

        // Sets Layout
        setLayout(new BorderLayout());
        add(header, BorderLayout.NORTH);
        add(outputScreen, BorderLayout.CENTER);
        add(menu, BorderLayout.SOUTH);
        add(rentalForm, BorderLayout.WEST);

        setVisible(true);



    }
}
