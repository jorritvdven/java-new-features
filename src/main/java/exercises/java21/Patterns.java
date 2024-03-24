package exercises.java21;

import examples.Records;

import static exercises.Exercise.TODO;

public class Patterns {
    /**
     * Re-implement this method using records patterns
     */
    public String recordPatternMatching(Object someObj) {
        if (someObj instanceof Records.StudentAsRecord student) {
            String name = student.name();
            long number = student.studentNumber();
            return "student " + name + " has number " + number;
        } else {
            return null;
        }
    }

    /**
     * Use switch pattern matching to convert the argument 'someObj' to a string.
     * The string should contain the type(class) of someObj, followed by its value.
     *
     * Example:
     * Integer(123) should return "Integer 123"
     *
     * The method should support String, Integer, Long and Double.
     */
    public String switchPatternMatching(Object someObj) {
        return TODO("Implement this method.");
    }
}
