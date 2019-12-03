package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import CarSelectioinClass.*;
import CustomerDetails.*;
import Test.*;
import CarRentalAgreement.Booking;

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

        String name = RentalForm.getFName() + " " + RentalForm.getSName();
        String address;
        if(RentalForm.getAddressLine2().equals(""))
            address = RentalForm.getAddressLine1();
        else address = RentalForm.getAddressLine1() + "\n" + RentalForm.getAddressLine2();
        String city = RentalForm.getCity();
        String postcode = RentalForm.getPostCode();

        CarSelector car = new CarSelector(RentalForm.getCarCat());
        String carType = car.getType();
        String carMake = car.getMakeModel();
        CustomerDataBase newCustomer = new CustomerDataBase(name, address, city, postcode,
                carType, carMake);
        newCustomer.addData();
        Booking newBooking = new Booking(city, address, postcode,
                1, 1, 1, 1,false,false);
        new OutputScreen(newBooking.toString(), true);
        //MessageBuilder message = new MessageBuilder();
        //message.outputRentalAgreement();
        RentalForm.clearForm();


    }

    public static void printData() {

        MessageBuilder message = new MessageBuilder();
        OutputScreen.clearOutput();
        message.outputMessage();
        //testFindEntry();

    }

    public static void testFindEntry() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter record number: ");
        int index = kb.nextInt();
        //System.out.println(CustomerDataBase.fNameList.get(index));
    }


    //TestGUI test = new TestGUI(RentalForm.getFName(),
    // RentalForm.getSName());


    //carmake = CarSelection.chooseCar(RentalForm.getCarCat());
    //System.out.println("Car Selection selected " + car);
    //String name = RentalForm.getFName() + " " + RentalForm.getSName();
    // Customer customer = new Customer("1",name, "Address1", "address2", "postcode", "city" );
    //OutputScreen.outputMessage(customer.getName());
    //OutputScreen.outputMessage("\n" + carmake);




       /* // Test output in Screen
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
        OutputScreen.outputMessage("\n\n" + car);
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
