package exercises.java21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTemplateExpressionsTest {

    private final StringTemplateExpressions subject = new StringTemplateExpressions();

    private static final String name = "Fake User";
    private static final Long unsubscribeCode = 98765L;
    private static final Double temperature = 14.834643342;

    private static final String expected = """
            Welcome Fake User!
            
            Thank you for subscribing to our weather information service!
            The current temperature is 14,8 degrees Celsius.
            
            If you want to unsubscribe, check <a href="https://fake-service.test/unsubscribe?user=98765">here</a>
            
            Kind regards,
            
            Useless Email Services Inc.""";

    @Test
    void convertToStringTemplateExpressionSTR() {
        assertEquals(expected, subject.convertToStringTemplateExpressionSTR(name, unsubscribeCode, temperature));
    }

    @Test
    void convertToStringTemplateExpressionFMT() {
        assertEquals(expected, subject.convertToStringTemplateExpressionSTR(name, unsubscribeCode, temperature));
    }
}
