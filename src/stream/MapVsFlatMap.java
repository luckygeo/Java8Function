package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: i
 * @createDate: 2021/8/6
 * @version: 1.0
 * <p>
 * map() and flatMap() APIs stem from functional languages. In Java 8, we can find them in Optional, Stream and in CompletableFuture (although under a slightly different name).
 * <p>
 * Streams represent a sequence of objects whereas optionals are classes that represent a value that can be present or absent. Among other aggregate operations, we have the map() and flatMap() methods.
 * <p>
 * Despite the fact that both have the same return types, they are quite different. Let's explain these differences by analyzing some examples of streams and optionals.
 */
public class MapVsFlatMap {
    public static void main(String[] args) {
        //--1. Map and Flatmap in Optionals
        Optional<String> optional = Optional.of("test");
        System.out.println(Objects.equals(Optional.of("TEST"), optional.map(String::toUpperCase)));
        System.out.println(Objects.equals(Optional.of(Optional.of("STRING")),
                Optional
                        .of("string")
                        .map(s -> Optional.of("STRING"))));
        //flatmap can do it
        System.out.println(Objects.equals(Optional.of("STRING"), Optional
                .of("string")
                .flatMap(s -> Optional.of("STRING"))));
        //--2.Map and Flatmap in Streams
        List<String> collect = Stream.of("a", "b").map(String::toUpperCase).collect(Collectors.toList());
        collect.forEach(System.out::println);
        List<List<String>> lists = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));
        List<String> collect1 = lists.stream().flatMap(a -> a.stream()).map(String::toUpperCase).collect(Collectors.toList());
        collect1.forEach(System.out::print);

        System.out.println("--------------");
        List<String> collect2 = Stream.of(Arrays.asList("a", "b"), Arrays.asList(1, 2)).map(a -> a.toString()).collect(Collectors.toList());
        collect2.stream().forEach(System.out::println);
        List<String> collect3 = collect2.stream().peek(String::toUpperCase).collect(Collectors.toList());
        collect3.forEach(System.out::println);
        System.out.println();
    }
}
