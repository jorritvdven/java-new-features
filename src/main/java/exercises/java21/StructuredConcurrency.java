package exercises.java21;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class StructuredConcurrency {
    /**
     * Run tasks `first` and `second` in parallel by executing them in parallel using (virtual) threads only.
     * Next, combine the results of both suppliers using the `combiner` and return the result.
     *
     * Note: the combiner doesn't have to run on a different thread.
     */
    public String parallelTasksPlainThreads(Supplier<String> first, Supplier<String> second, BiFunction<String, String, String> combiner) throws InterruptedException {
        final AtomicReference<String> resultFirst = new AtomicReference<>(null);
        final AtomicReference<String> resultSecond = new AtomicReference<>(null);

        final var thread1 = Thread.ofVirtual().start( () -> resultFirst.set(first.get()) );
        final var thread2 = Thread.ofVirtual().start( () -> resultSecond.set(second.get()) );

        thread1.join();
        thread2.join();

        return combiner.apply(resultFirst.get(), resultSecond.get());
    }

    /**
     * Run tasks `first` and `second` in parallel by executing them in parallel using CompletableFuture.
     * Next, combine the results of both suppliers using the `combiner` and return the result.
     *
     * Note: the combiner doesn't have to run on a different thread.
     */
    public String parallelTasksCompletableFuture(Supplier<String> first, Supplier<String> second, BiFunction<String, String, String> combiner) throws ExecutionException, InterruptedException {
        CompletableFuture<String> asyncFirst = CompletableFuture.supplyAsync(first);
        CompletableFuture<String> asyncSecond = CompletableFuture.supplyAsync(second);

        return combiner.apply(asyncFirst.get(), asyncSecond.get());
    }

    /**
     * Run tasks `first` and `second` in parallel by executing them in parallel using Structured Concurrency.
     * Next, combine the results of both suppliers using the `combiner` and return the result.
     *
     * Note: the combiner doesn't have to run on a different thread.
     */
    public String parallelTasksStructuredConcurrency(Supplier<String> first, Supplier<String> second, BiFunction<String, String, String> combiner) {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            var asyncFirst = scope.fork(first::get);
            var asyncSecond = scope.fork(second::get);
            scope.join().throwIfFailed();

            return combiner.apply(asyncFirst.get(), asyncSecond.get());
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
