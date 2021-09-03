package Controller;

import View.View;

import java.util.Scanner;

public class UtilityController {
    public Scanner scanner;
    public View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String inputStringValueWithScanner(String message, String regex) {
        String result;
        view.printInputData(message);
        while( !(scanner.hasNext() && (result = scanner.next()).matches(regex))){
            view.printWrongInput(message);
        }
        return result;
    }
}
