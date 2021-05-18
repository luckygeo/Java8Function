package function.composition;

import java.util.function.Function;

/**
 * 这里我们重点看正在创建的新函数 f4。它调用 apply() 的方式与常规几乎无异[^8]。
 *
 * 当 f1 获得字符串时，它已经被f2 剥离了前三个字符。这是因为 compose（f2） 表示 f2 的调用发生在 f1 之前。
 *
 * @author i
 */
public class FunctionComposition {
    static Function<String, String> f1 = a -> {
        System.out.println(a);
        return a.replace('A', '_');
    };
    static Function<String, String> f2 = a -> a.substring(3);
    static Function<String, String> f3 = a -> a.toLowerCase();
    static Function<String, String> f4 = f1.compose(f2).andThen(f3);

    public static void main(String[] args) {
        System.out.println(f4.apply("GO AFTER ALL AMBULANCES")); // _FTER _LL _MBUL_NCES
    }


}
