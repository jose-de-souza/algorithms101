package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    private FibonacciNaive naive;
    private FibonacciMemoized memo;

    @BeforeEach
    public void SetUp() {
        naive = new FibonacciNaive();
        memo = new FibonacciMemoized();
    }

    @Test
    public void Naive() {
        Assertions.assertEquals(0, naive.fib(0));
        Assertions.assertEquals(1, naive.fib(1));
        Assertions.assertEquals(1, naive.fib(2));
        Assertions.assertEquals(2, naive.fib(3));
        Assertions.assertEquals(3, naive.fib(4));
        Assertions.assertEquals(5, naive.fib(5));
        Assertions.assertEquals(8, naive.fib(6));
        Assertions.assertEquals(13, naive.fib(7));
        Assertions.assertEquals(21, naive.fib(8));
    }

    @Test
    public void Memoized() {
        Assertions.assertEquals(0, memo.fib(0));
        Assertions.assertEquals(1, memo.fib(1));
        Assertions.assertEquals(1, memo.fib(2));
        Assertions.assertEquals(2, memo.fib(3));
        Assertions.assertEquals(3, memo.fib(4));
        Assertions.assertEquals(5, memo.fib(5));
        Assertions.assertEquals(8, memo.fib(6));
        Assertions.assertEquals(13, memo.fib(7));
        Assertions.assertEquals(21, memo.fib(8));
    }

    @Test
    public void RecordTimeNaive() {
        long startTime = System.currentTimeMillis();
        naive.fib(30);
        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime) / 1000;
        System.out.println("elapsedTime = " + elapsedTime); // 19s
    }

    @Test
    public void RecordTimeMemoized() {
        long startTime = System.currentTimeMillis();
        memo.fib(1000);
        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime) / 1000;
        System.out.println("elapsedTime = " + elapsedTime); // 20s
    }

}
