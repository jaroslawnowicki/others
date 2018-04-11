package nowicki;

import java.util.Random;

/**
 * Created by jarek on 06.04.18.
 */
public class MinMaxElements {


    private static int a[];
    private static final Random generator = new Random();
    private static final int maxValue = 500000000;

    public static void main(String[] args) {
        int n = maxValue, wynik;

        a = new int[maxValue];

        for (int i=0; i<n; i++) {

            a[i] = generator.nextInt(maxValue);
        }


        wynik = a[0];
        for (int i=1; i<n; i++) {
            if (wynik > a[i]) {
                wynik = a[i];
            }
        }

        System.out.println("Najmniejszy element w tablicy to " + wynik);


        wynik = a[0];
        for (int i=1; i<n; i++) {
            if (wynik < a[i]) {
                wynik = a[i];
            }
        }

        System.out.println("Najwiekszy element w tablicy to " + wynik);

    }
}
