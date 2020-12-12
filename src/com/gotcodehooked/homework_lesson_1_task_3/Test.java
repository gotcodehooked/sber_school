package com.gotcodehooked.homework_lesson_1_task_3;

public class Test {
    public static void main(String[] args) {

        float temp = (float) 40.02;

        Celsius celsius = new Celsius();
        celsius.convertToFahrenheit(temp);
        celsius.convertToKelvin(temp);
        celsius.convertToCelsius(temp);

        System.out.println();

        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.convertToFahrenheit(temp);
        fahrenheit.convertToKelvin(temp);
        fahrenheit.convertToCelsius(temp);

        System.out.println();

        Kelvin kelvin = new Kelvin();

        kelvin.convertToKelvin(temp);
        kelvin.convertToCelsius(temp);
        kelvin.convertToFahrenheit(temp);
    }
}
