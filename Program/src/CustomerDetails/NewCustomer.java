package CustomerDetails;

/**
 * Created by damonrodgers on 02/12/2019
 * COMMENTS ABOUT PROGRAM HERE
 */

   /*
    * Define a Full Time Employee Class (extends Employee)
    */

   //
   public class NewCustomer extends Customer {

      // Calling the name and number from SUPER CLASS.
      public NewCustomer (String custNumber, String custName, String custAddress1, String custAddress2, String custLicenceNo, String custPostcode) {
         super(custNumber, custName, custAddress1, custAddress2, custLicenceNo, custPostcode);
      }
   }

