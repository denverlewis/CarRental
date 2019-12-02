package Test;
import GUI.*;

/**
 * Created by Denver Lewis - B00530157
 * Created on 02/12/2019
 * Program info
 */
public class MessageBuilder {

    public void outputRentalAgreement() {

        OutputScreen.clearOutput();
        OutputScreen.outputMessage("Customer Name: " + RentalForm.getFName() + " "
                + RentalForm.getSName());
        OutputScreen.outputMessage("\nAddress: " + RentalForm.getAddressLine1());
        if(!RentalForm.getAddressLine2().equals("")) {
            OutputScreen.outputMessage("\t" + RentalForm.getAddressLine2());
        }
        OutputScreen.outputMessage("\n\t" + RentalForm.getCity() + "\n\t"
                + RentalForm.getPostCode());
        OutputScreen.outputMessage("\n\nCar Type: " + Controller.carType);
        OutputScreen.outputMessage("\nCar Model: " + Controller.carmake);


    }

    public void outputReport() {

        OutputScreen.clearOutput();
        for(int i = 0; i < CustomerDataBase.fNameList.size(); i++) {
            OutputScreen.outputMessage(CustomerDataBase.fNameList.get(i) + "\n");
            OutputScreen.outputMessage(CustomerDataBase.sNameList.get(i) + "\n");
            OutputScreen.outputMessage(CustomerDataBase.addressLine2List.get(i) + "\n");
            if(!RentalForm.getAddressLine2().equals("")) {
                OutputScreen.outputMessage(CustomerDataBase.addressLine2List.get(i) + "\n");
            }
            OutputScreen.outputMessage(CustomerDataBase.cityList.get(i) + "\n");
            OutputScreen.outputMessage(CustomerDataBase.postcodeList.get(i) + "\n");
            OutputScreen.outputMessage(CustomerDataBase.carTypeList.get(i) + "\n");
            OutputScreen.outputMessage(CustomerDataBase.carMakeList.get(i) + "\n");
            OutputScreen.outputMessage("---------------------------------------\n\n");

        }
    }
}
