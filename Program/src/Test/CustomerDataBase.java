package Test;

import java.util.ArrayList;

/**
 * Created by Denver Lewis - B00530157
 * Created on 02/12/2019
 * Program info
 */
public class CustomerDataBase {

    private String name, address, city, postcode, carType, carMake;

    public static ArrayList<String> nameList = new ArrayList<String>();
    public static ArrayList<String> addressList = new ArrayList<String>();
    public static ArrayList<String> cityList = new ArrayList<String>();
    public static ArrayList<String> postcodeList  = new ArrayList<String>();
    public static ArrayList<String> carTypeList = new ArrayList<String>();
    public static ArrayList<String> carMakeList = new ArrayList<String>();


    public CustomerDataBase(String name,String address, String city,String postcode,
                            String carType, String carMake) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
        this.carMake = carMake;
        this.carType = carType;
    }

    public void addData() {
        nameList.add(name);
        addressList.add(address);
        cityList.add(city);
        postcodeList.add(postcode);
        carTypeList.add(carType);
        carMakeList.add(carMake);
    }
}
