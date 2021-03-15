package com.gotcodehooked.homework_lesson_3_task_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils<T> {

    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);

    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <E > int indexOf(List<? extends E> source, E e) {

        int count = 0;

        for (E el : source) {
            count++;
            if (el.equals(e)) {
                System.out.println(el);
                break;
            } else if (count == source.size()) {
                return -1;
            }
        }
        return count;
    }

    public static <T> List<T> limit(List<? extends T> source, int size){
        List<T> newList = newArrayList();

        for (T t : source) {
            if (size-- == 0) {
                break;
            }
            newList.add(t);
        }
        return newList;
    }

    public static <T> void add(List<? super T> source, T t){
            source.add(t);
    }

    public static <T> void removeAll(List<? extends T> removeFrom, List<? extends T> c2){
        removeFrom.removeAll(c2);
    }

//    //true если первый лист содержит все элементы второго
    public static <T> boolean containsAll(List<? extends  T> c1, List<? super T> c2){
        return c1.containsAll(c2);
    }

    //true если первый лист содержит хотя-бы 1 второго
    public static <E> boolean containsAny(List<? extends  E> c1, List<? super E> c2){
        boolean flag = false;

        for (E el:c1){
            if(c2.contains(el)){


            flag = true;
            break;}
        }

        return flag;
    }
//

    //Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через Comparable.
    // Пример range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    public static <E extends Comparable<? super E> > List<E> range(List<? extends E> list, E min, E max){

        List<E> newList = new ArrayList<>();

        for (E el: list){
            if (el.compareTo(min) >= 0 && el.compareTo(max) <= 0) {
                newList.add(el);
            }
        }

        return newList;
    }

//    //Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
//    // Элементы сравнивать через Comparable.
//   // Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    public static <E> List<E> range(List<? extends E> list, E min , E max, Comparator<? super E> comparator){

        List<E> newList = new ArrayList<>();
        for (E el: list){
            if(comparator.compare(el,min) >=0 &&  comparator.compare(el,max) <=0){
               newList.add(el) ;
            }
        }

        return newList;
    }

}
