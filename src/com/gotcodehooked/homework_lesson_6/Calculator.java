package com.gotcodehooked.homework_lesson_6;

import java.lang.reflect.InvocationHandler;

public interface Calculator {
    /**
     * Расчет факториала числа.
     *
     * @param number
     */

    @Metric
    @Cache
    long calc(int number);
}