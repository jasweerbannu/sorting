package com.project.performance.sorting;

public class RadixSort {

    public static void sortUsingRadixSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        // Separate negative and positive numbers
        int[] negatives = java.util.Arrays.stream(array).filter(x -> x < 0 && x != Integer.MIN_VALUE).map(x -> -x).toArray();
        int[] positives = java.util.Arrays.stream(array).filter(x -> x >= 0).toArray();
        boolean hasMinValue = java.util.Arrays.stream(array).anyMatch(x -> x == Integer.MIN_VALUE);

        // Sort both arrays using Radix Sort
        radixSortHelper(positives);
        radixSortHelper(negatives);

        // Merge back: negatives in reverse order, then positives
        int index = 0;
        if (hasMinValue) {
            array[index++] = Integer.MIN_VALUE; // Handle Integer.MIN_VALUE explicitly
        }
        for (int i = negatives.length - 1; i >= 0; i--) {
            array[index++] = -negatives[i];
        }
        for (int num : positives) {
            array[index++] = num;
        }
    }

    private static void radixSortHelper(int[] array) {
        if (array.length == 0) return;

        int max = getMax(array);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(array, exp);
        }
    }

    private static void countSort(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[20]; // Adjusted to account for digit range [-9, 9]

        // Count occurrences of digits
        for (int num : array) {
            int digit = (num / exp) % 10 + 9; // Shift digit range to [0, 19]
            count[digit]++;
        }

        // Update count array
        for (int i = 1; i < 20; i++) {
            count[i] += count[i - 1];
        }

        // Build output array
        for (int i = n - 1; i >= 0; i--) {
            int num = array[i];
            int digit = (num / exp) % 10 + 9;
            output[count[digit] - 1] = num;
            count[digit]--;
        }

        // Copy output back to array
        System.arraycopy(output, 0, array, 0, n);
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
