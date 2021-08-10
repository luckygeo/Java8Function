package lambda.closure;

import java.util.function.Function;

/**
 * @author: i
 * 1.闭包是自带运行环境的函数
 * 2.可以访问其他函数内变量的函数，叫做闭包
 *
 * @createDate: 2021/8/10
 * @version: 1.0
 */
public class ClosureWeek {
    public static Function<Integer, String> numToText() {
        String[] weeks = new String[]{"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        //FIXME 控制数组越界
        return a -> weeks[a];
    }

    public static void main(String[] args) {
        String text = numToText().apply(20);
        System.out.println();

    }
}
