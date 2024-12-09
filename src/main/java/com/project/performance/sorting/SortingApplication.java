package com.project.performance.sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Do you want to provide your own numbers to sort? (yes/no)");
            String userChoice = scanner.nextLine().trim().toLowerCase();

            int[] arrayToSort;

            if (userChoice.equals("yes")) {
                System.out.println("Enter numbers separated by spaces:");
                String[] inputNumbers = scanner.nextLine().split(" ");
                arrayToSort = new int[inputNumbers.length];
                for (int index = 0; index < inputNumbers.length; index++) {
                    arrayToSort[index] = Integer.parseInt(inputNumbers[index]);
                }
            } else {
                System.out.println("How many random numbers do you want to generate?");
                int numberOfElements = scanner.nextInt();
                if (numberOfElements <= 0) {
                    throw new IllegalArgumentException("Number of elements must be greater than 0.");
                }
                System.out.println("Enter a seed for random number generation:");
                long seed = scanner.nextLong();
                arrayToSort = generateRandomNumbers(numberOfElements, seed);
                System.out.println("Generated Array: " + Arrays.toString(arrayToSort));
            }

            // Sort and Measure Performance
            measureAndCompareSortingPerformance(arrayToSort);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int[] generateRandomNumbers(int numberOfElements, long seed) {
        if (numberOfElements < 0) {
            throw new IllegalArgumentException("Number of elements cannot be negative.");
        }
        Random random = new Random(seed);
        int[] randomNumbers = new int[numberOfElements];
        for (int index = 0; index < numberOfElements; index++) {
            randomNumbers[index] = random.nextInt(1000); // Generate numbers between 0 and 999
        }
        return randomNumbers;
    }

    public static void measureAndCompareSortingPerformance(int[] arrayToSort) {
        if (arrayToSort == null || arrayToSort.length == 0) {
            System.out.println("Array is null or empty. Skipping sorting operations.");
            return;
        }

        // Array copies for each sorting algorithm
        int[] bubbleSortArray = arrayToSort.clone();
        int[] mergeSortArray = arrayToSort.clone();
        int[] quickSortArray = arrayToSort.clone();
        int[] insertionSortArray = arrayToSort.clone();
        int[] shellSortArray = arrayToSort.clone();
        int[] heapSortArray = arrayToSort.clone();
        int[] radixSortArray = arrayToSort.clone();

        // Measure sorting performance
        long bubbleDuration = measureSortTime(BubbleSort::sortUsingBubbleSort, bubbleSortArray);
        long mergeDuration = measureSortTime(MergeSort::sortUsingMergeSort, mergeSortArray);
        long quickDuration = measureSortTime(QuickSort::sortUsingQuickSort, quickSortArray);
        long insertionDuration = measureSortTime(InsertionSort::sortUsingInsertionSort, insertionSortArray);
        long shellDuration = measureSortTime(ShellSort::sortUsingShellSort, shellSortArray);
        long heapDuration = measureSortTime(HeapSort::sortUsingHeapSort, heapSortArray);
        long radixDuration = measureSortTime(RadixSort::sortUsingRadixSort, radixSortArray);

        // Display results
        System.out.println("\nSorting Results:");
        System.out.println("Bubble Sort Duration: " + bubbleDuration + " nanoseconds");
        System.out.println("Merge Sort Duration: " + mergeDuration + " nanoseconds");
        System.out.println("Quick Sort Duration: " + quickDuration + " nanoseconds");
        System.out.println("Insertion Sort Duration: " + insertionDuration + " nanoseconds");
        System.out.println("Shell Sort Duration: " + shellDuration + " nanoseconds");
        System.out.println("Heap Sort Duration: " + heapDuration + " nanoseconds");
        System.out.println("Radix Sort Duration: " + radixDuration + " nanoseconds");

        // Determine the best-performing algorithm
        long minDuration = Math.min(
                Math.min(bubbleDuration, Math.min(mergeDuration, quickDuration)),
                Math.min(Math.min(insertionDuration, shellDuration), Math.min(heapDuration, radixDuration))
        );

        String bestAlgorithm = (minDuration == bubbleDuration) ? "Bubble Sort"
                : (minDuration == mergeDuration) ? "Merge Sort"
                : (minDuration == quickDuration) ? "Quick Sort"
                : (minDuration == insertionDuration) ? "Insertion Sort"
                : (minDuration == shellDuration) ? "Shell Sort"
                : (minDuration == heapDuration) ? "Heap Sort"
                : "Radix Sort";

        System.out.println("\nThe best-performing algorithm is: " + bestAlgorithm);
    }

    private static long measureSortTime(SortingAlgorithm algorithm, int[] array) {
        long startTime = System.nanoTime();
        algorithm.sort(array);
        return System.nanoTime() - startTime;
    }

    @FunctionalInterface
    interface SortingAlgorithm {
        void sort(int[] array);
    }
}
