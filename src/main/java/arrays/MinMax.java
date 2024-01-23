package arrays;

public class MinMax {
    public static void main(String[] args){
            int[] arr = {9, 2, 1, 6, 4, 7, 5};
            if (arr == null || arr.length == 0) {
                System.out.println("Array is empty");
                return;
            }
            int min = arr[0];
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                } else if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Smallest number: " + min);
            System.out.println("Largest number: " + max);
    }
}
