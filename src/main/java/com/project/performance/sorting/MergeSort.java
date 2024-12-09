package com.project.performance.sorting;

public class MergeSort {
    public static void sortUsingMergeSort(int[] array) {
        int totalElements = array.length;
        if (totalElements < 2) {
            return;
        }
        
        int middleIndex = totalElements / 2;
        int[] leftHalf = new int[middleIndex];
        int[] rightHalf = new int[totalElements - middleIndex];

        // Copy elements to left and right halves manually
        for (int leftIndex = 0; leftIndex < middleIndex; leftIndex++) {
            leftHalf[leftIndex] = array[leftIndex];
        }
        for (int rightIndex = middleIndex; rightIndex < totalElements; rightIndex++) {
            rightHalf[rightIndex - middleIndex] = array[rightIndex];
        }

        sortUsingMergeSort(leftHalf);
        sortUsingMergeSort(rightHalf);

        mergeHalves(array, leftHalf, rightHalf);
    }

    private static void mergeHalves(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftPointer = 0, rightPointer = 0, mergedPointer = 0;

        while (leftPointer < leftHalf.length && rightPointer < rightHalf.length) {
            if (leftHalf[leftPointer] <= rightHalf[rightPointer]) {
                array[mergedPointer++] = leftHalf[leftPointer++];
            } else {
                array[mergedPointer++] = rightHalf[rightPointer++];
            }
        }

        // Copy remaining elements from leftHalf
        while (leftPointer < leftHalf.length) {
            array[mergedPointer++] = leftHalf[leftPointer++];
        }

        // Copy remaining elements from rightHalf
        while (rightPointer < rightHalf.length) {
            array[mergedPointer++] = rightHalf[rightPointer++];
        }
    }
}
