package lambda;

public class LambdaExpressions {
    static Body body = h -> h + " No Parens!";

    static Body bod2 = h -> h + " More Details";

    static Description description = () -> "Short info";

    static Mutil mutil = (x, y) -> x + y;

    static Description moreLines = () -> {
        System.out.println("moreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(body.detailed("Oh"));
        System.out.println(bod2.detailed("Hi"));
        System.out.println(description.brief());
        System.out.println(mutil.twoArg("Pi:", 3.141592645321));
        System.out.println(moreLines.brief());
    }
}
