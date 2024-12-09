import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, (long) '#');
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 752 });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 100 };
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 10, 100 });
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) (byte) 1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) ' ');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 41, 122, 200, 239, 256, 331, 377, 734, 791, 985 });
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, 100L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 915 });
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 1, 10L);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113 });
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113 });
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '#');
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '#');
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 752 });
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) 1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) (short) 100);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 36, 250, 288, 291, 666, 713, 723, 874, 915, 988 });
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, 0L);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 360 });
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '#');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 10, (long) (-1));
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) 100);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 915 });
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '#');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 752 });
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '4');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', (long) (byte) 1);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', 1L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) (-1));
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(0, (long) (byte) 10);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 10);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', (long) (short) 10);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, 0L);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray6);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray6);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 10, 32, 97, 100 });
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '4');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) 10);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) 1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) '#');
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 43, 166, 175, 257, 271, 594, 752, 840, 852, 996 });
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, 1L);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) (byte) 10);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) ' ');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', (long) 'a');
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) (byte) 1);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, 100L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 915 });
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 1, (long) (short) -1);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 913 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) (byte) 100);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 36, 250, 288, 291, 666, 713, 723, 874, 915, 988 });
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', 100L);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (-1L));
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 100 };
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 10, 100 });
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((-1), (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) ' ');
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 41, 122, 200, 239, 256, 331, 377, 734, 791, 985 });
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '4');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }
}

