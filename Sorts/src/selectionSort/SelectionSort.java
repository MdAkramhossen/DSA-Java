package selectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;

                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
      int[] arr = { 5, 4, 3, 2, 1,5,9,3,6,5,2,4,8,9,10 };
      selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
