package com.gotcodehooked.homework_lesson_3_task_1;


import java.util.Map;

public interface CountMap<T>  {

    void add(T o);

    int getCount(T o);

    int remove(T o);

    int size();

    void addAll(CountMap<T> source);

    Map<T,Integer> toMap();

    void toMap(Map<T,Integer> destination);
}
