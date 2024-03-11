package java8;

import java8.lambdas.Calculator;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lambdas {
    /**
     * Replace the anonymous class with a lambda function
     */
    @Test
    void replaceAnonymousClassWithLambda() {
        Map<String, Integer> names = new HashMap<>();
        names.computeIfAbsent("John", s -> s.length());

        assertEquals(4, names.get("John"));
    }

    /**
     * Implement the calculator using functional interface "Calculator" so it will calculate the sum of the two given numbers.
     */
    @Test
    void implementAFunctionalInterface() {
        Calculator calculator = (a, b) -> a + b;
        assertEquals(2, calculator.calculate(1,1));
    }

    /**
     * Replace the implementation of the previous exercise with a method reference to the sum method of Integer
     */
    @Test
    void createAFunctionalInterface() {
        Calculator calculator = Integer::sum;
        assertEquals(2, calculator.calculate(1,1));
    }
}
