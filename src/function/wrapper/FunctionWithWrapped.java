package function.wrapper;

import java.util.function.IntToDoubleFunction;

public class FunctionWithWrapped {
    public static void main(String[] args) {
        //如果没有强制转换会报错
        //Function<Integer, Double> function = d -> (double) d;
        //function.apply(10);
        IntToDoubleFunction intToDoubleFunction = d -> d;
        intToDoubleFunction.applyAsDouble(10);
    }
}
