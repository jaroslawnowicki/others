import java.util.Arrays;
import java.util.List;

/**
 * Created by jarek on 25.04.18.
 */
public class StreamReduce {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("jeden", "jedexn", "dwa", "trzy");

        list.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).ifPresent(System.out::println);

        StringBuffer sb = new StringBuffer ('?');

        System.out.println(sb.toString() + " " + sb.toString().length());


        Integer x = new Integer("2");
        if (x.equals(2)) System.out.println ("equals1");
        if (x.equals("2")) System.out.println ("equals2");


        System.out.println (new int[]{1,2});
        System.out.println (new char[]{'a','b'});
        System.out.println ("Hash " + new char[]{'a','b'});


        long y = 1000000000000L;
        int x1 = 0;
        x1 += y;
        System.out.println ("x=" + x1);


        double ix = 3.5d;

        System.out.println(ix / 0 ); //infinity

    }
}
