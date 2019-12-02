package Test;

import java.util.ArrayList;

/**
 * Created by Denver Lewis - B00530157
 * Created on 02/12/2019
 * Program info
 */
public class CustomerDataBase {

    private String fName, sName, addressLine1, addressLine2, city, postcode, carType, carMake;

    public static ArrayList<String> fNameList = new ArrayList<String>();
    public static ArrayList<String> sNameList = new ArrayList<String>();
    public static ArrayList<String> addressLine1List = new ArrayList<String>();
    public static ArrayList<String> addressLine2List = new ArrayList<String>();
    public static ArrayList<String> cityList = new ArrayList<String>();
    public static ArrayList<String> postcodeList  = new ArrayList<String>();
    public static ArrayList<String> carTypeList = new ArrayList<String>();
    public static ArrayList<String> carMakeList = new ArrayList<String>();


    public CustomerDataBase(String fName, String sName,String addressLine1, String addressLine2,
                            String city,String postcode, String carType, String carMake) {
        this.fName = fName;
        this.sName = sName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.postcode = postcode;
        this.carMake = carMake;
        this.carType = carType;
    }

    public void addData() {
        fNameList.add(fName);
        sNameList.add(sName);
        addressLine1List.add(addressLine1);
        addressLine2List.add(addressLine2);
        cityList.add(city);
        postcodeList.add(postcode);
        carTypeList.add(carType);
        carMakeList.add(carMake);
    }
}
