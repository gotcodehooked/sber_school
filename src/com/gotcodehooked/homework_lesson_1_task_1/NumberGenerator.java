package com.gotcodehooked.homework_lesson_1_task_1;

import java.util.Random;

public class NumberGenerator {

    private final int upperRange;
    private final int numberOfElements;
    private final int[] resultArray;

    public NumberGenerator(int upperRange, int numberOfElements) {
        this.upperRange = upperRange;
        this.numberOfElements = numberOfElements -1;
        resultArray = new int[numberOfElements];
    }

    public int[] arrayGenerator() {

        for (int i = 0; i <= numberOfElements; i++) {
            resultArray[i] = generateRandomInt(upperRange);
        }

        return resultArray;
    }

    public void printCurrentArray() {

        for (int i = 0; i <= numberOfElements; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }

    private int generateRandomInt(int upperRange) {

        Random random = new Random();

        return random.nextInt(upperRange);
    }


    public int getUpperRange() {
        return upperRange;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }
}
