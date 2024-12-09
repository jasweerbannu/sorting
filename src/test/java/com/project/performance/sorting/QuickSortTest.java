package com.project.performance.sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class QuickSortTest {

    @Test
    public void testQuickSort_EmptyArray() {
        int[] input = {};
        int[] expected = {};
        QuickSort.sortUsingQuickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_SingleElement() {
        int[] input = {1};
        int[] expected = {1};
        QuickSort.sortUsingQuickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_AlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        QuickSort.sortUsingQuickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_ReverseSorted() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        QuickSort.sortUsingQuickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_RandomArray() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        QuickSort.sortUsingQuickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_NegativeNumbers() {
        int[] input = {-3, -1, -4, -2, 0};
        int[] expected = {-4, -3, -2, -1, 0};
        QuickSort.sortUsingQuickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_AllSameValues() {
        int[] input = {5, 5, 5, 5, 5};
        int[] expected = {5, 5, 5, 5, 5};
        QuickSort.sortUsingQuickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_MixedPositiveAndNegativeNumbers() {
        int[] input = {-10, 15, 0, -5, 20};
        int[] expected = {-10, -5, 0, 15, 20};
        QuickSort.sortUsingQuickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_LargeArray() {
        int[] input = new int[1000];
        int[] expected = new int[1000];
        for (int i = 0; i < 1000; i++) {
            input[i] = 1000 - i;
            expected[i] = i + 1;
        }
        QuickSort.sortUsingQuickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_NullArray() {
        int[] input = null;
        try {
            QuickSort.sortUsingQuickSort(input);
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testQuickSort_DuplicatesInArray() {
        int[] input = {4, 2, 4, 1, 4};
        int[] expected = {1, 2, 4, 4, 4};
        QuickSort.sortUsingQuickSort(input);
        assertArrayEquals(expected, input);
    }
}
