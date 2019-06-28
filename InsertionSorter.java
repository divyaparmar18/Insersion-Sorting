import java.util.Arrays;

public class InsertionSorter {

    public static int[] insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while ((j > -1) && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }


    public static void main(String a[]) {
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println(Arrays.toString(insertionSort(arr1)));

    }
}
