package exercises.java9;

public interface A {
    String sayHello();

    default String sayHello(String name) {
        return "Hello, " + name;
    }
}
