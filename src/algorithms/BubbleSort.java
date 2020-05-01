package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int[] array = new int[]{23, 43, 90, 12, 34, 53, 26, 65, 78, 43, 68, 19, 13, 10};
        printArray(array);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        printArray(array);

    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.print("]\n");
    }

}
