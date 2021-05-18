package lambda.closure;

import java.util.function.IntSupplier;

/**
 * 在上一节的 ProduceFunction.java 中，我们从方法中返回 Lambda 函数。 虽然过程简单，但是有些问题必须再回过头来探讨一下。
 *
 * 闭包（Closure）一词总结了这些问题。 它非常重要，利用闭包可以轻松生成函数。
 *
 * 考虑一个更复杂的 Lambda，它使用函数作用域之外的变量。 返回该函数会发生什么？ 也就是说，当你调用函数时，它对那些 “外部 ”变量引用了什么? 如果语言不能自动解决，那问题将变得非常棘手。 能够解决这个问题的语言被称作 支持闭包，或者称作 词法定界（lexically scoped ，基于词法作用域的）( 也有用术语 变量捕获 variable capture 称呼的)。Java 8 提供了有限但合理的闭包支持，我们将用一些简单的例子来研究它。
 *
 * 首先，下列方法返回一个函数，该函数访问对象字段和方法参数：
 *
 * @author i
 */
public class SharedStorage {
    public static void main(String[] args) {
        Closure1 closure1 = new Closure1();
        IntSupplier supplier1 = closure1.makeFun(0);
        IntSupplier supplier2 = closure1.makeFun(0);
        IntSupplier supplier3 = closure1.makeFun(0);
        IntSupplier supplier4 = closure1.makeFun(0);
        System.out.println(closure1.i);
        System.out.println(supplier1.getAsInt());
        System.out.println(closure1.i);
        System.out.println(supplier2.getAsInt());
        System.out.println(closure1.i);
        System.out.println(supplier3.getAsInt());
        System.out.println(closure1.i);
        System.out.println(supplier4.getAsInt());

    }
}
