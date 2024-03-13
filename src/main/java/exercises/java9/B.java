package exercises.java9;

public interface B {
    String sayHello();

    default String sayHello(String name) {
        return "Good day, " + name;
    }
}
