package com.gotcodehooked.homework_lesson_1_task_1;

public class BubbleSort {

    private final int[] array;
    private final int numberOfElements;

    public BubbleSort(int[] array, int elements) {
        this.array = array;
        this.numberOfElements = elements;
    }

    public int[] sorter() {

        for (int out = numberOfElements; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    toSwap(in, in + 1);
                }
            }
        }
        return array;
    }

    public void printCurrentArray(int[] array) {

        System.out.println();
        for (int i = 0; i <= numberOfElements; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private void toSwap(int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
