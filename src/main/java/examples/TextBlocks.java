package examples;

public class TextBlocks {
    private final String text = "Dear customer,\n" +
            "\n" +
            "Thank you for subscribing to our newsletter!\n" +
            "If you want to unsubscribe, <a href=\"https://jdriven.com/unsubscribe\">click here</a>\n" +
            "\n" +
            "Kind regards,\n" +
            "\n" +
            "JDriven.\n";

    private final String textBlock = """
            Dear customer,

            Thank you for subscribing to our newsletter!
            If you want to unsubscribe, <a href="https://jdriven.com/unsubscribe">click here</a>

            Kind regards,

            JDriven.
            """;
}
