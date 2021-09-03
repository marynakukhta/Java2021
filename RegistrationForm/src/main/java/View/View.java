package View;


import java.util.Locale;
import java.util.ResourceBundle;

import static View.TextConstants.*;


public class View {

    static String MESSAGE = "messages";
    public static final ResourceBundle resourceBundle = ResourceBundle.getBundle(MESSAGE,
            //new Locale("ua", "UA"));;
            new Locale("en"));

    public void printMessage(String message){
        System.out.println(message);
    }


    public String concatString(String...message){
        StringBuilder string = new StringBuilder();
        for (String s : message){
            string = string.append(s).append(' ');
        }
        return new String(string);
    }

    public void printInputData(String message){
        printMessage(concatString(
                resourceBundle.getString(INPUT_DATA),
                resourceBundle.getString(message)));
    }

    public void printWrongInput(String message) {
        printMessage(concatString(
                resourceBundle.getString(WRONG_INPUT),
                resourceBundle.getString(INPUT_DATA),
                resourceBundle.getString(message)));
    }




}
