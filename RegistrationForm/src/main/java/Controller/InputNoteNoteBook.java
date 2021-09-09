package Controller;

import View.View;

import java.util.Scanner;

import static Controller.Regexes.*;
import static View.TextConstants.*;

public class InputNoteNoteBook {
    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void addToNoteBook() {
        UtilityController uc = new UtilityController(sc, view);
        String result;

        if (String.valueOf(View.resourceBundle.getLocale ()).equals ("ua")) {
            result = REGEX_NAME_UKR;
        } else
            result = REGEX_NAME_LAT;


        this.firstName = uc.inputStringValueWithScanner(INPUT_FIRST_NAME, result);
        this.login = uc.inputStringValueWithScanner(INPUT_LOGIN, REGEX_LOGIN);

    }
    public void inputLogin(){
        UtilityController utilityController =
                new UtilityController(sc, view);
        this.login =
                utilityController.inputStringValueWithScanner
                        (INPUT_LOGIN, REGEX_LOGIN);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLoginData() {
        return login;
    }
}
