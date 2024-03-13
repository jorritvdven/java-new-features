package exercises.java14;

import static exercises.Exercise.TODO;

public class SwitchExpressions {
    /**
     * This method should return the sound the given animal makes.
     * For example, "dog" -> "woof".
     *
     * Possible animal sounds are:
     * dog  -> woof
     * cat  -> meow
     * lion -> roar
     * fish -> blub
     * bee  -> bzzz
     * (any other animal) -> unknown
     *
     * Implement this method using the "old" switch statement; do not use a switch expression yet.
     */
    public String switchStatement(String animal) {
        String sound;
        switch (animal) {
            case "dog":
                sound = "woof";
                break;
            case "cat":
                sound = "meow";
                break;
            case "lion":
                sound = "roar";
                break;
            case "fish":
                sound = "blub";
                break;
            case "bee":
                sound = "bzzz";
                break;
            default:
                sound = "unknown";
                break;
        }

        return sound;
    }

    /**
     * Implement the same logic as in the previous exercise, but this time with the "new" switch expression.
     *
     * Possible animal sounds are:
     * dog  -> woof
     * cat  -> meow
     * lion -> roar
     * fish -> blub
     * bee  -> bzzz
     * (any other animal) -> unknown
     */
    public String switchExpression(String animal) {
        return switch (animal) {
            case "dog" -> "woof";
            case "cat" -> "meow";
            case "lion" -> "roar";
            case "fish" -> "blub";
            case "bee" -> "bzzz";
            default -> "unknown";
        };
    }
}
