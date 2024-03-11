package java8;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeApi {

    /**
     * Get the day after 2024-2-28
     */
    @Test
    public void daysInFebruary() {
        LocalDate day = LocalDate.of(2024, 2, 28)
                .plusDays(1);

        assertEquals(LocalDate.of(2024, 2, 29), day);
    }

    /**
     * Which day of the week is 2024-2-29?
     */
    @Test
    public void dayOfWeek() {
        DayOfWeek result = LocalDate.of(2024, 2, 29)
                .getDayOfWeek();

        assertEquals(DayOfWeek.THURSDAY, result);
    }

    /**
     * The Unix timestamp measures the number of (mili) seconds since Jan. 1st, 1970. 0:00:0 UTC.
     * Which day of the week was that?
     */
    @Test
    public void epochDayOfWeek() {
        Instant epoch = Instant.ofEpochSecond(0);
        DayOfWeek dayOfWeek = findDayOfWeek(epoch);

        assertEquals(DayOfWeek.THURSDAY, dayOfWeek);
    }

    private DayOfWeek findDayOfWeek(Instant instant) {
        return ZonedDateTime.ofInstant(instant, ZoneOffset.UTC)
                .getDayOfWeek();
    }

    /**
     * How many days are there between Christmas in 2023 and Easter in 2024?
     */
    @Test
    public void daysBetweenChristmasAndEaster() {
        LocalDateTime christmas = LocalDate.of(2023, 12, 24)
                .atStartOfDay();

        LocalDateTime easter = LocalDate.of(2024, 3, 31)
                .atStartOfDay();

        Long days = Duration.between(christmas, easter).toDays();

        assertEquals(98, days);
    }
}

