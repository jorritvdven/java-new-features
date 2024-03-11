package java8;

import java8.streams.Employee;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Streams {
    private List<Employee> employees = List.of(
            new Employee("Jorrit", 37),
            new Employee("Henk", 30),
            new Employee("Piet", 40),
            new Employee("Anne", 20),
            new Employee("Jan", 25),
            new Employee("Mohammed", 42)
    );

    /**
     * Convert the list of employees into an alphabetically sorted list of names.
     */
    @Test
    public void sortByName() {
        List<String> names = employees.stream()
                .map(e -> e.getName())
                .sorted()
                .collect(Collectors.toList());

        List<String> expected = List.of("Anne", "Henk", "Jan", "Jorrit", "Mohammed", "Piet");
        assertEquals(expected, names);
    }

    /**
     * Find all employees with a name longer than 4 characters
     */
    @Test
    public void findAllEmployeesWithALongName() {
        List<Employee> result = employees.stream()
                .filter(e -> e.getName().length() > 4)
                .collect(Collectors.toList());

        Set<String> expected = Set.of("Jorrit", "Mohammed");
        assertEquals(expected, result.stream().map(e -> e.getName()).collect(Collectors.toSet()));
    }

    /**
     * Calculate the average age of the employees using the Stream API
     */
    @Test
    public void calculateAverageAge() {
        Double average = employees.stream()
                .mapToInt(e -> e.getAge())
                .average()
                .getAsDouble();

        assertEquals(32, Math.round(average));
    }

    /**
     * Calculate the average name length using the Stream API
     */
    @Test
    public void calculateAverageNameLength() {
        Double average = employees.stream()
                .map(e -> e.getName())
                .mapToInt(e -> e.length())
                .average()
                .getAsDouble();

        assertEquals(5, Math.round(average));
    }
}


