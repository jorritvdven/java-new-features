package exercises.java8.optional;

import java.util.Optional;

/**
 * No exercises in this class.
 */
public class Student {
    private final String name;
    private final long studentNumber;
    private final PersonalInfo personalInfo;

    public Student(String name, long studentNumber, String email) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.personalInfo = new PersonalInfo(email);
    }

    public Student(String name, long studentNumber, PersonalInfo personalInfo) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.personalInfo = personalInfo;
    }

    public String getName() {
        return name;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public Optional<PersonalInfo> getPersonalInfo() {
        return Optional.ofNullable(personalInfo);
    }

    class PersonalInfo {
        private final String email;

        public PersonalInfo(String email) {
            this.email = email;
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }
}
