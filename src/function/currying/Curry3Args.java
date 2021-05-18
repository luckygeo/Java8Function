package function.currying;

import java.util.function.Function;

public class Curry3Args {
    public static void main(String[] args) {
        Function<String, Function<String, Function<String, String>>> func = a -> b -> c -> a + b + c;

        String s = func.apply("1").apply("2").apply("3");
        System.out.println(s);
    }
}
