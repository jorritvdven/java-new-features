package exercises.java21;

import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import static exercises.Exercise.TODO;

public class StructuredConcurrency {
    /**
     * Run tasks `first` and `second` in parallel by executing them in parallel using (virtual) threads only.
     * Next, combine the results of both suppliers using the `combiner` and return the result.
     *
     * Note: the combiner doesn't have to run on a different thread.
     */
    public String parallelTasksPlainThreads(Supplier<String> first, Supplier<String> second, BiFunction<String, String, String> combiner) throws InterruptedException {
        return TODO("Implement me!");
    }

    /**
     * Run tasks `first` and `second` in parallel by executing them in parallel using CompletableFuture.
     * Next, combine the results of both suppliers using the `combiner` and return the result.
     *
     * Note: the combiner doesn't have to run on a different thread.
     */
    public String parallelTasksCompletableFuture(Supplier<String> first, Supplier<String> second, BiFunction<String, String, String> combiner) throws ExecutionException, InterruptedException {
        return TODO("Implement me!");
    }

    /**
     * Run tasks `first` and `second` in parallel by executing them in parallel using Structured Concurrency.
     * Next, combine the results of both suppliers using the `combiner` and return the result.
     *
     * Note: the combiner doesn't have to run on a different thread.
     */
    public String parallelTasksStructuredConcurrency(Supplier<String> first, Supplier<String> second, BiFunction<String, String, String> combiner) {
        return TODO("Implement me!");
    }
}
