package exercises.java22;

import java.util.List;
import java.util.stream.Gatherers;

import static exercises.Exercise.TODO;

public class StreamGatherers {

    /**
     * Calculate a moving average of the given numbers using a Stream gatherer.
     * Use a window size of 3.
     */
    public List<Double> calculateMovingAverage(List<Integer> numbers) {
        return numbers.stream()
                .gather(Gatherers.windowSliding(3))
                .map(list -> list.stream().mapToInt(Integer::intValue).average().orElse(0.0) )
                .toList();
    }

}
