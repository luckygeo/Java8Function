package method.conversion;

import java.lang.reflect.Method;
import java.util.function.BiConsumer;

public class MethodConversion {

    static void accept(In1 in1, In2 in2) {
        System.out.println("accept()");
    }

    static void someOtherName(In1 in1, In2 in2){
        System.out.println("someOtherName()");
    }

    public static void main(String[] args) {
        BiConsumer<In1, In2> bic;
        bic = MethodConversion::accept;
        bic.accept(new In1(), new In2());

        bic = MethodConversion::someOtherName;
        bic.accept(new In1(), new In2());
    }
}
