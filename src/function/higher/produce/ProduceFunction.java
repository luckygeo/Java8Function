package function.higher.produce;

/**
 * 高阶函数（Higher-order Function）只是一个消费或产生函数的函数。
 */
public class ProduceFunction {
    static public FuncSS produce() {
        return a -> a.toLowerCase();
    }

    public static void main(String[] args) {
        FuncSS funcSS = produce();
        System.out.println(funcSS.apply("HELLO WORLD!"));
    }
}
