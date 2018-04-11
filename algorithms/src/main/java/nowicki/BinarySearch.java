package nowicki;

import java.util.Random;

/**
 * Created by jarek on 06.04.18.
 */
public class BinarySearch {

    private static int a[];

    private static final Random generator = new Random();
    private static final int maxValue = Integer.MAX_VALUE;
    private static final int searchElement = 10;

    /**
     * @param args
     */
    public static void main(String[] args) {
        int l, p, s, n, x;


        n = maxValue;
        a = new int[maxValue];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        System.out.println("Podaj element do wyszukania");
        x = searchElement;


        long time = System.currentTimeMillis();

        l = 0;
        p = n - 1;
        while (l <= p) {
            s = (l + p) / 2;

            if (a[s] == x) {

                System.out.println("Odnaleziono element " + x + " pod indeksem " + s);
                System.out.println("Czas " + (System.currentTimeMillis() -time));
                return;
            }

            if (a[s] < x)
                l = s + 1;
            else
                p = s - 1;
        }

        System.out.println("Nie odnaleziono w tablicy elementu " + x);

    }
}
