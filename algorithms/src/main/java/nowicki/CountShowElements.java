package nowicki;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;


public class CountShowElements {

    private static final Random generator = new Random();
    private static final int maxValue = 500000000;

    public static void main(String[] args) {


        int b;
        int c;
        int suma = 0;

        //init
        Scanner zczytaj = new Scanner(System.in);
        b = maxValue;

        System.out.println("Podaj zliczany element");
        c = zczytaj.nextInt();


        long time = System.currentTimeMillis();
        int[] a = new int[maxValue];

        for (int i = 0; i < b; i++) {
            a[i] = generator.nextInt(maxValue);
        }

        zczytaj.close();

        for (int i = 0; i < a.length; i++) {
            if (c == a[i]) {
                suma++;
            }
        }


        if (suma == 1) {
            System.out.println("element występuje " + suma + " raz");
        } else {
            System.out.println("element występuje " + suma + " razy");
        }

        System.out.println("czas petli " + (System.currentTimeMillis() - time) + " ms");

        long timeRange = System.currentTimeMillis();

        long i = IntStream.range(0, maxValue).parallel().filter(s -> (s == c)).count();
//




        System.out.println("range " + i);

        System.out.println("czas range " + (System.currentTimeMillis() - timeRange) + " ms");


    }
}
