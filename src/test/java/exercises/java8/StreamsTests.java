package exercises.java8;

import exercises.java8.streams.Employee;
import exercises.java8.streams.Streams;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StreamsTests {
    private List<Employee> employees = List.of(
            new Employee("Jorrit", 37),
            new Employee("Henk", 30),
            new Employee("Piet", 40),
            new Employee("Anne", 20),
            new Employee("Jan", 25),
            new Employee("Mohammed", 42)
    );

    private Streams subject = new Streams();

    /**
     * Convert the list of employees into an alphabetically sorted list of names.
     */
    @Test
    public void sortByName() {
        List<String> expected = List.of("Anne", "Henk", "Jan", "Jorrit", "Mohammed", "Piet");
        assertEquals(expected, subject.sortByName(employees));
    }

    /**
     * Find all employees with a name longer than 4 characters
     */
    @Test
    public void findAllEmployeesWithALongName() {
        Set<String> expected = Set.of("Jorrit", "Mohammed");
        Set<Employee> actual = subject.findAllEmployeesWithALongName(employees);
        assertEquals(expected, actual.stream().map(Employee::getName).collect(Collectors.toSet()));
    }

    /**
     * Calculate the average age of the employees using the Stream API
     */
    @Test
    public void calculateAverageAge() {
        assertEquals(32, Math.round(subject.calculateAverageAge(employees)));
    }

    /**
     * Calculate the average name length using the Stream API
     */
    @Test
    public void calculateAverageNameLength() {
        assertEquals(5, Math.round(subject.calculateAverageNameLength(employees)));
    }
}


