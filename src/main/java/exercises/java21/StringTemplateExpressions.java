package exercises.java21;

import static exercises.Exercise.TODO;
import static java.util.FormatProcessor.FMT;

public class StringTemplateExpressions {
    /***
     * Convert the text block with formatter to a text block which uses the STR template formatter.
     */
    public String convertToStringTemplateExpressionSTR(String name, Long unsubscribeCode, double currentTemperature) {
        return STR."""
            Welcome \{ name }!
            
            Thank you for subscribing to our weather information service!
            The current temperature is \{ String.format("%.1f", currentTemperature) } degrees Celsius.
            
            If you want to unsubscribe, check <a href="https://fake-service.test/unsubscribe?user=\{unsubscribeCode}">here</a>
            
            Kind regards,
            
            Useless Email Services Inc.""";
    }

    /***
     * Convert the text block with formatter to a text block which uses the FMT template formatter.
     */
    public String convertToStringTemplateExpressionFMT(String name, Long unsubscribeCode, double currentTemperature) {
        return FMT."""
            Welcome \{name}!

            Thank you for subscribing to our weather information service!
            The current temperature is %.1f\{currentTemperature} degrees Celsius.

            If you want to unsubscribe, check <a href="https://fake-service.test/unsubscribe?user=%d\{unsubscribeCode}">here</a>

            Kind regards,

            Useless Email Services Inc.""";
    }
}

