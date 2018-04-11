package nowicki;

/**
 * Created by jarek on 10.04.18.
 */
public class QuickSort {


    private static int[] exampleNumbers = {4, 3, 4, 6, 1, 4, 7, 5, 9};

    private static void quicksort(int tablica[], int x, int y) {

        int i,j,v,temp;

        i=x;
        j=y;
        v=tablica[(x+y) / 2];
        do {
            while (tablica[i]<v)
                i++;
            while (v<tablica[j])
                j--;
            if (i<=j) {
                temp=tablica[i];
                tablica[i]=tablica[j];
                tablica[j]=temp;
                i++;
                j--;
            }
        }
        while (i<=j);
        if (x<j)
            quicksort(tablica,x,j);
        if (i<y)
            quicksort(tablica,i,y);
    }


    public static void main(String[] args) {
        quicksort(exampleNumbers, 0, exampleNumbers.length-1);
        for(int i = 0; i < exampleNumbers.length; i ++) {
            System.out.println(exampleNumbers[i]);
        }
    }
}


