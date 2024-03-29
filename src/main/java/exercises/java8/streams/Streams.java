package exercises.java8.streams;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static exercises.Exercise.TODO;

public class Streams {
    /**
     * Convert the given list of employees into an alphabetically sorted list of names.
     */
    public List<String> sortByName(List<Employee> employees) {
        return employees.stream()
                .map(e -> e.getName())
                .sorted()
                .toList();
    }

    /**
     * Return all employees with a name longer than 4 characters
     */
    public Set<Employee> findAllEmployeesWithALongName(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getName().length() > 4)
                .collect(Collectors.toSet());
    }

    /**
     * Calculate the average age of the employees using the Stream API.
     */
    public double calculateAverageAge(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(e -> e.getAge())
                .average()
                .orElse(0.0);
    }

    /**
     * Calculate the average name length of all employees using the Stream API
     */
    public double calculateAverageNameLength(List<Employee> employees) {
        return employees.stream()
                .map(e -> e.getName())
                .mapToInt(e -> e.length())
                .average()
                .orElse(0.0);
    }
}
