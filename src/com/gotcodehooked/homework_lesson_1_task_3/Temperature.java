package com.gotcodehooked.homework_lesson_1_task_3;

public abstract class Temperature {

    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public abstract float convertToCelsius(float temperature);

    public abstract float convertToKelvin(float temperature);

    public abstract float convertToFahrenheit(float temperature);


}
