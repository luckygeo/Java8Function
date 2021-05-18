package lambda.closure;

import java.util.function.IntSupplier;


/**
 *
 * 如果 x 和 i 的值在方法中的其他位置发生改变（但不在返回的函数内部），则编译器仍将视其为错误。每个递增操作则会分别产生错误消息。代码示例：
 *
 * // functional/Closure5.java
 *  *
 *  * // {无法编译成功}
 *  * import java.util.function.*;
 *  *
 *  * public class Closure5 {
 *  *   IntSupplier makeFun(int x) {
 *  *     int i = 0;
 *  *     i++;
 *  *     x++;
 *  *     return () -> x + i;
 *  *   }
 *  * }
 *
 * 等同 final 效果意味着可以在变量声明前加上 final 关键字而不用更改任何其余代码。 实际上它就是具备 final 效果的，只是没有明确说明
 */
public class Closure {

    public IntSupplier makeFun(int x){
        int i = 0;
        x++;
        i++;

        return () -> x + i++;//报错，lambda 表达式使用变量需是final
    }

    public IntSupplier makeFun2(int x){
        int i = 0;
        int j = x++;
        int v =i++;

        return () -> j + v;//不报错，
    }

    /*
    * 包装类
    * */
    public IntSupplier makeFun3(int x){
        Integer i = 0;
        i = i + x;
        return () -> i + x;//报错 编译器非常聪明地识别到变量 i 的值被更改过。 包装类型可能是被特殊处理了，我们再尝试下 List
    }

    /*
     * 包装类
     * */
    public IntSupplier makeFun4(int x){
        Integer i = 0;
        i = i + x;
        return () -> i + x;//报错 编译器非常聪明地识别到变量 i 的值被更改过。 包装类型可能是被特殊处理了，我们再尝试下 List
    }
}
