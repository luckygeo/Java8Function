package parallel.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SingleThreadExecutor {
    public static void main(String[] args) throws Exception{

        ExecutorService execute = Executors.newSingleThreadExecutor();
        IntStream.range(0, 10).mapToObj(NapTask::new).forEach(execute::execute);
        System.out.println("All tasks submitted");
        execute.shutdown();
        while(!execute.isTerminated()) {
            System.out.println(
                    Thread.currentThread().getName()+
                            " awaiting termination");
            new Nap(0.1);
        }

    }
}
