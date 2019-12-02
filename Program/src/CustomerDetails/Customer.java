/**
 * Created by Damon Rodgers
 * Program to get customer details
 */

public class Customer {

   // Declaring Variables
   private String number;
   private String name;
   private String address1;
   private String address2;
   private String postcode;
   // private String licenceNo;

   //Default Constructor
   public Customer (String custNumber, String custName, String custAddress1, String custAddress2, String custLicenceNo, String custPostcode) {
      number = custNumber;
      name = custName;
      address1 = custAddress1;
      address2 = custAddress2;
      postcode = custPostcode;
     // licenceNo = custLicenceNo;
   }

   //This method sets the number of the customer
   protected void setNumber(String custNumber) {
      number = custNumber;
   }
   //This method sets the name of the customer
   protected void setName(String custName) {
      name = custName;
   }
   //This method sets the first line of the customers address
   protected void setAddress1(String custAddress1) {address1= custAddress1; }
   //This method sets the second line of the customers address
   protected void setAddress2(String custAddress2) { address2 = custAddress2; }
   //This method sets the postcode of the customers address
   protected void setPostcode(String custPostcode) {
      postcode = custPostcode;
   }
   //This method sets the first line of of the customers address
   //protected void setLicenceNo(String custLicenceNo) {
     // licenceNo= custLicenceNo;
   }


   //This method returns the number of the customer
   protected String getNumber() {
      return number;
   }
   //This method returns the name of the customer
   protected String getName() {
      return name;
   }
   //This method returns the address1 of the customer
   protected String getAddress1() {
      return address1;
   }
   //This method returns the address2 of the customer
   protected String getAddress2() {
      return address2;
   }
   //This method returns the address2 of the customer
   protected String getPostcode() {
      return postcode;
   }
   //This method returns the licence number of the customer
  // protected String getLicenceNo() {
    //  return licenceNo;
   }

}//class
