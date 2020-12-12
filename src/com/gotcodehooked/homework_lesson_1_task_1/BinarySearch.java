package com.gotcodehooked.homework_lesson_1_task_1;

public class BinarySearch {

    public BinarySearch() {

    }

    public int search(int[] array, int startIndex, int endIndex, int elementToFind) {
        if (endIndex >= startIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == elementToFind) {
                return middleIndex;
            }
            if (array[middleIndex] > elementToFind) {
                return search(array, startIndex, middleIndex-1, elementToFind);
            } else {
                return search(array, middleIndex+1, endIndex, elementToFind);
            }

        }
        return -1;
    }
}
