import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] array1, int[] array2) {

        int[] combined= new int[array1.length+array2.length];
        int mainIndex = 0;
        int i=0, j=0;

        while (i<array1.length && j<array2.length) {

            if (array1[i]<array2[j]) {
                combined[mainIndex] = array1[i];
                mainIndex++;
                i++;
            }else {
                combined[mainIndex] = array2[j];
                mainIndex++;
                j++;
            }
        }
        while (i<array1.length) {
            combined[mainIndex] = array1[i];
            mainIndex++;
            i++;
        }
        while (j<array2.length) {
            combined[mainIndex] = array2[j];
            mainIndex++;
            j++;
        }
        return combined;
    }

    public static int[] mergeSort(int[] array) {

        if (array.length==1) {
            return array;
        }
        int mid = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));
        return merge(left, right);
    }
    public static void main(String[] args) {

        int[] originalArray = {3,1,4,2};

        int [] sortedArray = mergeSort(originalArray);

        System.out.println( "\nOriginal Array: " + Arrays.toString( originalArray ) );

        System.out.println( "\nSorted Array: " + Arrays.toString( sortedArray ) );


    }
}