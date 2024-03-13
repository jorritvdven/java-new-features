package exercises.java8.optional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OptionalsTest {
    private Student henk = new Student("Henk", 1001, "henk@student.nl");
    private Student piet = new Student("Piet", 1002, (String)null);

    private List<Student> students = List.of(
            henk,
            piet,
            new Student("Anne", 1003, (Student.PersonalInfo) null),
            new Student("Jan", 2001, "jan@student.nl"),
            new Student("Mohammed", 2002, "mohammed")
    );

    private final Optionals subject = new Optionals();

    @Test
    void returnOptional_present() {
        assertEquals(Optional.of("HRO"), subject.returnOptional("HRO"));
    }

    @Test
    void returnOptional_empty() {
        assertEquals(Optional.empty(), subject.returnOptional(null));
    }

    @Test
    void returnEmptyOptional() {
        assertEquals(Optional.empty(), subject.returnEmptyOptional());
    }

    @Test
    void returnStudentName() {
        assertEquals(Optional.of(henk.getName()), subject.returnStudentName(henk));
    }

    @Test
    void returnStudentName_null() {
        assertEquals(Optional.empty(), subject.returnStudentName(null));
    }

    @Test
    void returnStudentEmail() {
        assertEquals(Optional.of("henk@student.nl"), subject.returnStudentEmail(henk));
    }

    @Test
    void returnStudentEmail_noEmail() {
        assertEquals(Optional.empty(), subject.returnStudentEmail(piet));
    }

    @Test
    void returnEmailAddresses() {
        List<String> expected = List.of("henk@student.nl", "jan@student.nl");
        assertEquals(expected, subject.returnEmailAddresses(students.stream()));
    }
}
