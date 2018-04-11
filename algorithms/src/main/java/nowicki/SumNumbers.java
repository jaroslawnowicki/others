package nowicki;

/**
 * Created by jarek on 10.04.18.
 */
public class SumNumbers {

    private static int exampleNumber = 14877;

    public static void main(String[] args) {

        int sum = 0;
        while (exampleNumber != 0) {
            sum += exampleNumber%10;
            exampleNumber /= 10;
        }

        System.out.println("suma cyfr podanej liczby wynosi " + sum);


    }
}
