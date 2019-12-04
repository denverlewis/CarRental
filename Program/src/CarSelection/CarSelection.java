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

            String[] mini = {"Ford Fiesta", "Vauxhall Corsa", "Fiat 500", "Volkswagon Polo"};
            String[] economy = {"Ford Mondeo", "Volkswagon Golf", "Kia Cee'd"};
            String[] compact = {"Vauxhall Astra", "BMW 3 Series", "Skoda Octavia"};
            String[] premium = {"BMW 3 Series", "Mercedes E Class", "Audi A6"};


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



