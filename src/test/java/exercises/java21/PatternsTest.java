package exercises.java21;

import examples.Records;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PatternsTest {
    private final Patterns subject = new Patterns();

    @Test
    void recordPatternMatching() {
        final var student = new Records.StudentAsRecord("S.O.M.E. Student", 123456L, "Computer science");
        String result = subject.recordPatternMatching(student);

        assertEquals(result, "student S.O.M.E. Student has number 123456");
    }

    @ParameterizedTest(name = "{1}")
    @MethodSource("switchPatternMatchingProvider")
    void switchPatternMatching(Object given, String expected) {
        assertEquals(expected, subject.switchPatternMatching(given));
    }

    private static Stream<Arguments> switchPatternMatchingProvider() {
        return Stream.of(
                Arguments.of("test", "String test"),
                Arguments.of(123, "Integer 123"),
                Arguments.of(123L, "Long 123"),
                Arguments.of(123.456, "Double 123,456")
        );
    }
}

