package function;

public class FunctionAnnotation {
    public String goodbye(String arg) {
        return "Goodbye, " + arg;
    }

    public static void main(String[] args) {
        FunctionAnnotation fa = new FunctionAnnotation();
        System.out.println(fa.goodbye("Mr"));
        Functional functional = fa::goodbye;
        functional = a -> "good";
        System.out.println(functional.goodbye("Mr"));
        FunctionalNoAnn functionalNoAnn = fa::goodbye;

    }
}
