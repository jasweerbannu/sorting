package com.project.performance.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortingTests {

    @Test
    void testBubbleSort() {
        int[] input = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};
        BubbleSort.sortUsingBubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testMergeSort() {
        int[] input = {3, 7, 8, 5, 2, 1};
        int[] expected = {1, 2, 3, 5, 7, 8};
        MergeSort.sortUsingMergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testHeapSort() {
        int[] input = {9, 4, 3, 7, 1};
        int[] expected = {1, 3, 4, 7, 9};
        HeapSort.sortUsingHeapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testRadixSort() {
        int[] input = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] expected = {2, 24, 45, 66, 75, 90, 170, 802};
        RadixSort.sortUsingRadixSort(input);
        assertArrayEquals(expected, input);
    }
}
