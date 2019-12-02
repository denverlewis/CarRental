package CarSelectioinClass;

/**
     * Program Created by Paddy Cassidy
     * Program Created on the 27/11/19
     * Program to output a car selection option.
     */

import java.util.Scanner;

    public class CarSelection {

        static Scanner keyboard = new Scanner(System.in);


        // Method to read in and return an integer
        public static int readInteger(String text) {
            System.out.println("Enter" + text);
            return keyboard.nextInt();
        }//readInteger


        // Method to accept an integer and return the equivalent word
        public static String convertToWords(int num) {
            String text = "";

            switch (num) {
                case 1:
                    text = "Mini";
                    break;
                case 2:
                    text = "Economy";
                    break;
                case 3:
                    text = "Compact";
                    break;
                case 4:
                    text = "Premium";
                    break;

                default:
                    System.out.println("Please enter a number 1 - 4");
            }//case
            return text;
        }//switch




        public static void main(String[] args) {

            int number1;
            String numberInWords;

            System.out.println("Please enter a number to choose a class. \n1. Mini \n2. Economy \n3. Compact " +
                    "\n4. Premium");
            System.out.println("************************");
            number1 = readInteger(" a number: ");
            numberInWords = convertToWords(number1);
            System.out.println(number1 +". " + numberInWords + "\n");


        }//class

    }//class


