package com.gotcodehooked.homework_lesson_3_task_1;

import java.util.*;

public class CountMapListImpl<T>  implements CountMap<T>{

    private final List<T> list = new ArrayList<>();

    @Override
    public void add(T o) {

        list.add(o);

    }

    @Override
    public int getCount(T o) {
        int count = 0;

        for(int i = 0; i<=list.size();i++){
            if (list.get(i).equals(o)){
                count++;
            }
        }
        return count;
    }

    @Override
    public int remove(T o) {
        int count = getCount(o);

        list.remove(o);

        return 0;
    }

    @Override
    public int size() {
        HashSet<T> set = new HashSet<>(list);
        return set.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        CountMapListImpl<T> countMapList = (CountMapListImpl<T>) source;
        list.addAll((countMapList).list);
    }

    @Override
    public Map<T,Integer> toMap() {
        HashMap<T,Integer> map = new HashMap<>();
        Integer integer = 1;

        for (T el : list){
            if(!map.containsKey(el)){
                map.put(el,integer);
            }else {
                map.put(el,map.get(el) + integer);
            }
        }

        return map;
    }

    @Override
    public void toMap(Map<T,Integer> destination) {
        destination.putAll(toMap());
    }
}


