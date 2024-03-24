package exercises.java22;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.FormatProcessor.FMT;
import static org.junit.jupiter.api.Assertions.*;

class StreamGatherersTest {
    private final StreamGatherers subject = new StreamGatherers();

    @Test
    void calculateMovingAverage() {
        final var input = List.of(70, 92, 56, 81, 78, 41, 95, 55, 62, 5, 9, 8, 6, 58, 38, 35, 53, 45, 5, 56);
        final var expected = List.of(72.667, 76.333, 71.667, 66.667, 71.333, 63.667, 70.667, 40.667, 25.333, 7.333, 7.667, 24.000, 34.000, 43.667, 42.000, 44.333, 34.333, 35.333);

        final var result = subject.calculateMovingAverage(input);

        for (int i=0; i < result.size(); i++) {
            final int index = i;
            assertEquals(expected.get(i), result.get(i), 0.01, () -> STR."Invalid value on index \{index}");
        }
    }
}
