package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Denver Lewis - B00530157
 * Created on 28/11/2019
 * Builds a rental form in the controller and assigns data to variables
 */
public class RentalForm extends JPanel {

    // Declares instance variables
    private static JTextField fName;
    private static JTextField sName;
    private static JTextField addressLine1;
    private static JTextField addressLine2;
    private static JTextField city;
    private static JTextField postCode;
    private static JTextField age;
    private static JList<String> carList;

    public RentalForm() {

        // Sets form size and border
        Dimension dim = new Dimension();
        dim.width = 400;
        setPreferredSize(dim);
        setBorder(BorderFactory.createLineBorder(Color.gray, 1));

        // Adds components to the form
        JLabel newCustomer = new JLabel("New Customer");
        JLabel firstName = new JLabel("First Name: ");
        fName = new JTextField(10);
        JLabel surname = new JLabel("Surname: ");
        sName = new JTextField(10);
        JLabel address = new JLabel("Address: ");
        addressLine1 = new JTextField(10);
        addressLine2 = new JTextField(10);
        JLabel cityLabel = new JLabel("City: ");
        city = new JTextField(10);
        JLabel postCodeLabel = new JLabel("PostCode: ");
        postCode = new JTextField(6);
        JLabel ageLabel = new JLabel("Age: ");
        age = new JTextField(3);
        JLabel selectCar = new JLabel("Car Category: ");
        carList = new JList<>();

        // Sets up carList
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("A. Small Car");
        listModel.addElement("B. Standard Car");
        listModel.addElement("C. Estate Car");
        listModel.addElement("D. Mini Van");
        listModel.addElement("E. Executive Car");
        carList.setModel(listModel);
        carList.setBorder(BorderFactory.createEtchedBorder());
        carList.setSelectedIndex(0);

        // Sets layout for form
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Customer section header;
        c.insets.set(30,0,20,0);
        c.gridx = 0;
        c.gridy = 0;
        add(newCustomer, c);

        // Name and age
        c.insets.set(0,0,0,0);
        c.anchor = GridBagConstraints.LINE_END;
        c.gridy = 1;
        add(firstName, c);
        c.gridx = 1;
        add(fName, c);
        c.gridy = 2;
        c.gridx = 0;
        add(surname, c);
        c.gridx = 1;
        add(sName, c);
        c.gridx = 0;
        c.gridy = 4;
        add(ageLabel, c);
        c.gridx = 1;
        c.anchor = GridBagConstraints.LINE_START;
        add(age, c);

        // Address, City and post code
        c.weightx = 1.5;
        c.anchor = GridBagConstraints.LINE_END;
        c.gridy = 1;
        c.weightx = 0;
        c.gridx = 2;
        add(address, c);

        c.gridx = 3;
        add(addressLine1, c);
        c.gridy = 2;
        add(addressLine2, c);
        c.gridx =2;
        c.gridy =3;
        add(cityLabel, c);
        c.gridx = 3;
        add(city, c);
        c.gridx = 2;
        c.gridy = 4;
        add(postCodeLabel, c);
        c.gridx = 3;
        c.anchor = GridBagConstraints.LINE_START;
        add(postCode, c);
        c.weighty = 2;
        c.gridx = 0;
        c.gridy = 5;

        // Car options
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.insets.set(30,0,0,0);
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        c.gridy = 6;
        add(selectCar , c);
        c.gridx = 1;
        add(carList, c);

    }

    // Gets data from text fields
    protected static String getFName() {
        return fName.getText();
    }

    protected static String getSName() {
        return sName.getText();
    }

    protected static String getAddressLine1() {
        return addressLine1.getText();
    }

    protected static String getAddressLine2() {
        return addressLine2.getText();
    }

    protected static String getCity() {
        return city.getText();
    }

    protected static String getPostCode() {
        return postCode.getText();
    }
    protected static int getAge() {
        if (age.getText().equals(""))
            return 0;
        else
            return Integer.parseInt(age.getText());
    }

    protected static int getCarCat() {
        return carList.getSelectedIndex() + 1;
    }


    // Clears all form fields to empty
    public static void clearForm() {
        fName.setText("");
        sName.setText("");
        age.setText("");
        addressLine1.setText("");
        addressLine2.setText("");
        city.setText("");
        postCode.setText("");
        carList.setSelectedIndex(0);
    }

}
