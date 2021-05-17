package lambda.serialized;

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;

public class LambdaSerialized {
    static void set(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) throws Exception{
        SerializedFunction<String> sf = LambdaSerialized::set;
        sf.accept("h");
        System.out.print("");
//        SerializedLambda lambda = Lambdas.getSerializedLambda(sf);
//        Lambdas.LambdaInfo reflect = Lambdas.reflect(sf);
//
//        Lambdas.getImplementationMethod(lambda);
//        Method method1 = Lambdas.getFunctionalMethod(lambda);
//        System.out.println();
//        Class cl = sf.getClass();
//        Method[] m = cl.getDeclaredMethods();
//        for (Method method : m) {
//            sf.accept(method.getName());
//        }
        Method method = sf.getClass().getDeclaredMethod("writeReplace");
        method.setAccessible(true);
        SerializedLambda lambdas = (SerializedLambda) method.invoke(sf);

//        System.out.println(lambdas.getImplMethodName());
    }

}
