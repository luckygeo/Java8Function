package function.currying;

import enums.EnumSeason;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 柯里化（Currying）的名称来自于其发明者之一 Haskell Curry。
 * 他可能是计算机领域唯一姓氏和名字都命名过重要概念的人（另外就是 Haskell 编程语言）。
 * 柯里化意为：将一个多参数的函数，转换为一系列单参数函数
 *
 * @author i
 */
public class CurryingAndPartials {
    static String uncurried(String a, String b) {
        return a + b;
    }

//    public static void main(String[] args) {
//        Function<String, Function<String, String>> sum = a -> b -> a + " " + b;
//        Function<String, String> func = sum.apply("Hi");
//        System.out.println(func.apply("Java"));
//        System.out.println(func.apply("C"));
//        EnumSeason winter = EnumSeason.valueOf("SPRING");
//        EnumSeason.AUTUMN.getName();
//        Optional<String> s = Arrays.stream(EnumSeason.values())
//                .map(a -> a.getName())
//                .filter(a -> a.equals("春1")).findFirst();
//        if (s.isPresent()) {
//            System.out.println(s.get());
//        }
//        Optional<String> spring = createEnumCheck(EnumSeason.values(), a -> {
//            //System.out.println(a.getName());
//            return a.getName();
//        }).apply("春");
//
//         spring.ifPresent(System.out::println);
//
//    }
//
//    private static <E, T> Function<T, Optional<T>> createEnumCheck(E[] enums, Function<E, T> mapper,Predicate<EnumSeason> predicate) {
//        return  t -> Arrays.stream(enums)
//                .filter(a->{
//                    //System.out.println("a->" + a);
//                    //System.out.println("t->" + t);
//                    return a.equals(t);
//                }).findFirst();
//    }

    public static void main(String[] args) {
        Function<String, Function<String, String>> sum = a -> b -> a + " " + b;
        Function<String, String> func = sum.apply("Hi");
        System.out.println(func.apply("Java"));
        System.out.println(func.apply("C"));
    }
}
