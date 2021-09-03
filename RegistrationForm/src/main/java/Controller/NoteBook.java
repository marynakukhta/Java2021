package Controller;

import View.View;

import java.util.Scanner;

import static Controller.Regexes.*;
import static View.TextConstants.INPUT_FIRST_NAME;
import static View.TextConstants.INPUT_LOGIN;

public class NoteBook {
    private View view;
    private Scanner scanner;

    private String firstName;
    private String login;

    public NoteBook(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public void addToNoteBook() {
        UtilityController uc = new UtilityController(scanner, view);
        String result;

        if (String.valueOf(View.resourceBundle.getLocale ()).equals ("ua")) {
            result = REGEX_NAME_UKR;
        } else
            result = REGEX_NAME_LAT;

        this.firstName = uc.inputStringValueWithScanner(INPUT_FIRST_NAME, result);
        this.login = uc.inputStringValueWithScanner(INPUT_LOGIN, REGEX_LOGIN);

    }

}