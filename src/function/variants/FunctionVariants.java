package function.variants;

import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class FunctionVariants {
    static Function<Foo, Bar> fooBarFunctional = Bar::new;
    static IntFunction<IBaz> intFunction = IBaz::new;
    static DoubleFunction<DBaz> doubleFunction = d -> new DBaz(d);
    static LongFunction<LBaz> longFunction = LBaz::new;
    static ToIntFunction<IBaz> toIntFunction = iBaz -> iBaz.getI();
    static ToLongFunction<LBaz> toLongFunction = l -> l.getaLong();
    static ToDoubleFunction<DBaz> toDoubleFunction = d -> d.getD();
    static IntToLongFunction intToLongFunction = i -> i;
    static LongToDoubleFunction longToDoubleFunction = d -> d;
    static LongToIntFunction longToIntFunction = l -> (int) l;


    public static void main(String[] args) {
        Bar bar = fooBarFunctional.apply(new Foo());
        IBaz iBaz = intFunction.apply(1);
        DBaz dBaz = doubleFunction.apply(10);
        LBaz lBaz = longFunction.apply(1L);
        int i = toIntFunction.applyAsInt(new IBaz(1));
        toLongFunction.applyAsLong(lBaz);
        toDoubleFunction.applyAsDouble(dBaz);
        intToLongFunction.applyAsLong(iBaz.getI());

    }
}
