package com.gotcodehooked.homework_lesson_3_task_1;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        CountMap<Integer> map = new CountMapImpl<>();
        CountMap<Integer> source_1 = new CountMapImpl<>();
        CountMap<Integer> source_2 = new CountMapListImpl<>();
        Map<Integer,Integer> destinaton = new HashMap<>();

        CountMap<Integer> countMapList = new CountMapListImpl<>();

        countMapList.add(10);
        countMapList.add(10);
        countMapList.add(10);
        countMapList.add(5);
        countMapList.add(5);
        countMapList.add(6);

        source_1.add(0);
        source_1.add(1);
        source_1.add(2);
        source_1.add(3);
        source_1.add(4);
        source_1.add(5);

        source_2.add(1);
        source_2.add(2);
        source_2.add(7);
        source_2.add(5);
        source_2.add(2);
        source_2.add(4);

        countMapList.addAll(source_2);
        System.out.println(countMapList.size());
        System.out.println(countMapList.toMap());

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        map.addAll(source_1);
        map.toMap(destinaton);
        map.size();



    }
}
