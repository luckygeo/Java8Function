package lambda.closure;

import java.util.function.IntSupplier;



/**
 *
 * ć±éšćé
 */
public class Closure2 {

    public IntSupplier makeFun(int x){
        int i = 0;
        return () -> x + i;
    }
}
