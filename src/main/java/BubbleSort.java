import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] myArray) {
        int firstPos = 0;
        int lastPos = myArray.length - 1;
        int lastSwapPos;
        int temp;
        int numComparisons = 0;
        int numSwaps = 0;

        while (firstPos < lastPos) {
            lastSwapPos = firstPos;

            for (int i = firstPos; i <= lastPos - 1; i++) {
                numComparisons++;

                if (myArray[i] > myArray[i + 1]) {
                    numSwaps++;

                    temp = myArray[i + 1];
                    myArray[i + 1] = myArray[i];
                    myArray[i] = temp;

                    lastSwapPos = i;
                }
            }

            lastPos = lastSwapPos;
        }

        System.out.printf("I made %d comparisons and %d swaps%n", numComparisons, numSwaps);
    }

    public static void bubbleSort2(int[] myArray) {
        boolean flag=true;
        int n=myArray.length;
        int numComparisons=0, numSwaps=0;
        for (int i=0;i<n && flag;i++) {
            flag=false;
            for (int j = 0; j <n - i - 1; j++) {
                numComparisons++;
                if (myArray[j] > myArray[j + 1]) {
                    numSwaps++;
                    int temp = myArray[j + 1];
                    myArray[j + 1] = myArray[j];
                    myArray[j] = temp;
                    flag=true;
                }
            }
        }

        System.out.printf("I made %d comparisons and %d swaps%n", numComparisons, numSwaps);
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 10, 9, 3, 54, 23, 1, 6, 32, 8};
        System.out.println(Arrays.toString(arr1));
        bubbleSort2(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        int[] arr2 = {1, 3, 5, 6, 8, 9, 10, 23, 32, 54};
        System.out.println(Arrays.toString(arr2));
        bubbleSort2(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        int[] arr3 = {54, 32, 23, 10, 9, 8, 6, 5, 3, 1};
        System.out.println(Arrays.toString(arr3));
        bubbleSort2(arr3);
        System.out.println(Arrays.toString(arr3));

    }
}