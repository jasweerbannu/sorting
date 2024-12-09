package com.project.performance.sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class MergeSortTest {

    @Test
    public void testMergeSort_EmptyArray() {
        int[] input = {};
        int[] expected = {};
        MergeSort.sortUsingMergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_SingleElement() {
        int[] input = {1};
        int[] expected = {1};
        MergeSort.sortUsingMergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_AlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        MergeSort.sortUsingMergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_ReverseSorted() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        MergeSort.sortUsingMergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_RandomArray() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        MergeSort.sortUsingMergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_NegativeNumbers() {
        int[] input = {-3, -1, -4, -2, 0};
        int[] expected = {-4, -3, -2, -1, 0};
        MergeSort.sortUsingMergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_AllSameValues() {
        int[] input = {5, 5, 5, 5, 5};
        int[] expected = {5, 5, 5, 5, 5};
        MergeSort.sortUsingMergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_MixedPositiveAndNegativeNumbers() {
        int[] input = {-10, 15, 0, -5, 20};
        int[] expected = {-10, -5, 0, 15, 20};
        MergeSort.sortUsingMergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_LargeArray() {
        int[] input = new int[1000];
        int[] expected = new int[1000];
        for (int i = 0; i < 1000; i++) {
            input[i] = 1000 - i;
            expected[i] = i + 1;
        }
        MergeSort.sortUsingMergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_NullArray() {
        int[] input = null;
        try {
            MergeSort.sortUsingMergeSort(input);
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }
    }
}
