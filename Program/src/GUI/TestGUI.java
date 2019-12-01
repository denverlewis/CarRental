package GUI;

import java.util.ArrayList;


/**
 * Created by Denver Lewis - B00530157
 * Created on 01/12/2019
 * Testing GUI functionality
 */
public class TestGUI {

    private String fName;
    private String sName;

    public static ArrayList<String> fNameList = new ArrayList<String>();
    public static ArrayList<String> sNameList = new ArrayList<String>();

    public TestGUI() {

    }

    public TestGUI(String fName, String sName) {

        this.fName = fName;
        this.sName = sName;
        addData();
    }

    public void addData() {
        fNameList.add(fName);
        sNameList.add(sName);

    }

    public void returnData() {
        if(fNameList.size() == 0) {
            OutputScreen.outputMessage("List is empty");
        }

        else{
            for(int i = 0; i < fNameList.size(); i++) {
                fName = fNameList.get(i);
                sName = sNameList.get(i);
                OutputScreen.outputMessage("Rental was for " + fName + " " + sName + "\n\n");
            }
            OutputScreen.outputMessage("\nThe number of rentals was " + fNameList.size());
            /*
            OutputScreen.outputMessage("\n\n\nTEST LONG MESSAGE\n Lorem ipsum dolor sit amet,\n " +
                    "consectetur adipiscing\n elit, sed do eiusmod tempor \n\n\n\n\n\n\n\n\n\n\n " +
                    "incididunt ut labore" +
                    " et " +
                    "\ndolore magna aliqua.\n Ut enim ad minim veniam, quis\n nostrud " +
                    "exercitation " +
                    "ullamco laboris\n\n\n\n\n\n\n\n nisi ut aliquip ex ea commodo consequat.\n " +
                    "Duis aute " +
                    "irure " +
                    "dolor\n in reprehenderit in\n voluptate velit esse cillum\n dolore eu fugiat" +
                    " " +
                    "nulla pariatur. Excepteur sint\n occaecat cupidatat non proident, sunt in\n " +
                    "culpa qui officia\n deserunt mollit anim id est laborum.");
                    */

        }

    }
}
