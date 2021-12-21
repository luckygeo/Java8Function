package parallel.concurrent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class CachedThreadPool3 {
    public static Integer extractResult(Future<Integer> future) {
        try {
            return future.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception {
        CountingTask task = new CountingTask(1);
        CountingTask task2 = new CountingTask(2);
        Map map = new HashMap<>();

        System.out.println(Objects.hash(task));
        System.out.println(Objects.hash(null));
        System.out.println(task.hashCode());
        System.out.println(460141958 & 19);
        LongStream.rangeClosed(1, 16).forEach(a -> map.put(a, task2));

//        ThreadPoolExecutor executor = new ThreadPoolExecutor(0, 10,
//                60L, TimeUnit.SECONDS,
//                new LinkedBlockingQueue<Runnable>());
//        List<CountingTask> tasks =
//                IntStream.range(0, 10)
//                        .mapToObj(CountingTask::new)
//                        .collect(Collectors.toList());
//        //List<Future<Integer>> futures = tasks.stream().map(executor::submit).collect(Collectors.toList());  单个
//        List<Future<Integer>> futures = executor.invokeAll(tasks);//批量
//        Integer val = futures.stream().map(CachedThreadPool3::extractResult).reduce(0, Integer::sum);
//        System.out.println("sum = " + val);
//        executor.shutdown();
        System.out.println("");

    }
}
