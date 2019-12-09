package CustomerDetails;

import java.util.ArrayList;

/**
 * Created by Damon Rodgers
 * Program to get customer details
 */

public class Customer {

   // Declaring Variables
   public String name;
   private String address;
   private String rentalType;
   private String carMake;
   private double rate;
   private int days;
   private int bookingID;
   private boolean excess;
   private boolean roadside;
   private double baseTotal;
   private double extraTotal;
   private double grandTotal;
   private final double excessRate = 0.13;
   private final double roadsideRate = 0.06;




   public static ArrayList<Integer> referenceList = new ArrayList<>();
   public static ArrayList<String> nameList = new ArrayList<String>();
   public static ArrayList<String> addressList = new ArrayList<>();
   public static ArrayList<String> rentalTypeList = new ArrayList<String>();
   public static ArrayList<String> carMakeList = new ArrayList<String>();
   public static ArrayList<Double> rateList = new ArrayList<>();
   public static ArrayList<Boolean> excessList = new ArrayList<>();
   public static ArrayList<Boolean> roadsideList = new ArrayList<>();
   public static ArrayList<Integer> dayList = new ArrayList<>();
   public static ArrayList<Double> baseTotalList = new ArrayList<>();
   public static ArrayList<Double> extraTotalList = new ArrayList<>();
   public static ArrayList<Double> customerTotalList = new ArrayList<>();


   //Default Constructor
   public Customer(int bookingID, String name, String address, String rentalType,
                   String carMake,int days, double rate, boolean excess, boolean roadside) {

      this.bookingID = bookingID;
      this.name = name;
      this.address = address;
      this.rentalType = rentalType;
      this.carMake = carMake;
      this.rate = rate;
      this.days = days;
      this.excess = excess;
      this.roadside = roadside;

      setTotals();

   }

   public Customer() {

   }

   public void addData() {


      referenceList.add(bookingID);
      nameList.add(name);
      addressList.add(address);
      rentalTypeList.add(rentalType);
      carMakeList.add(carMake);
      rateList.add(rate);
      excessList.add(excess);
      roadsideList.add(roadside);
      dayList.add(days);
      baseTotalList.add(baseTotal);
      extraTotalList.add(extraTotal);
      customerTotalList.add(grandTotal);

   }

// Booking
   private void setTotals() {

      baseTotal = rate * days;

      if (!excess && !roadside) {
         extraTotal = 0;
         grandTotal = baseTotal;
      } else if (!roadside) {
         extraTotal = (rate * excessRate) * days;
         grandTotal = baseTotal + extraTotal;
      } else if (!excess) {
         extraTotal = (rate * roadsideRate) * days;
         grandTotal = baseTotal + extraTotal;
      } else {
         extraTotal = ((rate * excessRate) + (rate * roadsideRate)) * days;
         grandTotal = baseTotal + extraTotal;
      }


   }

   public double getBaseTotal() {
      return baseTotal;
   }

   public double getExtraTotal() {
      return extraTotal;
   }

   public double getGrandTotal() {
      return grandTotal;
   }

}

   //This method sets the number of the customer
  // protected void setNumber(String custNumber) {
     // number = custNumber;
  // }
   //This method sets the name of the customer
   //protected void setName(String custName) {
      //name = custName;
   //}
   //This method sets the first line of the customers address
   //protected void setAddress1(String custAddress1) {address1= custAddress1; }
   //This method sets the second line of the customers address
  // protected void setAddress2(String custAddress2) { address2 = custAddress2; }
   //This method sets the postcode of the customers address
   //protected void setPostcode(String custPostcode) {
      //postcode = custPostcode;
   //}
   //This method sets the first line of of the customers address
   //protected void setLicenceNo(String custLicenceNo) {
     // licenceNo= custLicenceNo;
   //}


   //This method returns the number of the customer
   //protected String getNumber() {
     // return number;
   //}
   //This method returns the name of the customer
   //public String getName() {
      //return name;
  // }
   //This method returns the address1 of the customer
   //protected String getAddress1() {
     // return address1;
   //}
   //This method returns the address2 of the customer
   //protected String getAddress2() {
    //  return address2;
   //}
   //This method returns the address2 of the customer
  // protected String getPostcode() {
     // return postcode;
   //}
   //This method returns the licence number of the customer
  // protected String getLicenceNo() {
    //  return licenceNo;
   //}

//}//class
