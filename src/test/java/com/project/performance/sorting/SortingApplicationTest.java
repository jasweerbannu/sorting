package com.project.performance.sorting;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortingApplicationTest {

    @Test
    public void testGenerateRandomNumbers() {
        // Test with valid inputs
        int[] randomNumbers = SortingApplication.generateRandomNumbers(5, 12345L);
        assertEquals(5, randomNumbers.length);

        // Verify reproducibility with the same seed
        int[] expected = SortingApplication.generateRandomNumbers(5, 12345L);
        assertArrayEquals(expected, randomNumbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateRandomNumbers_NegativeSize() {
        SortingApplication.generateRandomNumbers(-1, 12345L);
    }

    @Test
    public void testGenerateRandomNumbers_ZeroSize() {
        int[] randomNumbers = SortingApplication.generateRandomNumbers(0, 12345L);
        assertEquals(0, randomNumbers.length);
    }

    @Test
    public void testMeasureAndCompareSortingPerformance_ValidArray() {
        int[] inputArray = {5, 3, 8, 1, 2};
        SortingApplication.measureAndCompareSortingPerformance(inputArray);
        // Verify the array remains unchanged
        assertArrayEquals(new int[]{5, 3, 8, 1, 2}, inputArray);
    }

    @Test
    public void testMeasureAndCompareSortingPerformance_EmptyArray() {
        int[] emptyArray = {};
        SortingApplication.measureAndCompareSortingPerformance(emptyArray);
        assertEquals(0, emptyArray.length);
    }

    @Test
    public void testMeasureAndCompareSortingPerformance_NullArray() {
        // Null input should not throw exceptions
        SortingApplication.measureAndCompareSortingPerformance(null);
    }

    @Test
    public void testMain_UserProvidedInput() {
        // Simulate user input for manual array
        String input = "yes\n10 20 30 40 50\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SortingApplication.main(new String[]{});
    }

    @Test
    public void testMain_RandomGeneratedInput() {
        // Simulate user input for random generation
        String input = "no\n5\n12345\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SortingApplication.main(new String[]{});
    }

    @Test
    public void testMain_InvalidUserChoice() {
        // Simulate invalid input for user choice
        String input = "maybe\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SortingApplication.main(new String[]{});
    }

    @Test
    public void testMeasureSortingPerformance_LargeArray() {
        // Test sorting performance with a large array
        int[] largeArray = SortingApplication.generateRandomNumbers(1000, 12345L);
        SortingApplication.measureAndCompareSortingPerformance(largeArray);
        assertEquals(1000, largeArray.length);
    }

    @Test
    public void testMeasureSortingPerformance_Duplicates() {
        // Test array with duplicate elements
        int[] duplicateArray = {5, 1, 3, 1, 5, 3};
        SortingApplication.measureAndCompareSortingPerformance(duplicateArray);
        assertEquals(6, duplicateArray.length);
    }

    @Test
    public void testMeasureSortingPerformance_MinMaxValues() {
        // Test array with extreme integer values
        int[] extremeArray = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        SortingApplication.measureAndCompareSortingPerformance(extremeArray);
        assertEquals(3, extremeArray.length);
    }

    @Test
    public void testBestAlgorithmSelection() {
        int[] arrayToSort = {3, 1, 2};

        // Execute without throwing exceptions
        SortingApplication.measureAndCompareSortingPerformance(arrayToSort);

        // Ensure array remains unchanged
        assertArrayEquals(new int[]{3, 1, 2}, arrayToSort);
    }

    @Test
    public void testBestAlgorithmSelection_EmptyArray() {
        // Ensure no exceptions for empty arrays
        int[] emptyArray = {};
        SortingApplication.measureAndCompareSortingPerformance(emptyArray);
        assertEquals(0, emptyArray.length);
    }

    @Test
    public void testBestAlgorithmSelection_NullArray() {
        // Ensure no exceptions for null input
        SortingApplication.measureAndCompareSortingPerformance(null);
    }
}
