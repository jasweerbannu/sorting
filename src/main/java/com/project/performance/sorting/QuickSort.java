package com.project.performance.sorting;

public class QuickSort {
    public static void sortUsingQuickSort(int[] array) {
        performQuickSort(array, 0, array.length - 1);
    }

    private static void performQuickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int partitionIndex = partitionArray(array, startIndex, endIndex);

            // Recursively sort the left and right partitions
            performQuickSort(array, startIndex, partitionIndex - 1);
            performQuickSort(array, partitionIndex + 1, endIndex);
        }
    }

    private static int partitionArray(int[] array, int startIndex, int endIndex) {
        int pivotValue = array[endIndex];
        int smallerElementIndex = startIndex - 1;

        for (int currentIndex = startIndex; currentIndex < endIndex; currentIndex++) {
            if (array[currentIndex] <= pivotValue) {
                smallerElementIndex++;

                // Swap smaller element to correct position
                int temporaryValue = array[smallerElementIndex];
                array[smallerElementIndex] = array[currentIndex];
                array[currentIndex] = temporaryValue;
            }
        }

        // Swap pivot to its correct position
        int temporaryValue = array[smallerElementIndex + 1];
        array[smallerElementIndex + 1] = array[endIndex];
        array[endIndex] = temporaryValue;

        return smallerElementIndex + 1;
    }
}
