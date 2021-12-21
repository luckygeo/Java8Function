package parallel.concurrent;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;



/**
 * 排队有三种通用策略：
 *
 * 1.直接提交。工作队列的默认选项是synchronousQueue，它将任务直接提交给线程而不保持它们。在此，如果不存在可用于立即运行任务的线程，
 * 则试图把任务加入队列将失败，因此会构造一个新的线程。此策略可以避免在处理可能具有内部依赖性的请求集时出现锁。
 * 直接提交通常要求无界maximumPoolSizes以避免拒绝新提交的任务。当命令以超过队列所能处理的平均数连续到达时，
 * 此策略允许无界线程具有增加的可能性。( Exception Task parallel.concurrent.InterferingTask@6d03e736 rejected)
 *
 * 2.无界队列。使用无界队列（例如，不具有预定义容量的LinkedBlockingQueue）将导致在所有corePoolSize线程都忙时新任务在队列中等待。
 * 这样，创建的线程就不会超过corePoolSize（因此，maximumPoolSize的值也就无效了）。
 *
 * 3.有界队列。当使用有限的maximumPoolSizes时，有界队列（如ArrayBlockingQueue）有助于防止资源耗尽，但是可能较难调整和控制。
 * 队列大小和最大池大小可能需要相互折衷：使用大型队列和小型池可以最大限度的降低CPU使用率、操作系统资源和上下文切换开销，
 * 但是可能导致人工降低吞吐量。如果任务频繁阻塞，则系统可能为超过您许可的更多线程安排时间，使用小型队列通常要求较大的池大小，CPU使用率较高，
 * 但是可能遇到不可接受的调度开销，这样可会降低吞吐量。
 * 原文链接：https://blog.csdn.net/wzy_1988/article/details/38922449
 *
 * @author i
 */
public class CachedThreadPool2 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(0, 10,
                60L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>());
        ThreadPoolExecutor executor2 = new ThreadPoolExecutor(0, 10,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<>());
        IntStream.rangeClosed(1, 10).mapToObj(InterferingTask::new).forEach(executor2::execute);
        executor.shutdown();
        executor2.shutdown();

    }

    //方法一：
    static final int hash(Object key) {   //jdk1.8 & jdk1.7
        int h;
        // h = key.hashCode() 为第一步 取hashCode值
        // h ^ (h >>> 16)  为第二步 高位参与运算
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
    //方法二：
    static int indexFor(int h, int length) {  //jdk1.7的源码，jdk1.8没有这个方法，但是实现原理一样的
        return h & (length-1);  //第三步 取模运算
    }

}
