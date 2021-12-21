/**
 * @author: i
 * @createDate: 2021/9/24
 * @version: 1.0
 */
public class CallBack {
    interface Get{
        int  returnNumber(int j);
    }

    public static int s(int x, int y, Get get) {
        return get.returnNumber(x + y);
    }

    public static void main(String[] args) {
        System.out.println(s(1, 2, a -> a));
    }
}
