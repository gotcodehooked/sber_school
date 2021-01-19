package com.gotcodehooked.homework_lesson_2_task_1;

import java.util.ArrayList;


/*
Имеется список парка машин Car(String model, String type). Необходимо разбить его на списки сгруппированные по type.
Пример исходного списка: Лада седан, Лада хэтчбек, Мерседес седан, Бмв кроссовер,  Форд хэтчбек, Пежо кроссовер, Тойота седан и т.п.
 */

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("A1", CarType.COUPE.toString());
        Car car2 = new Car("A2", CarType.HYBRID.toString());
        Car car3 = new Car("A3", CarType.MINIVAN.toString());
        Car car4 = new Car("B1", CarType.COUPE.toString());
        Car car5 = new Car("B2", CarType.SEDAN.toString());
        Car car6 = new Car("B3", CarType.COUPE.toString());
        Car car7 = new Car("C1", CarType.MINIVAN.toString());
        Car car8 = new Car("C2", CarType.HYBRID.toString());
        Car car9 = new Car("C3", CarType.SEDAN.toString());
        Car car10 = new Car("D1", CarType.SUV.toString());
        Car car11= new Car("B2", CarType.COUPE.toString());

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);
        carsList.add(car6);
        carsList.add(car7);
        carsList.add(car8);
        carsList.add(car9);
        carsList.add(car10);
        carsList.add(car11);

        SplitList splitList = new SplitList(carsList);

        for (Car car: splitList.splitCarByType(CarType.MINIVAN.toString())){
            System.out.println(car.type + "  " + car.model);
        }
    }
}
