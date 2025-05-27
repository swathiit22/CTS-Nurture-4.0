import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<String> task = () -> "Result from thread";

        Future<String> future = executor.submit(task);
        System.out.println("Output: " + future.get());

        executor.shutdown();
    }
}
