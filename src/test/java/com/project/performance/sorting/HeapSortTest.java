package com.project.performance.sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class HeapSortTest {

    @Test
    public void testHeapSort_EmptyArray() {
        int[] input = {};
        int[] expected = {};
        HeapSort.sortUsingHeapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSort_SingleElement() {
        int[] input = {1};
        int[] expected = {1};
        HeapSort.sortUsingHeapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSort_AlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        HeapSort.sortUsingHeapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSort_ReverseSorted() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        HeapSort.sortUsingHeapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSort_RandomArray() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        HeapSort.sortUsingHeapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSort_NegativeNumbers() {
        int[] input = {-3, -1, -4, -2, 0};
        int[] expected = {-4, -3, -2, -1, 0};
        HeapSort.sortUsingHeapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSort_AllSameValues() {
        int[] input = {5, 5, 5, 5, 5};
        int[] expected = {5, 5, 5, 5, 5};
        HeapSort.sortUsingHeapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSort_MixedPositiveAndNegativeNumbers() {
        int[] input = {-10, 15, 0, -5, 20};
        int[] expected = {-10, -5, 0, 15, 20};
        HeapSort.sortUsingHeapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSort_LargeArray() {
        int[] input = new int[1000];
        int[] expected = new int[1000];
        for (int i = 0; i < 1000; i++) {
            input[i] = 1000 - i;
            expected[i] = i + 1;
        }
        HeapSort.sortUsingHeapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSort_NullArray() {
        int[] input = null;
        try {
            HeapSort.sortUsingHeapSort(input);
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }
    }
}
