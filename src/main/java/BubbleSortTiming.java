import java.util.Random;

public class BubbleSortTiming {

    public static void bubbleSort(int[] myArray) {
        boolean flag=true;
        int n=myArray.length;

        for (int i=0;i<n && flag;i++) {
            flag=false;
            for (int j = 0; j <n - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j + 1];
                    myArray[j + 1] = myArray[j];
                    myArray[j] = temp;
                    flag=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] sizes = {100, 200, 400, 800, 1600, 3200, 6400};
        Random rand = new Random();

        for (int size : sizes) {
            long start = System.currentTimeMillis();

            for (int i = 0; i < 1000; i++) {
                int[] arr = new int[size];
                for (int j = 0; j < size; j++) {
                    arr[j] = rand.nextInt(100000);
                }
                bubbleSort(arr);
            }

            long end = System.currentTimeMillis();
            long totalTime = end - start;

            System.out.println("(" + size + ", " + totalTime + " ms)");
        }
    }
}