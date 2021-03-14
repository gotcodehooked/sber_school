package com.gotcodehooked.homework_lesson_3_task_1;

import java.util.*;

public class CountMapImpl<T> implements CountMap<T> {

    private final HashMap<T, Integer> map = new HashMap<>();

    public CountMapImpl() {

    }

    // добавляет элемент в этот контейнер.
    @Override
    public void add(T o) {
        if (map.containsKey(o)) {
            map.put(o, map.get(o) + 1);
        } else {
            map.putIfAbsent(o, 1);
        }


    }

    //Возвращает количество добавлений данного элемента
    @Override
    public int getCount(T o) {

        return map.get(o);
    }

    //Удаляет элемент и контейнера и возвращает количество его добавлений(до удаления)
    @Override
    public int remove(T o) {
        int count = map.get(o);

        map.remove(o);

        return count;
    }

    //количество разных элементов
    @Override
    public int size() {
        return map.size();
    }

    //Добавить все элементы из source в текущий контейнер,
    // при совпадении ключей,     суммировать значения
    @Override
    public void addAll(CountMap<T> source) {
        map.putAll(source.toMap());


    }

    //Вернуть java.util.Map. ключ - добавленный элемент,
    // значение - количество его добавлений
    @Override
    public Map<T, Integer> toMap() {
        return map;
    }

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    @Override
    public void toMap(Map<T, Integer> destination) {
        destination.putAll(map);
    }
}
