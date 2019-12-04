package GUI;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.stream.DoubleStream;

import CarSelection.CarSelection;
import CarRentalAgreement.Booking;
import CustomerDetails.Customer;

/**
 * Created by Denver Lewis - B00530157
 * Created on 28/11/2019
 * Builds a GUI and communicates data
 */
public class Controller extends JFrame {

    // Defines static variables to set data in Customer class
    private static String name, address, rentalType, carMake;
    private static int days, nextID = 1;
    private static double dailyRate;
    private static boolean excess, roadside;



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
        int ID = nextID;
        nextID++;
        // Sets a formatted name and address
        name = RentalForm.getFName() + " " + RentalForm.getSName();
        if(RentalForm.getAddressLine2().equals(""))
            address = RentalForm.getAddressLine1() + "\n\t" + RentalForm.getCity() + "\n\t"
                    + RentalForm.getPostCode();
        else address =
                RentalForm.getAddressLine1() + "\n\t" + RentalForm.getAddressLine2() + "\n\t"
                        + RentalForm.getCity() + "\n\t" + RentalForm.getPostCode();

        // Creates a new car object and returns the rental type, car model and daily rate
        CarSelection car = new CarSelection(RentalForm.getCarCat());
        rentalType = car.getType();
        carMake = car.getMakeModel();
        dailyRate = car.getDailyRate();

        // Works out if under 25 and increases the rate
        if(RentalForm.getAge() < 25) dailyRate = dailyRate * 1.25;

        // Continues to collect data from the rental form
        excess = RentalForm.getExcess();
        roadside = RentalForm.getRoadside();
        days = RentalForm.getDays();

        // Creates a new customer object and passes the data
        Customer newCustomer = new Customer(ID, name, address, rentalType, carMake, days, dailyRate,
                excess, roadside );
        // Calls method to record data in the Arraylists;
        double base = newCustomer.getBaseTotal();
        double extras = newCustomer.getExtraTotal();
        double total = newCustomer.getGrandTotal();
        newCustomer.addData();
        // creates a new booking object to confirm booking on the output Screen
        Booking newBooking = new Booking(ID, name, address, days, dailyRate, rentalType, carMake,
                base, extras, total, excess, roadside);

        //RentalForm.clearForm();

        new OutputScreen(newBooking.toString(), true);

    }

    public static void printData() {

        double grandTotal = 0, total;
        String printTotal;

        OutputScreen.clearOutput();
        DecimalFormat df = new DecimalFormat("0.00");

        if (Customer.referenceList.size() == 0) {
            new OutputScreen("List is empty",true);
        }
        else {
            for (int index = 0; index < Customer.nameList.size(); index++) {
                String output;

                output = Customer.nameList.get(index) + " is renting car: "
                        + Customer.carMakeList.get(index) + "\nTotal sale value: £"
                        + df.format(Customer.customerTotalList.get(index)) + "\n\n";
                new OutputScreen(output, false);
            }
        }
        for(int index = 0; index < Customer.customerTotalList.size(); index++) {
            total = Customer.customerTotalList.get(index);
            grandTotal = grandTotal + total;

        }
        printTotal = "Grand total sales: £" + df.format(grandTotal);
        new OutputScreen(printTotal, false);

    }

    public static void getBooking() {
        int index;

        String input = JOptionPane.showInputDialog("Enter Booking Reference");
        index = Integer.parseInt(input) -1;
        System.out.println("get booking is " + index);
        try {
            index = Integer.parseInt(input) -1;
            name = Customer.nameList.get(index);
            address = Customer.addressList.get(index);
            rentalType = Customer.rentalTypeList.get(index);
            carMake = Customer.carMakeList.get(index);
            int getID = Customer.referenceList.get(index);
            double base = Customer.baseTotalList.get(index);
            double extras = Customer.extraTotalList.get(index);
            double total = Customer.customerTotalList.get(index);
            excess = Customer.excessList.get(index);
            roadside = Customer.roadsideList.get(index);
            Booking getBooking = new Booking(getID, name, address, days, dailyRate, rentalType,
                    carMake, base, extras, total, excess, roadside);
            new OutputScreen(getBooking.toString(), true);
            System.out.println("get booking is " + index);

        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Record");

        }catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Record not found");


        }

    }


}
