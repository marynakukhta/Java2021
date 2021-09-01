package com.company;


public class View {
    public static final String INPUT_INT = "Input int value = ";
    public static final String WRONG_INPUT = "Your input is wrong, try again.";
    public static final String RANGE_NUMBER = "The range in which the required number is located between %s and %s.";
    public static final String ATTEMPTS = "Your attempts: %s.";
    public static final String LESS = "You number is less then guessed.";
    public static final String MORE = "You number is more then guessed.";
    public static final String GUESSED = "You guessed the number.";
    public static final String OUT_OF_RANGE = "You number is out of range.";

    public void printMessage(String message) {
        System.out.println(message);
    }
}
