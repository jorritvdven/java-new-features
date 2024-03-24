package exercises.java21;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class StructuredConcurrencyTest {

    private final StructuredConcurrency subject = new StructuredConcurrency();

    @Test
    void parallelTasksPlainThreads() {
        verify(subject::parallelTasksPlainThreads);
    }

    @Test
    void parallelTasksCompletableFuture() {
        verify(subject::parallelTasksCompletableFuture);
    }

    @Test
    void parallelTasksSturcturedConcurrency() {
        verify(subject::parallelTasksStructuredConcurrency);
    }

    private void verify(Function3<Supplier<String>, Supplier<String>, BiFunction<String, String, String>, String> method) {
        final var ranFirst = new AtomicBoolean(false);
        final var ranSecond = new AtomicBoolean(false);

        final Supplier<String> firstSupplier = () -> task(1, ranFirst, "First");
        final Supplier<String> secondSupplier = () -> task(2, ranSecond, "Second");
        final BiFunction<String, String, String> combiner = (a,b) -> a+b;

        assertDoesNotThrow(() -> {
            final var before = Instant.now();
            final var result = method.apply(firstSupplier, secondSupplier, combiner);
            final var after = Instant.now();
            final var duration = Duration.between(before, after);

            assertTrue(duration.compareTo(Duration.ofSeconds(5)) < 0, "Execution took too long!");
            assertTrue(ranFirst.get(), "First task did not run!");
            assertTrue(ranSecond.get(), "First task did not run!");
            assertEquals("FirstSecond", result);
        });
    }

    private String task(int task, AtomicBoolean runIndicator, String message) {
        try {
            System.out.println(STR."task \{task} running...");

            Thread.sleep(Duration.ofSeconds(3));
            runIndicator.set(true);
            System.out.println(STR."task \{task} finished!");

            return message;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @FunctionalInterface
    private interface Function3<T1,T2,T3,R> {
        R apply(T1 t1, T2 t2, T3 t3) throws Exception;
    }
}
