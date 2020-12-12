package com.gotcodehooked.homework_lesson_1_task_3;

public class Celsius extends Temperature {

    public Celsius(){
    }

    @Override
    public float convertToCelsius(float temperature) {
        System.out.println("is C: " + temperature);
        return temperature;
    }

    @Override
    public float convertToKelvin(float temperature) {
        temperature = (float) (temperature + 273.15);
        System.out.println("is C to K: " + temperature);
        return temperature;
    }

    @Override
    public float convertToFahrenheit(float temperature) {
        temperature = (float) (temperature * 1.8) + 32;
        System.out.println("is C to F: " + temperature);
        return temperature;
    }
}
