package exercises.java21;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.*;

class VirtualThreadsTest {
    private final VirtualThreads subject = new VirtualThreads();

    @Test
    void runTasksInParallel() {
        final var ranFirst = new AtomicBoolean(false);
        final var ranSecond = new AtomicBoolean(false);

        final Runnable firstRunnable = () -> waitAndPrint(1, ranFirst);
        final Runnable secondRunnable = () -> waitAndPrint(2, ranSecond);

        assertDoesNotThrow(() -> {
            final var before = Instant.now();
            subject.runTasksInParallel(firstRunnable, secondRunnable);
            final var after = Instant.now();
            final var duration = Duration.between(before, after);

            assertTrue(duration.compareTo(Duration.ofSeconds(5)) < 0, "Execution took too long!");
            assertTrue(ranFirst.get(), "First task did not run!");
            assertTrue(ranSecond.get(), "First task did not run!");
        });
    }

    private void waitAndPrint(int task, AtomicBoolean runIndicator) {
        try {
            assertTrue(Thread.currentThread().isVirtual(), "Thread is not a virtual thread!");
            System.out.println(STR."task \{task} running...");

            Thread.sleep(Duration.ofSeconds(3));
            runIndicator.set(true);
            System.out.println(STR."task \{task} finished!");
        } catch (InterruptedException e) {
            fail("Execution interrupted!");
        }
    }
}
