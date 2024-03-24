package exercises.java15;

import static exercises.Exercise.TODO;

public class TextBlocks {
    public String convertToTextBlock(String name, double totalPrice) {
        // Convert the given String into a text block.
        String result = "{\n" +
                "    \"@type\": \"com.jdriven.fanshop.Order\",\n" +
                "    \"name\": \"" + name + "\",\n" +
                "    \"amount\": " + String.format("%2.2f", totalPrice) + "\n" +
                "}";

        return TODO("Convert into a text block and return the text block.");
    }
}
