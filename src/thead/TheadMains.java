package thead;

import java.util.concurrent.CountDownLatch;

/**
 * @author: i
 * @createDate: 2021/8/18
 * @version: 1.0
 */
public class TheadMains {
    public static void main(String[] args) {
        final CountDownLatch count = new CountDownLatch(2);
        Runnable thread1 = () -> {
            try {
                Thread.sleep(2000);
                Thread.currentThread().notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println("1@" + i);
            }

            count.countDown();
        };
        Runnable thread2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("2@" + i);
            }
            count.countDown();
        };
        Thread threads1 = new Thread(thread1);
        Thread threads2 = new Thread(thread2);
        threads2.start();
        threads1.start();
//        try {
//            synchronized (thread1){
//                threads1.wait();
//            }
//
//            //count.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("final");
//        try {
//            threads2.join();
//            //threads1.join();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
