package function.higher.consume;


import java.util.function.Function;

/**
 * 要消费一个函数，消费函数需要在参数列表正确地描述函数类型.
 * @author i
 */
public class ConsumeFunction {
    static Two twoConsume(Function<One, Two> function) {
        return function.apply(new One());
    }

    public static void main(String[] args) {
        Two two = twoConsume(a -> new Two());
    }
}
