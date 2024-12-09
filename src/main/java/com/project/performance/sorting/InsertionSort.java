package com.project.performance.sorting;

public class InsertionSort {
    public static void sortUsingInsertionSort(int[] array) {
        for (int currentElementIndex = 1; currentElementIndex < array.length; currentElementIndex++) {
            int keyElement = array[currentElementIndex];
            int previousElementIndex = currentElementIndex - 1;

            // Shift elements of the sorted segment to the right
            while (previousElementIndex >= 0 && array[previousElementIndex] > keyElement) {
                array[previousElementIndex + 1] = array[previousElementIndex];
                previousElementIndex--;
            }

            // Place the keyElement at the correct position
            array[previousElementIndex + 1] = keyElement;
        }
    }
}
