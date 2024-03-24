package exercises.java15;

import static exercises.Exercise.TODO;

public class TextBlocks {
    public String convertToTextBlock(String name, double totalPrice) {
        // Convert the given String into a text block.
        String result = """
            {
                "@type": "com.jdriven.fanshop.Order",
                "name": "%s",
                "amount": %2.2f
            }""".formatted(name, totalPrice);

        return result;

    }
}
