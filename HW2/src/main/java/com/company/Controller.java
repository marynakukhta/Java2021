package com.company;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        Model.ComparisonValues input = Model.ComparisonValues.OVER_THE_RANGE;
        while (!input.equals(Model.ComparisonValues.GUESSED)) {
            view.printMessage(String.format(View.ATTEMPTS, model.getHistoryList()));
            view.printMessage(String.format(View.RANGE_NUMBER, model.getLeftLimit(), model.getRightLimit()));
            int inputInt = inputInt(scanner);
            input = model.defineInputValue(inputInt);

            if (input.equals(Model.ComparisonValues.BIGGER)) {
                view.printMessage(View.MORE);
            } else if (input.equals(Model.ComparisonValues.LESS)) {
                view.printMessage(View.LESS);
            } else if (input.equals(Model.ComparisonValues.OVER_THE_RANGE)) {
                view.printMessage(View.OUT_OF_RANGE);
            }
        }
        view.printMessage(View.GUESSED);
        view.printMessage(String.format(View.ATTEMPTS, model.getHistoryList()));
    }

    public int inputInt(Scanner scanner) {
        view.printMessage(View.INPUT_INT);
        while (!scanner.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT + "\n" + View.INPUT_INT);
            scanner.next();
        }
        return scanner.nextInt();
    }

}
