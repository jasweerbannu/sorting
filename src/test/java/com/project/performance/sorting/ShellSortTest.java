package com.project.performance.sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class ShellSortTest {

    @Test
    public void testShellSort_EmptyArray() {
        int[] input = {};
        int[] expected = {};
        ShellSort.sortUsingShellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testShellSort_SingleElement() {
        int[] input = {1};
        int[] expected = {1};
        ShellSort.sortUsingShellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testShellSort_AlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        ShellSort.sortUsingShellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testShellSort_ReverseSorted() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        ShellSort.sortUsingShellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testShellSort_RandomArray() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        ShellSort.sortUsingShellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testShellSort_NegativeNumbers() {
        int[] input = {-5, -10, -3, -1, -7};
        int[] expected = {-10, -7, -5, -3, -1};
        ShellSort.sortUsingShellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testShellSort_AllSameValues() {
        int[] input = {8, 8, 8, 8, 8};
        int[] expected = {8, 8, 8, 8, 8};
        ShellSort.sortUsingShellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testShellSort_MixedPositiveAndNegativeNumbers() {
        int[] input = {5, -1, 3, -7, 0};
        int[] expected = {-7, -1, 0, 3, 5};
        ShellSort.sortUsingShellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testShellSort_DuplicatesInArray() {
        int[] input = {7, 2, 7, 1, 7};
        int[] expected = {1, 2, 7, 7, 7};
        ShellSort.sortUsingShellSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testShellSort_LargeArray() {
        int[] input = new int[1000];
        int[] expected = new int[1000];
        for (int i = 0; i < 1000; i++) {
            input[i] = 1000 - i;
            expected[i] = i + 1;
        }
        ShellSort.sortUsingShellSort(input);
        assertArrayEquals(expected, input);
    }

//    @Test
//    public void testShellSort_NullArray() {
//        int[] input = null;
//        try {
//            ShellSort.sortUsingShellSort(input);
//        } catch (NullPointerException e) {
//            assertNotNull(e.getMessage());
//        }
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testShellSort_NullArray() {
        ShellSort.sortUsingShellSort(null);
    }
}
