package exercises.java21;

import static exercises.Exercise.TODO;

public class StringTemplateExpressions {
    /***
     * Convert the text block with formatter to a text block which uses the STR template formatter.
     */
    public String convertToStringTemplateExpressionSTR(String name, Long unsubscribeCode, double currentTemperature) {
        TODO("Use a String Template Expression");

        return """
            Welcome %s!

            Thank you for subscribing to our weather information service!
            The current temperature is %.1f degrees Celsius.

            If you want to unsubscribe, check <a href="https://fake-service.test/unsubscribe?user=%d">here</a>

            Kind regards,

            Useless Email Services Inc.""".formatted(name, currentTemperature, unsubscribeCode);
    }

    /***
     * Convert the text block with formatter to a text block which uses the FMT template formatter.
     */
    public String convertToStringTemplateExpressionFMT(String name, Long unsubscribeCode, double currentTemperature) {
        TODO("Use a String Template Expression");

        return """
            Welcome %s!

            Thank you for subscribing to our weather information service!
            The current temperature is %.1f degrees Celsius.

            If you want to unsubscribe, check <a href="https://fake-service.test/unsubscribe?user=%d">here</a>

            Kind regards,

            Useless Email Services Inc.""".formatted(name, currentTemperature, unsubscribeCode);
    }
}

