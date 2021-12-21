         A thread pool should be created by ThreadPoolExecutor rather than Executors. 
        These would make the parameters of the thread pool understandable. 
        It would also reduce the risk of running out of system resource. Note: Below are the problems created by usage of Executors
         for thread pool creation:
        1) FixedThreadPool and SingleThreadPool:
         Maximum request queue size Integer.MAX_VALUE. A large number of requests might cause OOM.
        2) CachedThreadPool:
         The number of threads which are allowed to be created is Integer.MAX_VALUE. Creating too many threads might lead to OOM.

        Positive example 1：
        //org.apache.commons.lang3.concurrent.BasicThreadFactory
        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,
        new BasicThreadFactory.Builder().namingPattern("example-schedule-pool-%d").daemon(true).build());



        Positive example 2：
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
        .setNameFormat("demo-pool-%d").build();

        //Common Thread Pool
        ExecutorService pool = new ThreadPoolExecutor(5, 200,
        0L, TimeUnit.MILLISECONDS,
        new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

        pool.execute(()-> System.out.println(Thread.currentThread().getName()));
        pool.shutdown();//gracefully shutdown



        Positive example 3：
<bean id="userThreadPool"
class="org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor">
<property name="corePoolSize" value="10" />
<property name="maxPoolSize" value="100" />
<property name="queueCapacity" value="2000" />