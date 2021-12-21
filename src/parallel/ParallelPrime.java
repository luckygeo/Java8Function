package parallel;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.LongStream.iterate;
import static java.util.stream.LongStream.rangeClosed;

public class ParallelPrime {
    static final int COUNT = 100_0000;
    public static boolean isPrime(long n){
        return rangeClosed(2, (long)Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }
    public static void main(String[] args)
            throws Exception {
        Timer timer = new Timer();
        List<String> primes =
                iterate(2, i -> i + 1)
                                     // [1]
                        .filter(ParallelPrime::isPrime)
                        .limit(COUNT)
                        .mapToObj(Long::toString)
                        .collect(Collectors.toList());
        System.out.println( timer.duration());
        //Files.write(Paths.get("primes.txt"), primes, StandardOpenOption.CREATE);
    }

}
