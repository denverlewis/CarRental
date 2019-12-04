/*
package CustomerDetails;

*/
/**
 * Created by damonrodgers on 02/12/2019
 * COMMENTS ABOUT PROGRAM HERE
 *//*


import java.util.Scanner;

*/
/*
 * Program to test the Employee, Full Time Employee
 * and also the Part Time Employee classes together.
 *//*


public class TestCustomer {

   // Place the keyboard scanner for user to enter details
   static Scanner keyboard = new Scanner(System.in);

   // Get text method to get text from the user
   public static String getText(String message) {
      System.out.print(message);
      return keyboard.nextLine();
   }

   // Opening the main method
   public static void main(String[] args) {

      //Declaring variables
      String number, name, address1, address2, postcode, licenceNo;

      // Finding out the first part of employee information from the user
      System.out.println("New Customer");
      System.out.println("---------------------------");
      number = getText("Customer Number : ");
      name = getText("Customer Name : ");
      address1 = getText("Customer first address line : ");
      address2 = getText("Customer second address line : ");
     postcode = getText("Customer postcode: ");
      licenceNo = getText("Customer licence number: ");
      Customer customer1 = new Customer(number, name,address1, address2, postcode, licenceNo);
      System.out.println("Customer " + customer1.getNumber() + " is called " + customer1.getName() + " and wishes to rent :" + "\n");
   }//main
}//class */
