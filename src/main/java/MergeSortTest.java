import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {

    public static void main(String[] args) {
        testSmallArrays();
        testTimingExperiment();
    }

    public static void testSmallArrays() {
        System.out.println("=== Testing MergeSort on 10-element arrays ===");

        int[] arr1 = {5, 9, 2, 10, 1, 7, 6, 4, 3, 8};
        System.out.println("\nRandom order:     " + Arrays.toString(arr1));
        MergeSort.mergeSort(arr1);
        System.out.println("Sorted result:    " + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\nSorted order:     " + Arrays.toString(arr2));
        MergeSort.mergeSort(arr2);
        System.out.println("Sorted result:    " + Arrays.toString(arr2));

        int[] arr3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("\nReverse order:    " + Arrays.toString(arr3));
        MergeSort.mergeSort(arr3);
        System.out.println("Sorted result:    " + Arrays.toString(arr3));
    }

    public static void testTimingExperiment() {
        System.out.println("\n=== Timing Experiment: 1000 MergeSort operations ===");

        int[] sizes = {100, 200, 400, 800, 1600, 3200, 6400};
        Random rand = new Random();

        for (int size : sizes) {
            long start = System.currentTimeMillis();

            for (int i = 0; i < 1000; i++) {
                int[] arr = new int[size];
                for (int j = 0; j < size; j++) {
                    arr[j] = rand.nextInt(100000);
                }
                MergeSort.mergeSort(arr);
            }

            long end = System.currentTimeMillis();
            long totalTime = end - start;

            System.out.println("Array size " + size + ": " + totalTime + " ms for 1000 operations");
        }
    }
}