package java8.streams;

import java.util.Map;
import java.util.Optional;

public class OptionalExamples {
    public String sayHelloNull(String name) {
        if (name != null) {
            return "Hello, " + name;
        } else {
            return null;
        }
    }

    // new
    public Optional<String> sayHelloOptional(String name) {
        if (name != null) {
            return Optional.of("Hello, " + name);
        } else {
            return Optional.empty();
        }
    }

    public Optional<String> sayHelloOptionalAlt(String name) {
        return Optional.ofNullable(name)
                .map( e -> "Hello, " + name );
    }
}
