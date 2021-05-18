package function.currying;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class CurriedIntAdd {
    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> func = value -> operand -> value + operand;
        int j = func.apply(4).applyAsInt(5);
        System.out.println(j);
    }
}
