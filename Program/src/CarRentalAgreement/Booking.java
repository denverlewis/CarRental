package CarRentalAgreement;

import java.text.DecimalFormat;
import CustomerDetails.Customer;

/**
 * Created by Joshua Bogle on 02/12/2019
 * Class to construct bookings and print a formatted receipt
 */
public class Booking {
   DecimalFormat df = new DecimalFormat("0.00");

   private int ID;
   private String name;
   private String address;
   private String rentalType;
   private String car;
   private double rate, extraTotal, finalTotal, total;
   private boolean excessProtection;
   private boolean roadsideProtection;
   private int noOfDays;



   public Booking() {

   }

   public Booking(int ID, String name, String address, int noOfDays, double rate, String rentalType,
                  String car, double total, double extraTotal,
                  double finalTotal, boolean excessProtection, boolean roadsideProtection) {

      this.ID = ID;
      this.name = name;
      this.address = address;
      this.rentalType = rentalType;
      this.rate = rate;
      this.car = car;
      this.excessProtection = excessProtection;
      this.roadsideProtection = roadsideProtection;
      this.noOfDays = noOfDays;
      this.total = total;
      this.extraTotal = extraTotal;
      this.finalTotal = finalTotal;

   }


   private String isExcessProtection() {
      String message;
      if (excessProtection) {
         message = "Yes";
      } else {
         message = "No";
      }
      return message;
   }

   private String isRoadsideProtection() {
      String message;
      if (roadsideProtection) {
         message = "Yes";
      } else {
         message = "No";
      }
      return message;
   }

   // Output Booking record
   public String toString() {

      return "Booking Confirmed\n" +
              "=====================================\n" +
              "Book Reference: " + ID + "\n\n" +
              "Name:\t" + name + "\n" +
              "Address:\t"+ address + "\n" +
              "=====================================\n" +
              "Number of days:\t" + noOfDays + "\n" +
              "Rental Type:\t\t" + rentalType + "\n" +
              "Car Selected:\t\t" + car + "\n" +
              "Excess Protection:\t" + isExcessProtection() + "\n" +
              "Roadside Protection:\t" + isRoadsideProtection() + "\n" +
              "=====================================\n" +
              "Rental Total:\t\t£" + df.format(total) + "\nExtras Total:\t\t£"
              + df.format(extraTotal) + "\nGrand Total:\t\t£" + df.format(finalTotal);

   }

   public void getBooking(int index) {

      name = Customer.nameList.get(index);
      address = Customer.addressList.get(index);
      rentalType = Customer.rentalTypeList.get(index);
      noOfDays = Customer.dayList.get(index);
      car = Customer.carMakeList.get(index);
      ID = Customer.referenceList.get(index);
      total = Customer.baseTotalList.get(index);
      extraTotal = Customer.extraTotalList.get(index);
      finalTotal = Customer.customerTotalList.get(index);
      excessProtection = Customer.excessList.get(index);
      roadsideProtection = Customer.roadsideList.get(index);



   }
/* /////////////// THIS SECTION HAS MOVED TO CUSTOMER
   public void calculateTotals() {

      total = rate * noOfDays;

      if (!excessProtection && !roadsideProtection ) {
         extraTotal = 0;
         finalTotal = total;
      } else if (!roadsideProtection) {
         extraTotal = (rate * excessRate) * noOfDays;
         finalTotal = total + extraTotal;
      } else if (!excessProtection) {
         extraTotal = (rate * roadsideRate) * noOfDays;
         finalTotal = total + extraTotal;
      } else {
         extraTotal = ((rate * excessRate) + (rate * roadsideRate)) * noOfDays;
         finalTotal = total + extraTotal;
      }







   public void getTotals(int index) {
      total = Customer.baseTotal.get(index -1);
      extraTotal = Customer.extraTotal.get(index -1);
      finalTotal = Customer.customerTotal.get(index -1);

   }

*/


}//class


//   public String getCity() {
//      return city;
//   }
//
//   public int getDay() {
//      return day;
//   }
//
//   public int getMonth() {
//      return month;
//   }
//
//   public int getYear() {
//      return year;
//   }
//
//   public int getNoOfDays() {
//      return noOfDays;
//   }
//
//   public void setLocation(String location) {
//      this.city = location;
//   }
//
//   public void setDay(int day) {
//      this.day = day;
//   }
//
//   public void setMonth(int month) {
//      this.month = month;
//   }
//
//   public void setYear(int year) {
//      this.year = year;
//   }
//
//   public void setNoOfDays(int noOfDays) {
//      this.noOfDays = noOfDays;
//   }

