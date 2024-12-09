package com.project.performance.sorting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

    public static boolean debug = false;

    @Test
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
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
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        int[] intArray3 = new int[] { 1, 1, (short) 1 };
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 1, 1 });
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        int[] intArray2 = new int[] { (-1), 100 };
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
    }
}

