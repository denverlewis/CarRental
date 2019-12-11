package CarSelection;

/**
     * Program Created by Paddy Cassidy
     * Program Created on the 27/11/19
     * Program to output a car selection option.
     */

public class CarSelection {

        private String type;
        private String makeModel;
        private double dailyRate;

        public CarSelection(int num) {

            String[] mini = {"Ford Fiesta", "Vauxhall Corsa", "Fiat 500", "Volkswagon Polo", "Seat Ibiza"};
            String[] compact = {"vauxhall Astra", "Volkswagon Golf", "Kia Cee'd","Seat Leon", "Audi A3"};
            String[] economy = {"Ford Mondeo", "BMW 3 Series", "Skoda Octavia", "Volkswagon Passat", "Audi A4"};
            String[] premium = {"BMW 5 Series", "Mercedes E Class", "Audi A6", "Jaguar XF", "Range Rover Evoque"};


            switch(num) {
                case 1:
                    type = "Mini";
                    makeModel = mini[getrandom(mini.length)];
                    dailyRate = 25.50;
                    break;
                case 2:
                    type = "Economy";
                    makeModel = economy[getrandom(economy.length)];
                    dailyRate = 38.40;
                    break;
                case 3:
                    type = "Compact";
                    makeModel = compact[getrandom(economy.length)];
                    dailyRate = 55.20;
                    break;
                case 4:
                    type = "Premium";
                    makeModel = premium[getrandom(premium.length)];
                    dailyRate = 68.70;
                    break;

            }
        }

        public String getType() {
            return type;
        }

        public String getMakeModel() {
            return makeModel;
        }

        public double getDailyRate() {
            return dailyRate;
        }

        private int getrandom(int length) {
            double num = Math.random() * length;
            //System.out.println((int) num);
            return (int) num;

        }

    }



