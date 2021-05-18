package lambda.closure;

import java.util.function.IntSupplier;



/**
 *
 * 局部变量
 */
public class Closure2 {

    public IntSupplier makeFun(int x){
        int i = 0;
        return () -> x + i;
    }
}
