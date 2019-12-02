package CarSelectioinClass;

import GUI.*;
/**
     * Program Created by Paddy Cassidy
     * Program Created on the 27/11/19
     * Program to output a car selection option.
     */

import java.util.Scanner;

    public class CarSelection {

        //static Scanner keyboard = new Scanner(System.in);


        // Method to read in and return an integer
        //public static int readInteger(String text) {
            //System.out.println("Enter" + text);
            //return keyboard.nextInt();
        //}//readInteger


        // Method to accept an integer and return the equivalent word
        public static String chooseCar(int num) {
        	 ;

            switch (num) {
                case 1:
                    return Controller.carmake = "Ford Ka";
                    // Car car = new Car("Ford", "Ka", "One luggage")

                case 2:
                   return Controller.carmake = "Ford Mondeo";

                case 3:
                    return Controller.carmake = "BMW 320";

                case 4:
                    return Controller.carmake = "Mercedes S Class";


                default:
                    System.out.println("Please enter a number 1 - 4");
            }//case
				return "";
        }//switch




        public static void main(String[] args) {

            int number1;
            String numberInWords;

            System.out.println("Please enter a number to choose a class. \n1. Mini \n2. Economy \n3. Compact " +
                    "\n4. Premium");
            System.out.println("************************");
            //number1 = readInteger(" a number: ");
            //numberInWords = convertToWords(number1);
           // System.out.println(number1 +". " + numberInWords + "\n");


        }//main

    }//class


