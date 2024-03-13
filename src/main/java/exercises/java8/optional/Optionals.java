package exercises.java8.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static exercises.Exercise.TODO;

public class Optionals {
    /**
     * Return an optional containing 'value'.
     */
    public Optional<String> returnOptional(String value) {
        return TODO("return an optional containing 'value'");
    }

    /**
     * Return an empty Optional.
     */
    public Optional<String> returnEmptyOptional() {
        return TODO("return an empty optional");
    }

    /**
     * Return the name of the student. Use one of the methods of `Optional` to get the name.
     */
    public Optional<String> returnStudentName(Student student) {
        return TODO("return an optional containing the name of the student");
    }

    /**
     * Return the email address of the student.
     */
    public Optional<String> returnStudentEmail(Student student) {
        return TODO("return an optional containing the email address of the student");
    }

    /**
     * Return a list of valid email addresses of all students.
     * Hint: The system providing the students is a bit buggy!
     */
    public List<String> returnEmailAddresses(Stream<Student> students) {
        return TODO("return a list of email addresses of all students");
    }
}
