package nowicki;

/**
 * Created by jarek on 10.04.18.
 */
public class Average {

    private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {

        int sizeNumbers = numbers.length;

        int sum = 0;

        for (int i = 0; i < sizeNumbers; i ++) {
            sum += numbers[i];
        }

        double average = (double) sum / sizeNumbers;

        System.out.println(average);
    }
}
