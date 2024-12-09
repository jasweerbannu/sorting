package com.project.performance.sorting;

import org.junit.Test;
import static org.junit.Assert.*;

public class RadixSortTest {

    @Test
    public void testSortUsingRadixSort_EmptyArray() {
        int[] input = {};
        int[] expected = {};
        RadixSort.sortUsingRadixSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortUsingRadixSort_NullArray() {
        int[] input = null;
        RadixSort.sortUsingRadixSort(input);
        assertNull(input);
    }

    @Test
    public void testSortUsingRadixSort_AllPositive() {
        int[] input = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] expected = {2, 24, 45, 66, 75, 90, 170, 802};
        RadixSort.sortUsingRadixSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortUsingRadixSort_AllNegative() {
        int[] input = {-3, -9, -1, -4, -10};
        int[] expected = {-10, -9, -4, -3, -1};
        RadixSort.sortUsingRadixSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortUsingRadixSort_MixedPositiveAndNegative() {
        int[] input = {170, -45, 75, -90, 802, -24, 2, -66};
        int[] expected = {-90, -66, -45, -24, 2, 75, 170, 802};
        RadixSort.sortUsingRadixSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortUsingRadixSort_SingleElement() {
        int[] input = {5};
        int[] expected = {5};
        RadixSort.sortUsingRadixSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortUsingRadixSort_Duplicates() {
        int[] input = {5, -3, 0, 5, -3, 0};
        int[] expected = {-3, -3, 0, 0, 5, 5};
        RadixSort.sortUsingRadixSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortUsingRadixSort_LargeArray() {
        int[] input = {1000, -100, 0, 200, -50, 100, -200};
        int[] expected = {-200, -100, -50, 0, 100, 200, 1000};
        RadixSort.sortUsingRadixSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortUsingRadixSort_ExtremeValues() {
        int[] input = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0, -1, 1};
        int[] expected = {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE};
        RadixSort.sortUsingRadixSort(input);
        assertArrayEquals(expected, input);
    }
}
