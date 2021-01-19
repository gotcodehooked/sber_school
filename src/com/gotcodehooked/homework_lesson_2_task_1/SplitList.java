package com.gotcodehooked.homework_lesson_2_task_1;

import java.util.ArrayList;

public class SplitList {
    public ArrayList<Car> currentCarList;

    public SplitList(ArrayList<Car> currentCarList){
        this.currentCarList = currentCarList;
    }

    public ArrayList<Car> splitCarByType(String type){
        ArrayList<Car> typeList = new ArrayList<>();

        for(Car car: currentCarList){
            if(car.type.equals(type)){
                typeList.add(car);
            }
        }
        return typeList;
    }
}
