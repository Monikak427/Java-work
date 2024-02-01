package additional;

public class ArraySum {

    public static int calculateArraySum(int[] array) {
        int sum = 0;

        for (int item : array) {
            sum += item;
        }

        return sum;
    }
}

