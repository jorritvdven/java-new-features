package examples;

import java.time.LocalDate;
import java.util.Objects;

public class Records {
    public class Student {
        private final String name;
        private final long studentNumber;
        private final String education;

        public Student(String name, long studentNumber, String education) {
            this.name = name;
            this.studentNumber = studentNumber;
            this.education = education;
        }

        public String getName() {
            return name;
        }

        public long getStudentNumber() {
            return studentNumber;
        }

        public String getEducation() {
            return education;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return studentNumber == student.studentNumber && Objects.equals(name, student.name) && Objects.equals(education, student.education);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, studentNumber, education);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", studentNumber=" + studentNumber +
                    ", education='" + education + '\'' +
                    '}';
        }
    }

    public record StudentAsRecord(
            String name,
            long studentNumber,
            String education
    ) {
        StudentAsRecord(String name, long studentNumber) {
            this(name, studentNumber, "Technische Informatica");
            Objects.requireNonNull(name);
        }
    }

    public record ImmutableStudentAsRecord(
            String name,
            long studentNumber,
            String education
    ) { }

    public static void main(String[] args) {
        StudentAsRecord student = new StudentAsRecord("Jorrit", 764365, "TI");
        System.out.println(student.name());
        System.out.println(student.toString());
    }
}
