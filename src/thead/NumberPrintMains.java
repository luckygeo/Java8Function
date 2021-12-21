package thead;

import java.util.Set;

/**
 * @author: i
 * @createDate: 2021/8/18
 * @version: 1.0
 */
public class NumberPrintMains {
    public static void main(String[] args) throws Exception{
        Thread.sleep(9000);
        final byte a[] = {0};//以该对象为共享资源
        new Thread(new NumberPrint((11), a), "@1").start();
        new Thread(new NumberPrint((12), a), "@2").start();
        Set<Thread> threads = Thread.getAllStackTraces().keySet();
//        for (Thread thread : threads) {
//            System.out.println(thread.getName());
//            thread.stop();
//        }
        System.out.println("");
    }
}
