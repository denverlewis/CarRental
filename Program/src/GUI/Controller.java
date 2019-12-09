package GUI;


import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import CarSelection.CarSelection;
import CarRentalAgreement.Booking;
import CustomerDetails.Customer;

/**
 * Created by Denver Lewis - B00530157
 * Created on 28/11/2019
 * Builds a GUI and communicates data
 */

public class Controller extends JFrame {

    // Defines variables to be passed from Form to Booking and Customer records
    private static String name, address, rentalType, carMake;
    private static int days, nextID = 1;
    private static double dailyRate;
    private static boolean excess, roadside;

    // Formats output file name
    private static int outputNum = 1;

    // Creates the User interface
    protected Controller() {

        // Sets default parameters
        super("Magee Car Rental");
        final int HEIGHT = 600;
        final int WIDTH = 800;
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creates component objects
        OutputScreen outputScreen = new OutputScreen();
        JLabel header = new JLabel(new ImageIcon(getClass().getResource
                ("logo.png")));
        Menu menu = new Menu();
        RentalForm rentalForm = new RentalForm();

        // Sets layout
        setLayout(new BorderLayout());
        add(header, BorderLayout.NORTH);
        add(outputScreen, BorderLayout.CENTER);
        add(menu, BorderLayout.SOUTH);
        add(rentalForm, BorderLayout.WEST);

        // Sets all visible
        setVisible(true);
    }

    // Collects values from the form and car selection class and stores these values in customer
    protected static void setValues() {

        // sets an ID and updates next ID
        int ID = nextID;
        nextID++;

        // Sets a constant for a young drivers fee
        final double YOUNG_DRIVER_FEE = 1.25;

        // Sets a formatted name and address
        name = RentalForm.getFormattedName();
        address = RentalForm.getFormattedAddress();

        // Creates a new car object and returns the rental type, car model and daily rate
        CarSelection car = new CarSelection(RentalForm.getCarCat());
        rentalType = car.getType();
        carMake = car.getMakeModel();
        dailyRate = car.getDailyRate();  // Adds the car details to the entry

        // Works out if under 25 and increases the rate
        if(RentalForm.getAge() < 25) dailyRate = dailyRate * YOUNG_DRIVER_FEE;

        // Continues to collect data from the rental form
        excess = RentalForm.getExcess();
        roadside = RentalForm.getRoadside();
        days = RentalForm.getDays();

        // Creates a new customer object and passes the data
        Customer newCustomer = new Customer(ID, name, address, rentalType, carMake, days, dailyRate,
                excess, roadside );

        // Returns price values calculated by the customer class based on the data provided;
        double base = newCustomer.getBaseTotal();
        double extras = newCustomer.getExtraTotal();
        double total = newCustomer.getGrandTotal();  // This completes a single booking entry

        // Updates the ArrayLists with the new booking details
        newCustomer.addData();

        // creates a new booking object to confirm booking on the output Screen
        Booking newBooking = new Booking(ID, name, address, days, dailyRate, rentalType, carMake,
                base, extras, total, excess, roadside);

        // Clears the form to default values
        RentalForm.clearForm(); // For Demo Comment out this line for faster user input

        // Creates a new output on the screen
        new OutputScreen(newBooking.toString(), true);

    }//setValues

    // Generates a report of all new rentals and produces a grand total
    protected static void printData() {

        // Keeps track of running total
        double grandTotal = 0, total;
        String printTotal;

        OutputScreen.clearOutput();
        DecimalFormat df = new DecimalFormat("0.00");

        // Outputs to Screen if list is empty
        if (Customer.referenceList.size() == 0) {
            new OutputScreen("List is empty\n",true);
        }
        else {

            // Loops through all entries in the Arraylists in customer class and prints out a
            // summary of all rentals
            for (int index = 0; index < Customer.nameList.size(); index++) {

                String output;

                output = Customer.referenceList.get(index) + ", " +  Customer.nameList.get(index) +
                    " is" + " " + "renting car: "
                        + Customer.carMakeList.get(index) + "\nTotal sale value: £"
                        + df.format(Customer.customerTotalList.get(index)) + "\n\n";
                new OutputScreen(output, false);

            }

        }

        // Loops through the customer total list and adds these values to produce a grand total
        for(int index = 0; index < Customer.customerTotalList.size(); index++) {
            total = Customer.customerTotalList.get(index);
            grandTotal = grandTotal + total;

        }

        printTotal = "Grand total sales: £" + df.format(grandTotal);
        new OutputScreen(printTotal, false);

    }//printData

    // Allow the user to recall any booking record
    protected static void getBooking() {

        int index;

        // Creates a new JOptionPane to prompt the user to enter a value and returns value
        String input = JOptionPane.showInputDialog("Enter Booking Reference");

        // If the index is valid values are assigned
        try {
            index = Integer.parseInt(input) -1;
            Booking getBooking = new Booking();
            getBooking.getBooking(index);

            new OutputScreen(getBooking.toString(), true);

            // Handles exceptions if index is not an int or if int is out of list bounds
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Invalid Record");

        } catch (IndexOutOfBoundsException error) {
            JOptionPane.showMessageDialog(null, "Record not found");

        }

    }//getBooking

    // Saves the current Screen output to file
    static void saveOutput() {

        // Gives each file a unique file name
        String output = "output" + outputNum + ".txt";
        try {

            PrintWriter outputStream = new PrintWriter(output);
            outputStream.print(OutputScreen.getOutput());
            outputStream.close();
            outputNum ++;
            JOptionPane.showMessageDialog(null, "Current Screen Saved to File!");
            // file will save in the project folder

        } catch (Exception error) {
            new JOptionPane("The file could not be created!");
        }

    }//saveOutput

}//controller
