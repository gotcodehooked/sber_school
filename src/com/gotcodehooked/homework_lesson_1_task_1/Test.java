package com.gotcodehooked.homework_lesson_1_task_1;

public class Test {


    public static void main(String[] args) {

        NumberGenerator numberGenerator = new NumberGenerator(9,20);
        int[] array = numberGenerator.arrayGenerator();
        int nb = numberGenerator.getNumberOfElements();

        numberGenerator.printCurrentArray();


        BubbleSort bubbleSort = new BubbleSort(array, nb);
        array = bubbleSort.sorter();
        bubbleSort.printCurrentArray(array);


        BinarySearch binarySearch = new BinarySearch();
        System.out.println();
        System.out.println("index: " + binarySearch.search(array,0,nb,5));

    }
}
