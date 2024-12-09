package com.project.performance.sorting;

public class BubbleSort {
    public static void sortUsingBubbleSort(int[] array) {
        int totalElements = array.length;
        for (int pass = 0; pass < totalElements - 1; pass++) {
            for (int currentIndex = 0; currentIndex < totalElements - pass - 1; currentIndex++) {
                if (array[currentIndex] > array[currentIndex + 1]) {
                    // Swap the elements
                    int temporaryValue = array[currentIndex];
                    array[currentIndex] = array[currentIndex + 1];
                    array[currentIndex + 1] = temporaryValue;
                }
            }
        }
    }
}
