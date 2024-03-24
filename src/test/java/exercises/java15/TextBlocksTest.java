package exercises.java15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextBlocksTest {
    private final TextBlocks subject = new TextBlocks();

    @Test
    void convertToTextBlock() {
        final var expected = """
            {
                "@type": "com.jdriven.fanshop.Order",
                "name": "Henk Ackerman",
                "amount": 123,46
            }""";

        assertEquals(expected, subject.convertToTextBlock("Henk Ackerman", 123.4567));
    }
}
