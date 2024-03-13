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
        return Optional.ofNullable(value);
    }

    /**
     * Return an empty Optional.
     */
    public Optional<String> returnEmptyOptional() {
        return Optional.empty();
    }

    /**
     * Return the name of the student. Use one of the methods of `Optional` to get the name.
     */
    public Optional<String> returnStudentName(Student student) {
        return Optional.ofNullable(student)
                .map(e -> e.getName());
    }

    /**
     * Return the email address of the student.
     */
    public Optional<String> returnStudentEmail(Student student) {
        return student.getPersonalInfo()
                .flatMap(Student.PersonalInfo::getEmail);
    }

    /**
     * Return a list of valid email addresses of all students.
     * Hint: The system providing the students is a bit buggy!
     */
    public List<String> returnEmailAddresses(Stream<Student> students) {
        return students.map(e -> Optional.ofNullable(e))
                .map(student -> student.flatMap(e->e.getPersonalInfo()))
                .map(personalInfo -> personalInfo.flatMap(e -> e.getEmail()))
                .flatMap(e -> e.stream())
                .filter(e -> e.contains("@"))
                .toList();
    }
}
