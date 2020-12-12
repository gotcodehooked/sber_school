package com.gotcodehooked.homework_lesson_1_task_3;

public class Kelvin extends Temperature {
    @Override
    public float convertToCelsius(float temperature) {
        temperature = (float) (temperature - 273.15);
        System.out.println("is K to C: " + temperature);
        return temperature;
    }

    @Override
    public float convertToKelvin(float temperature) {
        System.out.println("is K: " + temperature);
        return temperature;
    }

    @Override
    public float convertToFahrenheit(float temperature) {

        temperature = (float) ((temperature * 1.8) - 459.67);
        System.out.println("is K to F: " + temperature);
        return temperature;
    }
}
