package recursive;

public class RecursiveFactorial {
    static IntCall intCall;
    static int call(int i) {
        if (i > 1) {
            return i * call(i - 1);
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(call(6));
        intCall = a -> {
            if (a > 1) {
                return a * intCall.call(a - 1);
            }
            return 1;
        };
        System.out.println(intCall.call(6));

    }
}
