import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class SelectionSort {
    public static void main(String[] args) {

        // generating array values
        Random random = new Random();
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        // printing array
        System.out.println(Arrays.toString(arr));
        // calling sorting algorithm method
        selectionSort(arr);
        // printing sorted array
        System.out.println(Arrays.toString(arr));
    }

    // sorting method
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // initializing the default min element
            int min = arr[i];
            // settings index of min
            int indexOfMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    // assigning the minimum found element
                    min = arr[j];
                    // storing the index of the minimum element
                    indexOfMin = j;
                }
            }
            // calling the swap for swapping the min element and new min element
            swapNum(arr, i, indexOfMin);
        }
    }

    private static void swapNum(int[] arr, int i, int indexOfMin) {
        int temp;
        temp = arr[i];
        arr[i] = arr[indexOfMin];
        arr[indexOfMin] = temp;


    }
}