package exercises.java21;

import static exercises.Exercise.TODO;

public class VirtualThreads {

    /**
     * Run both tasks in parallel on virtual threads.
     * Return when both threads are finished.
     */
    public void runTasksInParallel(Runnable first, Runnable second) throws InterruptedException {
        var firstThread = Thread.ofVirtual().start(first);
        var secondThread = Thread.ofVirtual().start(second);

        firstThread.join();
        secondThread.join();
    }
}
