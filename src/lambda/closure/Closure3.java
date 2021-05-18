package lambda.closure;


import java.util.function.IntSupplier;


/**
 *
 * 局部变量
 */
public class Closure3 {

    public IntSupplier makeFun(int x){
        int i = 0;
        return () -> x + i++;//报错，lambda 表达式使用变量需是final
    }
}
