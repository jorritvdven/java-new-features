package exercises;

/**
 * Utility class for exercises.
 */
public final class Exercise {
    private Exercise() {}

    public static <T> T TODO(String description) {
        throw new UnsupportedOperationException(description);
    }
}
