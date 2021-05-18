package function.composition;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateComposition {
    static Predicate<String> p1 = s -> s.equals("yui");
    static Predicate<String> p2 = s -> s.length() == 3;
    static Predicate<String> p3 = p1.and(p2).negate();

    public static void main(String[] args) {
        System.out.println(p1.test("yui"));

        System.out.println(p3.test("yui"));

        Stream.of("bar", "foobar", "foobaz", "fongopuckey","yui").filter(p3).forEach(System.out::println);

    }


}
