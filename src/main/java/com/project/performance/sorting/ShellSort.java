package com.project.performance.sorting;

public class ShellSort {
    public static void sortUsingShellSort(int[] array) {
    	if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        int totalElements = array.length;
        for (int gap = totalElements / 2; gap > 0; gap /= 2) {
            for (int currentIndex = gap; currentIndex < totalElements; currentIndex++) {
                int currentValue = array[currentIndex];
                int previousIndex = currentIndex;

                while (previousIndex >= gap && array[previousIndex - gap] > currentValue) {
                    array[previousIndex] = array[previousIndex - gap];
                    previousIndex -= gap;
                }

                array[previousIndex] = currentValue;
            }
        }
    }
}
