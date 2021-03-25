package com.gotcodehooked.homework_lesson_6;

public class CalculatorImpl implements Calculator {

    private String str = "value";

    public String getStr() {
        return str;
    }

    public String str_2 = "value_2";


    public static final String MONDAY = "MONDAY";
    public static final String FRIDAY = "FRIDAY";
    public static final String SUNDAY = "TUESDAY";


    private void someMethod() {

        System.out.println("someMethod: value");
    }

    private void someMethod(int number) {
        System.out.println("someMethod(number): value");
    }


    @Override
    public long calc(int number) {
        System.out.println("Invoke calc: " + number);

        long result = 1;

        try {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return result;
    }
}
