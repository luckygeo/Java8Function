package lambda.closure;

import java.util.function.IntSupplier;

/**
 * 闭包（Closure）一词总结了这些问题。 它非常重要，利用闭包可以轻松生成函数。
 *
 * 考虑一个更复杂的 Lambda，它使用函数作用域之外的变量。 返回该函数会发生什么？ 也就是说，当你调用函数时，
 * 它对那些 “外部 ”变量引用了什么?
 *
 * 如果语言不能自动解决，那问题将变得非常棘手。 能够解决这个问题的语言被称作 支持闭包，或者称作
 * 词法定界（lexically scoped ，基于词法作用域的）( 也有用术语 变量捕获 variable capture 称呼的)。
 * Java 8 提供了有限但合理的闭包支持，我们将用一些简单的例子来研究它。
 *
 * 首先，下列方法返回一个函数，该函数访问对象字段和方法参数：
 *
 * 但是，仔细考虑一下，i 的这种用法并非是个大难题，因为对象很可能在你调用 makeFun()
 * 之后就存在了——实际上，垃圾收集器几乎肯定会保留以这种方式被绑定到现存函数的对象[^5]。
 * 当然，如果你对同一个对象多次调用 makeFun() ，你最终会得到多个函数，它们共享 i 的存储空间
 */
public class Closure1 {
    int i;
    public IntSupplier makeFun(int x){
        return () -> x + i++;
    }
}
