package Test;

/**
 * Created by Denver Lewis - B00530157
 * Created on 02/12/2019
 * Program info
 */
public class CarSelector {

    private static String type;
    private static String makeModel;
    private double dailyRate;

    public CarSelector(int choice) {

        switch(choice) {
            case 1:
                type = "Mini";
                makeModel = "Ford Fiesta";
                dailyRate = 25.50;
                break;
            case 2:
                type = "Economy";
                makeModel = "Ford Mondeo";
                dailyRate = 38.40;
                break;
            case 3:
                type = "Compact";
                makeModel = "BMW 3 Series";
                dailyRate = 55.20;
                break;
            case 4:
                type = "Premium";
                makeModel = "Mercedes S Class";
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

}

