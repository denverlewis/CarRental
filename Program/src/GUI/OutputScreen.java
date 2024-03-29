package GUI;

import CarRentalAgreement.Booking;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Denver Lewis - B00530157
 * Created on 30/11/2019
 * Displays Data in the Screen
 */
public class OutputScreen extends JPanel {

    private static JTextArea textArea;

    // New Output
    OutputScreen() {

        textArea = new JTextArea();

        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        setBorder(BorderFactory.createLoweredBevelBorder());
        textArea.setMargin(new Insets(10, 60, 0, 0));
        textArea.setEditable(false);

    }

    // Accepts a string to be output and a boolean to clear screen
    public OutputScreen(String output, boolean clear) {
        if (clear) OutputScreen.clearOutput();
        outputMessage(output);
        new JLabel(new ImageIcon(getClass().getResource("logo2.png")));
    }

    // Appends text to textArea
    private void outputMessage(String output) {
        textArea.append(output);
    }

    // Clears the textArea
    protected static void clearOutput() {
        textArea.setText("");
    }

    protected static String getOutput() {
        return textArea.getText();
    }
}
