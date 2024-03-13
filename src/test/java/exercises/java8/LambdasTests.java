package exercises.java8;

import exercises.java8.lambdas.Calculator;
import exercises.java8.lambdas.Lambdas;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LambdasTests {
    private Lambdas subject = new Lambdas();

    @Test
    void replaceAnonymousClassWithLambda() {
        Map<String, Integer> names = new HashMap<>();
        names.computeIfAbsent("John", subject.replaceAnonymousClassWithLambda());

        assertEquals(4, names.get("John"));
    }

    @Test
    void implementAFunctionalInterface() {
        Calculator calculator = subject.implementAFunctionalInterface();
        assertEquals(3, calculator.calculate(1,2));
    }

    /**
     * Replace the implementation of the previous exercise with a method reference to the sum method of Integer
     */
    @Test
    void createAFunctionalInterface() {
        Calculator calculator = subject.implementAFunctionalInterface();
        assertEquals(3, calculator.calculate(1,2));
    }
}
