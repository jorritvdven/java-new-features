package exercises.java9;

import static exercises.Exercise.TODO;

public class DefaultMethods {
    /**
     * The "java9" package contains an interface named "A".
     * Add a new method "String sayHello(String name)" to this interface. Also provide a default implementation
     * which returns "Hello, <name>".
     */
    public String addDefaultMethodToA(String name) {
        final A a = () -> "Hello world!";

        TODO("Complete the exercise and uncomment the line below.");
        return null;
        //return a.sayHello(name);
    }

    /**
     * The "java9" package also contains an interface named "B".
     * Add a new method "String sayHello(String name)" to this interface. Also provide a default implementation
     * which returns "Good day, <name>".
     */
    public String addDefaultMethodToB(String name) {
        final B b = () -> "Hello world!";

        TODO("Complete the exercise and uncomment the line below.");
        return null;
        //return b.sayHello(name);
    }

    /**
     * Class 'C' below this method implements interface A.
     * Change the class, so it also implements interface B. The `sayHello(String name)` method of class 'C' should return
     * "Good day, <name>".
     */
    public String multipleInheritance(String name) {
        final C c = new C();

        TODO("Complete the exercise and uncomment the line below.");
        return null;
        //return c.sayHello(name);
    }

    class C implements A {
        @Override
        public String sayHello() {
            return "Hello, World!";
        }
    }

//    class C implements A, B {
//        @Override
//        public String sayHello() {
//            return "Hello, World!";
//        }
//
//        @Override
//        public String sayHello(String name) {
//            return B.super.sayHello(name);
//        }
//    }
}
