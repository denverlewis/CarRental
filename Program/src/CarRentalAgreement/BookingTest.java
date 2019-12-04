/*
package CarRentalAgreement;

import java.util.Scanner;

*/
/**
 * Created by Joshua Bogle on 02/12/2019
 * Program that reads user input to create
 * a booking object to print a receipt
 *//*

public class BookingTest {
   static Scanner keyboard = new Scanner(System.in);

   public static String getText(String text) {
      System.out.print(text);
      return keyboard.nextLine();
   }

   public static int getInt(String text) {
      System.out.println(text);
      return keyboard.nextInt();
   }

   public static void main(String[] args) {

      // Declare variables to create a booking

      String city, address, postcode;
      int day, month, year;
      int noOfDays;
      double total;
      boolean roadsideProtection;
      boolean excessProtection;

      double roadsideRate = 6.00;
      double excessRate = 13.50;

      String input;

      System.out.println("New Booking:");
      System.out.println("========================");
      System.out.println("Pickup Location ");
      System.out.println("========================");

      city = getText("City: ");
      address = getText("Address: ");
      postcode = getText("Postcode: ");

      System.out.println("========================");
      System.out.print("Pickup Date\n");
      System.out.println("========================");

      day = getInt("Day: ");
      month = getInt("Month:");
      year = getInt("Year");
      noOfDays = getInt("Duration of rental (days): ");

      System.out.println("========================");
      System.out.println("Protection Products");
      System.out.println("========================");
      System.out.print("Excess Protection(y/n): ");

      input = keyboard.next();

      if (input.equals("y")) {
         excessProtection = true;
      } else {
         excessProtection = false;
      }

      // Allow user to add protection add-ons

      System.out.print("Roadside Protection(y/n): ");

      input = keyboard.next();
      if (input.equals("y")) {
         roadsideProtection = true;
      } else {
         roadsideProtection = false;
      }

      System.out.println("========================");

      Booking booking = new Booking(city, address, postcode, day, month, year, noOfDays,
              excessProtection, roadsideProtection);

      // Print out booking details of customer

      System.out.println(booking);
   }
}//class
*/
