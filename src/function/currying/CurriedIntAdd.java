package function.currying;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class CurriedIntAdd {
    public static void main(String[] args) {
        IntFunction<IntFunction<IntUnaryOperator>> func = value -> operand -> operand1 -> value + operand + operand1;
       // int j = func.apply(4).applyAsInt(5);
        int j = 10;
        Integer apply = func.apply(10).apply(100).applyAsInt(100);
        System.out.println(apply);
    }
}
