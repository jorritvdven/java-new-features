package exercises.java8.lambdas;

import java.util.function.Function;

import static exercises.Exercise.TODO;

public class Lambdas {

    /**
     * Replace the anonymous class with a lambda function
     */
    public Function<String, Integer> replaceAnonymousClassWithLambda() {
        TODO("Replace the anonymous class with a lambda function.");
        // return s -> s.length;
        return new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
    }

    /**
     *  return an implementation of functional interface Calculator in this method.
     *  It should take the 2 integers and return the sum.
     */
    public Calculator implementAFunctionalInterface() {
        // return (a,b) -> a+b;
        TODO("return an implementation (as a lambda) which calculates the sum om the 2 given integers.");
        return null;
    }

    /**
     * Replace the implementation of the previous exercise with a method reference to the sum method of Integer
     */
    public Calculator methodReference() {
        //return Integer::sum;
        TODO("Complete the exercise");
        return null;
    }
}
