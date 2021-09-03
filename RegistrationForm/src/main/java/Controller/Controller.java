package Controller;

import Model.Model;
import View.View;

import java.util.Scanner;

import static Controller.Regexes.REGEX_NAME_LAT;
import static View.TextConstants.INPUT_FIRST_NAME;

public class Controller {
    private View view;
    private Model model;


    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void processUser(){
        Scanner scanner = new Scanner(System.in);
        UtilityController uc = new UtilityController(scanner, view);
        uc.inputStringValueWithScanner(INPUT_FIRST_NAME,REGEX_NAME_LAT);

    }
}
