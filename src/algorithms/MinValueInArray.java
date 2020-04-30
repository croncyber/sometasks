package algorithms;

public class MinValueInArray {
    public static void main(String[] args) {
        int[] array = new int[]{23, 43, 90, 12, 34, 53, 26, 65, 78, 43, 68, 19, 13, 10};

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = 1;

            }
        }

        System.out.println("min value: " + minValue);
        System.out.println("min index: " + minIndex);
    }

}
