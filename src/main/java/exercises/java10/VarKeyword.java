package exercises.java10;

/**
 * Where possible, Replace the type declarations of all variables with the `var` keyword.
 */
public class VarKeyword {
    public static final String HELLO_CONSTANT = "Hello, ";
    private int someInt = 0;
    private final int finalInt = 1;

    public int getSomeInt() {
        return someInt;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public double calculateCircumference(double radius) {
        final double pi = Math.PI;
        double diameter = 2 * radius;
        return diameter * pi;
    }

    public String sayHello(String name) {
        String result = "";
        result += HELLO_CONSTANT;
        result += name;

        return result;
    }
}
