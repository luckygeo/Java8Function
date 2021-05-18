package lambda.closure;

import java.util.function.IntSupplier;

/**
 * 作为闭包的内部类
 *
 * 我们可以使用匿名内部类重写之前的例子:
 *
 * @author i
 */
public class AnonymousClosure {


    IntSupplier makeFun(int x){
        int i = 0;
        return new IntSupplier() {
            @Override
            public int getAsInt() {
                return i + x;
            }
        };
    }
}
