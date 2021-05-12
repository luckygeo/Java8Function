package method.references.unbound;

public class UnboundMethodReference {
    public static void main(String[] args) {
        //MakeString makeString = X::f; 此处报错
        TransformX tx = X::f;
        X x = new X();
        System.out.println(tx.transform(x,"google"));
        System.out.println(x.f("google"));
    }
}
