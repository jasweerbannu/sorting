import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '#', (long) (short) 1);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) ' ');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 41, 122, 200, 239, 256, 331, 377, 734, 791, 985 });
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) ' ');
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) (short) -1);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, 0L);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 29, 53, 360, 447, 491, 515, 719, 761, 854, 948 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) (short) -1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) (short) -1);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '#', (long) '#');
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) 10);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113, 214, 246, 290, 293, 380, 456, 797, 888, 981 });
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (-1L));
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '4');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, 0L);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 29, 53, 360, 447, 491, 515, 719, 761, 854, 948 });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) ' ');
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '#', (long) '#');
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '4');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) 'a');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 38 });
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 10, (long) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 360, 948, 29, 447, 515, 53, 491, 761, 719, 854 });
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 10, 32, 97, 100 });
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) (short) 100);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 36, 250, 288, 291, 666, 713, 723, 874, 915, 988 });
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) 1);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '#', (-1L));
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) (short) 100);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 36, 250, 288, 291, 666, 713, 723, 874, 915, 988 });
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) 100);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) ' ');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 10, 32, 97, 100 });
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '#');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', 1L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '#', (long) '#');
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, 100L);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 915 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) 1);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 100 };
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 10, 100 });
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) (short) 100);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 36, 250, 288, 291, 666, 713, 723, 874, 915, 988 });
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray6);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray6);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 10, 32, 97, 100 });
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '#', (long) 0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '4');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) '#');
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 43, 166, 175, 257, 271, 594, 752, 840, 852, 996 });
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) 1);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) ' ');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 41, 122, 200, 239, 256, 331, 377, 734, 791, 985 });
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '4');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) 'a');
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 38 });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, 1L);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) (byte) 10);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '4', (long) 'a');
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) ' ');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) 0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '4', (long) '4');
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((-1), (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) '#');
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) '#');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '4');
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) ' ');
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
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
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 100 };
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 10, 100 });
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) (byte) 1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(0, (long) (short) 100);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, (long) 10);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113 });
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) (-1));
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 10);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', (long) (short) 10);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) (short) 10);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) 0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) 1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) ' ');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 41, 122, 200, 239, 256, 331, 377, 734, 791, 985 });
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (short) 10);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113, 214, 246, 290, 293, 380, 456, 797, 888, 981 });
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '4');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) 1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) '#');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 1, 10L);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113 });
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) (-1));
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 1, (long) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113 });
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, (long) 10);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113 });
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '4');
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 100 };
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 10, 100 });
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (-1L));
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) (short) 100);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', (long) ' ');
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, 1L);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '4');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '4', (long) (short) 100);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) (short) -1);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) (byte) 1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) (short) -1);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) (short) 100);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 36, 250, 288, 291, 666, 713, 723, 874, 915, 988 });
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) 'a', (long) (-1));
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) ' ');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 41, 122, 200, 239, 256, 331, 377, 734, 791, 985 });
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray6);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray6);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 10, 32, 97, 100 });
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '4', (long) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '#');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '#', (long) '#');
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '4');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) '#');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(0, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) (-1));
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) ' ');
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) (byte) 10);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '4', (-1L));
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) 1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', (long) (short) 10);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, 10L);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, (long) (short) 0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 360 });
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) 1);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) 'a');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 38 });
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) 'a', (long) (short) 1);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, (long) 10);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', 1L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) 100);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 915 });
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, (long) 100);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 915 });
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) 0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '4');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
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
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) (short) 100);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(0, (long) 'a');
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) (byte) 10);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(0, (long) 0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '4');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '4');
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, 0L);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 29, 53, 360, 447, 491, 515, 719, 761, 854, 948 });
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 10, 1L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '#', (long) (byte) 1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 100 };
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 10, 100 });
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) ' ');
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 41, 122, 200, 239, 256, 331, 377, 734, 791, 985 });
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, (long) 10);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113 });
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) '#');
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 1, (long) (short) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 913 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, (long) (short) 100);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 915 });
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray6);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 10, 32, 97, 100 });
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) '#');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (short) 10);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113, 214, 246, 290, 293, 380, 456, 797, 888, 981 });
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '4');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 100 };
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray3);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 10, 100 });
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) (byte) 100);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', (long) (short) 1);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) 0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(0, (long) (byte) -1);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', 1L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) 0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 1);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '4');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) (-1));
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) 100);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 10, (long) (byte) 10);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113, 214, 246, 290, 293, 380, 456, 797, 888, 981 });
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) 'a');
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 10, 32, 97, 100 });
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) (byte) 100);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(0, 1L);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '4', (long) (-1));
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 29, 53, 360, 447, 491, 515, 719, 761, 854, 948 });
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', 10L);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 10);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, (long) (short) 10);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113 });
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) ' ');
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 41, 122, 200, 239, 256, 331, 377, 734, 791, 985 });
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, 0L);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 360 });
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 1, (long) (byte) 1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 985 });
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', (long) (short) 10);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (-1L));
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '4');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 10, 32, 97, 100 });
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) (byte) 0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) (byte) 1);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 100 };
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray3);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) ' ');
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '4');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, 10L);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '4', (long) 'a');
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (short) 1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '4', (-1L));
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 100 };
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 10, 100 });
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) (short) 100);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 36, 250, 288, 291, 666, 713, 723, 874, 915, 988 });
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (short) 10);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113, 214, 246, 290, 293, 380, 456, 797, 888, 981 });
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(0, (-1L));
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 1, 10L);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113 });
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) (byte) 0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 100 };
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray3);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray3);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 10, 100 });
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', (long) (short) 10);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
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
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, (long) (short) -1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '4');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, (long) 100);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '4', (long) (short) 1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '4');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray6);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray6);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray6);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray6);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 10, 32, 97, 100 });
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) ' ');
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 41, 122, 200, 239, 256, 331, 377, 734, 791, 985 });
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, (long) (byte) 1);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 985 });
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) (-1));
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) 1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) 1);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 254, 313, 434, 588, 606, 748, 847, 904, 978, 985 });
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '4', (long) (-1));
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 10, (long) (byte) 0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 29, 53, 360, 447, 491, 515, 719, 761, 854, 948 });
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 10, 1L);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 985, 588, 847, 313, 254, 904, 434, 606, 978, 748 });
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) 100);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 915 });
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(100, (long) (-1));
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) '4');
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 871 });
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 1, (long) (short) 100);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 915 });
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) (short) -1);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(0, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 0, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '#', (long) (short) -1);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(0, (long) (byte) 0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) ' ', 1L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '#', (long) (short) 1);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
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
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 100, 0L);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
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
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
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
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) '4', (long) (-1));
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        int[] intArray0 = new int[] {};
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray0);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 1, 10L);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 113 });
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(1, (long) 100);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        com.project.performance.sorting.QuickSort.sortUsingQuickSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 915 });
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
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
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray0);
        com.project.performance.sorting.SortingApplication.measureAndCompareSortingPerformance(intArray0);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (byte) 0, 10L);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers((int) (short) 100, (long) '4');
        com.project.performance.sorting.HeapSort.sortUsingHeapSort(intArray2);
        com.project.performance.sorting.RadixSort.sortUsingRadixSort(intArray2);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        int[] intArray2 = com.project.performance.sorting.SortingApplication.generateRandomNumbers(10, (long) (byte) -1);
        com.project.performance.sorting.ShellSort.sortUsingShellSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.BubbleSort.sortUsingBubbleSort(intArray2);
        com.project.performance.sorting.InsertionSort.sortUsingInsertionSort(intArray2);
        com.project.performance.sorting.MergeSort.sortUsingMergeSort(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 225, 438, 439, 477, 478, 579, 604, 731, 765, 913 });
    }
}

