package exercises.java8;

import exercises.java8.time.NewTimeApi;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class NewTimeApiTest {
    private static final LocalDate CHRISTMAS = LocalDate.of(2023, 12, 24);

    private static final LocalDate EASTER = LocalDate.of(2024, 3, 31);

    private final NewTimeApi subject = new NewTimeApi();

    @Test
    void nextDay() {
        assertEquals(LocalDate.of(2024, 2, 29), subject.nextDay());
    }

    @Test
    void dayOfWeek() {
        assertEquals(DayOfWeek.THURSDAY, subject.dayOfWeek());
    }

    @Test
    void epochDayOfWeek() {
        assertEquals(DayOfWeek.THURSDAY, subject.epochDayOfWeek());
    }

    @Test
    void daysBetweenChristmasAndEaster() {
        assertEquals(98, subject.daysBetweenChristmasAndEaster());
    }
}
