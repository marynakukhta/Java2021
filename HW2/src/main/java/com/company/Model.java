package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {

    public List<Integer> historyList = new ArrayList<>();
    private   int leftLimit;
    private   int rightLimit;
    private int guessedNum;


    public Model(int leftLimit, int rightLimit) {
        setBorders(leftLimit, rightLimit);
        guessedNum = rand();
    }

    public void setBorders(int myLeftLimit, int myRightLimit) {
        leftLimit = myLeftLimit;
        rightLimit = myRightLimit;
    }

    public List<Integer> getHistoryList() {
        return historyList;
    }

    public int getLeftLimit() {
        return leftLimit;
    }

    public int getRightLimit() {
        return rightLimit;
    }


    public int rand() {
        int randRangeNumber = new Random().nextInt(rightLimit - leftLimit - 2)
                + leftLimit + 1;
        return randRangeNumber;
    }

    public ComparisonValues defineInputValue(int inputValue) {
        historyList.add(inputValue);

        if (inputValue <= leftLimit || inputValue >= rightLimit) {
            return ComparisonValues.OVER_THE_RANGE;
        } else if (inputValue > guessedNum) {
            rightLimit = inputValue;
            return ComparisonValues.BIGGER;
        } else if (inputValue < guessedNum) {
            leftLimit = inputValue;
            return ComparisonValues.LESS;
        } else {
            return ComparisonValues.GUESSED;
        }
    }

    public enum ComparisonValues {
        BIGGER, LESS, OVER_THE_RANGE, GUESSED;
    }
}
