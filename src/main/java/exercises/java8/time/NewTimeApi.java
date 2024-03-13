package exercises.java8.time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static exercises.Exercise.TODO;

public class NewTimeApi {

     /**
      * Return the day after 2024-2-28
      */
    public LocalDate nextDay() {
        return LocalDate.of(2024, 2, 28).plusDays(1);
    }

    /**
     * Which day of the week is 2024-2-29?
     */
    public DayOfWeek dayOfWeek() {
        return LocalDate.of(2024, 2, 29).getDayOfWeek();
    }

    /**
     * The Unix timestamp measures the number of (mili) seconds since Jan. 1st, 1970. 0:00:0 UTC.
     * Which day of the week was that?
     */
    public DayOfWeek epochDayOfWeek() {
        Instant epoch = Instant.ofEpochSecond(0);

        return ZonedDateTime.ofInstant(epoch, ZoneOffset.UTC)
                .getDayOfWeek();
    }

    /**
     * How many days are there between Christmas in 2023 and Easter in 2024?
     */
    public long daysBetweenChristmasAndEaster() {
        LocalDateTime christmas = LocalDate.of(2023, 12, 24)
                .atStartOfDay();

        LocalDateTime easter = LocalDate.of(2024, 3, 31)
                .atStartOfDay();

        return Duration.between(christmas, easter).toDays();
    }
}
