package com.gotcodehooked.homework_lesson_6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class Test {
    public static void main(String[] args) {

        Calculator delegate = new CalculatorImpl();

        Calculator calculator = (Calculator) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                delegate.getClass().getInterfaces(),
                new CalcHandler(delegate));


        Calculator calculator1 = (Calculator) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Calculator.class}, new PerfomanceProxy(new CalculatorImpl()));

//
        try {
            //Задача 2:
            //Вывести на консоль все методы класса, включая все родительские методы
            //включая приватные)
            Method[] methods = calculator.getClass().getDeclaredMethods();

            for (Method m : methods) {
                m.setAccessible(true);

                //Задача 3:
                //Вывести все геттеры класса
                if (m.getName().startsWith("get")) {
                    System.out.println(m.getName());
                }
            }

            //Задача 4:
            //Проверить что все String константы имеют значение = их имени
            //public static final String MONDAY = "MONDAY";
            Field[] fields = calculator.getClass().getDeclaredFields();

            for (Field f : fields) {

                f.setAccessible(true);

                if (f.getName().equals(f.get(calculator))) {
                    System.out.println(f.getName());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


//        System.out.println("result " + calculator.calc(7));
//        System.out.println("result " + calculator.calc(5));
//        System.out.println("result " + calculator.calc(10));
//        System.out.println("result " + calculator.calc(7));
//        System.out.println("result " + calculator.calc(25));


        System.out.println("result " + calculator1.calc(5));
        System.out.println("result " + calculator1.calc(25));
        System.out.println("result " + calculator1.calc(11));
        System.out.println("result " + calculator1.calc(5));

    }

}
