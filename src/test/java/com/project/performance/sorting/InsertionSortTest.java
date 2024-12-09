package com.project.performance.sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class InsertionSortTest {

    @Test
    public void testInsertionSort_EmptyArray() {
        int[] input = {};
        int[] expected = {};
        InsertionSort.sortUsingInsertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort_SingleElement() {
        int[] input = {1};
        int[] expected = {1};
        InsertionSort.sortUsingInsertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort_AlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        InsertionSort.sortUsingInsertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort_ReverseSorted() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        InsertionSort.sortUsingInsertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort_RandomArray() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        InsertionSort.sortUsingInsertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort_NegativeNumbers() {
        int[] input = {-3, -1, -4, -2, 0};
        int[] expected = {-4, -3, -2, -1, 0};
        InsertionSort.sortUsingInsertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort_AllSameValues() {
        int[] input = {5, 5, 5, 5, 5};
        int[] expected = {5, 5, 5, 5, 5};
        InsertionSort.sortUsingInsertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort_MixedPositiveAndNegativeNumbers() {
        int[] input = {-10, 15, 0, -5, 20};
        int[] expected = {-10, -5, 0, 15, 20};
        InsertionSort.sortUsingInsertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort_LargeArray() {
        int[] input = new int[1000];
        int[] expected = new int[1000];
        for (int i = 0; i < 1000; i++) {
            input[i] = 1000 - i;
            expected[i] = i + 1;
        }
        InsertionSort.sortUsingInsertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort_NullArray() {
        int[] input = null;
        try {
            InsertionSort.sortUsingInsertionSort(input);
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }
    }
}
