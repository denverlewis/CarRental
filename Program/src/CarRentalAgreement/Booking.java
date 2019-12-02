package CarRentalAgreement;

import java.text.DecimalFormat;

/**
 * Created by Joshua Bogle on 02/12/2019
 * Class to construct bookings and print a formatted receipt
 */
public class Booking {
   DecimalFormat df = new DecimalFormat("00.00");

   private String city, address, postcode;
   private int day, month, year;
   private double excessRate, roadsideRate;
   private boolean excessProtection;
   private boolean roadsideProtection;
   private double roadsideTotal, excessTotal, finalTotal;

   private int noOfDays;

   public Booking(String city, String address, String postcode, int day, int month, int year, int noOfDays,
                 boolean excessProtection, boolean roadsideProtection) {
      this.city = city;
      this.address = address;
      this.postcode = postcode;
      this.day = day;
      this.month = month;
      this.year = year;
      this.excessProtection = excessProtection;
      this.roadsideProtection = roadsideProtection;
      this.noOfDays = noOfDays;
      excessRate = 13.50;
      roadsideRate = 6.00;
      roadsideTotal = roadsideRate * noOfDays;
      excessTotal = excessRate * noOfDays;
      finalTotal = roadsideTotal + excessTotal;
   }


   public String getCity() {
      return city;
   }

   public int getDay() {
      return day;
   }

   public int getMonth() {
      return month;
   }

   public int getYear() {
      return year;
   }

   public int getNoOfDays() {
      return noOfDays;
   }

   public void setLocation(String location) {
      this.city = location;
   }

   public void setDay(int day) {
      this.day = day;
   }

   public void setMonth(int month) {
      this.month = month;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public void setNoOfDays(int noOfDays) {
      this.noOfDays = noOfDays;
   }



   public String isExcessProtection() {
      String message;
      if (excessProtection) {
         message = "Yes";
      } else {
         message = "No";
      }
      return message;
   }

   public String isRoadsideProtection() {
      String message;
      if (roadsideProtection) {
         message = "Yes";
      } else {
         message = "No";
      }
      return message;
   }

   public String toString() {

      String message = "Current Booking\n" +
            "=================\n" +
            "City: " + city + "\n" +
            "Address: " + address + "\n" +
            "Postcode: " + postcode + "\n" +
            "Date booked: " + day + "/" + month + "/" + year + "\n" +
            "Number of days: " + noOfDays + "\n" +
            "Excess Protection: " + isExcessProtection() + "\n" +
            "Roadside Protection: " + isRoadsideProtection();

      if (!(roadsideProtection) && !(excessProtection)) {
         message = message + "\nTotal so far: N/A";
      } else if (!(roadsideProtection) && excessProtection) {
         message = message + "\nTotal so far: £" + (df.format(excessRate * noOfDays));
      } else if (!(excessProtection) && roadsideProtection) {
         message = message + "\nTotal so far: £" + (df.format(roadsideRate * noOfDays));
      }
      else {
         message = message + "\nTotal so far: £" + df.format(finalTotal);
      }
      return message;
   }
}//class
