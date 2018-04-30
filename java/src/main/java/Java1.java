import java.io.IOException;
import java.math.BigInteger;

public class Java1 {

    public static void main(String[] args) {
        Java1 java1 = new Java1();

        java1.t1();
        java1.swapping();

//        try {
//            java1.reader();
//        } catch (IOException IOex) {
//            IOex.printStackTrace();
//        }



        java1.primeNumber();
    }


    private void t1() {

        int a = 100;
        System.out.println((a & 1) == 0 ?  "EVEN" : "ODD" );
        int b = 101;
        System.out.println((b & 1) == 0 ?  "EVEN" : "ODD" );
    }

    private void swapping() {
        int a = 5;
        int b = 7;

        System.out.println("a " + a + " b " + b);

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println("a " + a + " b " + b);
    }

    private void reader() throws IOException {


        String fileName = "/home/jarek/Projekty/others/java/pom.xml";


        Reader s=new Reader(fileName);
        int n = s.nextInt();
        int k = s.nextInt();
        int count=0;
        while (null != s.readLine())
        {

            System.out.println(s.readLine());
//            int x = s.nextInt();
//            if (x%k == 0)
//                count++;
        }
        System.out.println(count);
    }

    private void primeNumber() {
        System.out.println(BigInteger.valueOf(31).isProbablePrime(1));

        System.out.println(BigInteger.valueOf(32).isProbablePrime(1));
    }
}
