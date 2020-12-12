package com.gotcodehooked.homework_lesson_1_task_3;

public class Fahrenheit extends Temperature {
    @Override
    public float convertToCelsius(float temperature) {
        temperature = (float) ((temperature -32) /1.8);
        System.out.println("is F to C: " + temperature);
        return temperature;
    }

    @Override
    public float convertToKelvin(float temperature) {

        temperature = (float) ((temperature + 459.67) / 1.8);
        System.out.println("is F to K: " + temperature);
        return temperature;
    }

    @Override
    public float convertToFahrenheit(float temperature) {
        System.out.println("is F: " + temperature);
        return temperature;
    }
}
