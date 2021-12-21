package parallel.concurrent;

import java.util.concurrent.Callable;

/**
 * 因为 InterferingTask 是一个 Runnable ，它没有返回值，因此只能使用副作用产生结果 - 操纵缓冲值而不是返回结果
 * 。副作用是并发编程中的主要问题之一，因为我们看到了 CachedThreadPool2.java 。InterferingTask 中的 val 被称为可变共享状态，
 *  这就是问题所在：多个任务同时修改同一个变量会产生竞争。结果取决于首先在终点线上执行哪个任务，并修改变量（以及其他可能性的各种变化）。
 *
 * 避免竞争条件的最好方法是避免可变的共享状态。我们可以称之为自私的孩子原则：什么都不分享。
 *
 * @author i
 */
public class CountingTask implements Callable<Integer> {

    final int id;

    public CountingTask(int id) {
        this.id = id;
    }

    @Override
    public Integer call() throws Exception {
        Integer val = 0;
        for(int i = 0; i < 100; i++) {
            val++;
        }
        System.out.println(id + " " +
                Thread.currentThread().getName() + " " + val);
        return val;
    }
}
