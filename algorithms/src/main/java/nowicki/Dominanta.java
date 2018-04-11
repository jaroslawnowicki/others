package nowicki;

/**
 * Created by jarek on 10.04.18.
 */
public class Dominanta {

    private static int[] tab;
    private static int[] liczby;
    private static int[] ilosc;

    private static int[] exampleNumbers = {1 , 2, 3, 4, 4, 5, 5, 6, 6, 6};

    public static void main(String[] args) {

        int n = exampleNumbers.length;
        tab = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = exampleNumbers[i];
        }

        liczby = new int[n];
        ilosc = new int[n];
        int indeks = 0;
        int ileLiczb = 0;

        for (int i = 0; i < n; i++) {
            int temp = tab[i];

            for (int j = 0; j < n; j++) {
                if (liczby[j] == temp) {
                    ++ilosc[j];
                    break;
                }
                else if (j == n-1) {
                    liczby[indeks] = temp;
                    ilosc[indeks] = 1;
                    ++indeks;
                    ++ileLiczb;
                }
            }
        }

        int dominanta = 0;
        int licznik = 1;
        for (int i = 1; i < ileLiczb; i++) {
            if (ilosc[i] > ilosc[dominanta]) {
                dominanta = i;
                licznik = 1;
            }
            else if(ilosc[i] == ilosc[dominanta]) {
                ++licznik;
            }
        }

        if (licznik == 1) {
            System.out.println("Dominanta jest liczba " + liczby[dominanta] + ". Wystapila " + ilosc[dominanta] + " razy");
        }
        else {
            System.out.println("Nie ma dominanty");
        }
    }
}
