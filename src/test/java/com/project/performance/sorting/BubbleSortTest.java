package com.project.performance.sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class BubbleSortTest {

    @Test
    public void testBubbleSort_EmptyArray() {
        int[] input = {};
        int[] expected = {};
        BubbleSort.sortUsingBubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSort_SingleElement() {
        int[] input = {1};
        int[] expected = {1};
        BubbleSort.sortUsingBubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSort_AlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        BubbleSort.sortUsingBubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSort_ReverseSorted() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        BubbleSort.sortUsingBubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSort_RandomArray() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        BubbleSort.sortUsingBubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSort_NegativeNumbers() {
        int[] input = {-3, -1, -4, -2, 0};
        int[] expected = {-4, -3, -2, -1, 0};
        BubbleSort.sortUsingBubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSort_AllSameValues() {
        int[] input = {7, 7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7, 7};
        BubbleSort.sortUsingBubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSort_MixedPositiveAndNegativeNumbers() {
        int[] input = {-5, 3, -2, 1, 0};
        int[] expected = {-5, -2, 0, 1, 3};
        BubbleSort.sortUsingBubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSort_LargeArray() {
        int[] input = new int[1000];
        int[] expected = new int[1000];
        for (int i = 0; i < 1000; i++) {
            input[i] = 1000 - i;
            expected[i] = i + 1;
        }
        BubbleSort.sortUsingBubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSort_NullArray() {
        int[] input = null;
        try {
            BubbleSort.sortUsingBubbleSort(input);
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }
    }
}
