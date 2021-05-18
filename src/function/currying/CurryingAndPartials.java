package function.currying;

import java.util.function.Function;

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

    public static void main(String[] args) {
        Function<String, Function<String, String>> sum = a -> b -> a + " " + b;
        Function<String, String> func = sum.apply("Hi");
        System.out.println(func.apply("Java"));
        System.out.println(func.apply("C"));
    }
}
