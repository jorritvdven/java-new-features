package examples;

public class StringImprovements {
    public void lines() {
        String multiLine = "Hello\nthis\nis\na\ntest!";
        var lines = multiLine.lines().toList();
        // [0] = "Hello"
        // [1] = "this"
        // [2] = "a"
        // [3] = "test!"
    }

    public void repeat() {
        String once = "Java";
        String repeated = once.repeat(3);
        // "JavaJavaJava"
    }

    public void trimStrip() {
        String s = "test string\u205F";
        String striped = s.strip();
        System.out.printf("'%s'%n", striped);
        //'test string'

        String trimmed = s.trim();
        System.out.printf("'%s'%n", trimmed);
        //'test string '
    }
    
}
