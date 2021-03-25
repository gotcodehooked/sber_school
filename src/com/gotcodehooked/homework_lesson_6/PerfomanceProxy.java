package com.gotcodehooked.homework_lesson_6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PerfomanceProxy implements InvocationHandler {

    Calculator calculator;

    public PerfomanceProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.nanoTime();
        Object invoke = null;

        if (method.isAnnotationPresent(Metric.class)) {
            invoke = method.invoke(calculator, args);
        }
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed / 1000000);

        return invoke;
    }
}
