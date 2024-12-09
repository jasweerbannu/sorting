package com.project.performance.sorting;

public class HeapSort {
    public static void sortUsingHeapSort(int[] array) {
        int totalElements = array.length;

        // Build max heap
        for (int index = totalElements / 2 - 1; index >= 0; index--) {
            heapify(array, totalElements, index);
        }

        // Extract elements from heap
        for (int index = totalElements - 1; index > 0; index--) {
            // Swap the root with the last element
            int temporaryValue = array[0];
            array[0] = array[index];
            array[index] = temporaryValue;

            // Heapify the reduced heap
            heapify(array, index, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            // Swap root with the largest child
            int temporaryValue = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temporaryValue;

            // Recursively heapify the affected subtree
            heapify(array, heapSize, largest);
        }
    }
}
