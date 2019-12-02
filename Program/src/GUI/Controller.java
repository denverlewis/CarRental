package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Denver Lewis - B00530157
 * Created on 28/11/2019
 * Builds a GUI and communicates data
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
        //JTextArea outputScreen = new JTextArea();
        OutputScreen outputScreen = new OutputScreen();
        JLabel header = new JLabel(new ImageIcon(getClass().getResource
                ("logo.png")));
        Menu menu = new Menu();
        RentalForm rentalForm = new RentalForm();


        // Sets Layout
        setLayout(new BorderLayout());
        add(header, BorderLayout.NORTH);
        add(outputScreen, BorderLayout.CENTER);
        add(menu, BorderLayout.SOUTH);
        add(rentalForm, BorderLayout.WEST);

        // Sets all visible
        setVisible(true);
    }

    public static void setValues() {

        TestGUI test = new TestGUI(RentalForm.getFName(),
                RentalForm.getSName());

        // Test output in Screen
        OutputScreen.clearOutput();
        OutputScreen.outputMessage("\nName:\t" + RentalForm.getFName() + " ");
        OutputScreen.outputMessage(RentalForm.getSName() + "\n\n");
        OutputScreen.outputMessage("Age:\t" + RentalForm.getAge() + "\n\n");
        OutputScreen.outputMessage("Address:\t" + RentalForm.getAddressLine1()
                + "\n");
        if(!RentalForm.getAddressLine2().equals(""))
            OutputScreen.outputMessage("\t" + RentalForm.getAddressLine2()
                    + "\n");
        OutputScreen.outputMessage("\t" + RentalForm.getCity() + "\n");
        OutputScreen.outputMessage("\t" + RentalForm.getPostCode() + "\n\n");
        OutputScreen.outputMessage("Has Selected Car Category "
                + RentalForm.getCarCat());
        RentalForm.clearForm();

        /*   //  Test Output in console
        System.out.println("Make Booking clicked");
        System.out.println(RentalForm.getFName());
        System.out.println(RentalForm.getSName());
        System.out.println(RentalForm.getAge());
        System.out.println(RentalForm.getAddressLine1());
        System.out.println(RentalForm.getAddressLine2());
        System.out.println(RentalForm.getCity());
        System.out.println(RentalForm.getPostCode());
        System.out.println(RentalForm.getCarCat());
        RentalForm.clearForm();*/

    }

    public static void printData() {
        TestGUI test = new TestGUI();
        OutputScreen.clearOutput();
        test.returnData();

    }
}
