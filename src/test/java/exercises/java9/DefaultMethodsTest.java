package exercises.java9;

import exercises.java9.DefaultMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultMethodsTest {
    private static final String NAME = "Hogeschool Rotterdam";
    private final DefaultMethods subject = new DefaultMethods();

    @Test
    void addDefaultMethodToA() {
        String answer = subject.addDefaultMethodToA(NAME);
        assertEquals("Hello, " + NAME, answer);
    }

    @Test
    void addDefaultMethodToB() {
        String answer = subject.addDefaultMethodToB(NAME);
        assertEquals("Good day, " + NAME, answer);
    }

    @Test
    void multipleInheritance() {
        String answer = subject.multipleInheritance(NAME);
        assertEquals("Good day, " + NAME, answer);
    }
}
