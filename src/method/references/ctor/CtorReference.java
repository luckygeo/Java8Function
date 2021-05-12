package method.references.ctor;

/*
 * Dog 有三个构造函数，函数式接口内的 make() 方法反映了构造函数参数列表（ make() 方法名称可以不同）。
 *
 *注意我们如何对 [1]**，[2]** 和 [3] 中的每一个使用 Dog :: new。 这三个构造函数只有一个相同名称：:: new，但在每种情况下赋值给不同的接口，编译器可以从中知道具体使用哪个构造函数。
 *
 *编译器知道调用函数式方法（本例中为 make()）就相当于调用构造函数
 * */
public class CtorReference {
    public static void main(String[] args) {
        MakeNoArgs makeNoArgs = Dog::new;
        System.out.println(makeNoArgs.make());
        Make1Arg make1Arg = Dog::new;
        System.out.println(make1Arg.make("tom"));
        Make2Args make2Arg = Dog::new;
        System.out.println(make2Arg.make("tom", 1));
    }
}
