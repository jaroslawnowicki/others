import java.util.stream.Stream;

/**
 * Created by jarek on 25.04.18.
 */
public class StreamConcat {

    public static void main(String[] args ) {

        Stream<String> stream1 = Stream.of("jeden");
        Stream<String> stream2 = Stream.of("dwa");
        Stream<String> stream3 = Stream.of("trzy");
        Stream<String> stream4 = Stream.of("jeden");


//        Stream.concat(Stream.concat(stream1, Stream.concat(stream2, stream4)), stream3).forEach(System.out::println);

        Stream.concat(Stream.concat(stream1, Stream.concat(stream2, stream4)), stream3).distinct().forEach(System.out::println);
    }
}
