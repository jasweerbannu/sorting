package com.project.performance.sorting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        int[] intArray1 = new int[] { (short) 10 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray1);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray1);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 10 });
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        int[] intArray3 = new int[] { (byte) 10, (short) 10, (short) 100 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 10, 100 });
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        int[] intArray1 = new int[] { (short) 10 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray1);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray1);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray1);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 10 });
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        int[] intArray1 = new int[] { (short) 10 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray1);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 10 });
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        int[] intArray1 = new int[] { (short) 10 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray1);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray1);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 10 });
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }
}

