package lambda.closure;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * 我们改变了 List 的内容却没产生编译时错误。通过观察本例的输出结果，
 * 我们发现这看起来非常安全。这是因为每次调用 makeFun() 时，其实都会创建并返回一个全新而非共享的 ArrayList。
 * 也就是说，每个闭包都有自己独立的 ArrayList，它们之间互不干扰。
 * @author i
 */
public class Closure8 {
     Supplier<List<Integer>> makeFun(){
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        return () -> (List<Integer>)list;
    }

    public static void main(String[] args) {
        Closure8 closure8 = new Closure8();
        closure8.makeFun().get().forEach(System.out::println);
    }
}
