package exercises.java14;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SwitchExpressionsTest {
    private Map<String, String> sounds = Map.of(
            "dog", "woof",
            "cat", "meow",
            "lion", "roar",
            "fish", "blub",
            "bee", "bzzz",
            "bear", "unknown"
    );
    private SwitchExpressions subject = new SwitchExpressions();

    @Test
    void switchStatement() {
        sounds.forEach( (key, value) -> {
                    String actual = subject.switchStatement(key);
                    assertEquals(value, actual);
                }
        );
    }

    @Test
    void switchExpression() {
        sounds.forEach( (key, value) -> {
                    String actual = subject.switchExpression(key);
                    assertEquals(value, actual);
                }
        );
    }
}
