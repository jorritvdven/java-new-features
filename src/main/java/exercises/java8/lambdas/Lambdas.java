package exercises.java8.lambdas;

import java.util.function.Function;

import static exercises.Exercise.TODO;

public class Lambdas {

    /**
     * Replace the anonymous class with a lambda function
     */
    public Function<String, Integer> replaceAnonymousClassWithLambda() {
        return s -> s.length();
    }

    /**
     *  return an implementation of functional interface Calculator in this method.
     *  It should take the 2 integers and return the sum.
     */
    public Calculator implementAFunctionalInterface() {
        return (a,b) -> a+b;
    }

    /**
     * Replace the implementation of the previous exercise with a method reference to the sum method of Integer
     */
    public Calculator methodReference() {
        return Integer::sum;
    }
}
