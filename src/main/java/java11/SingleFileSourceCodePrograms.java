package java11;

import java.util.List;

public class SingleFileSourceCodePrograms {
    public static void main(String[] args) {
        var fruits = List.of(new Apple(), new Banana());

        fruits.forEach( e -> System.out.println(e.getColor()) );
    }
}

interface Fruit {
    String getColor();
}

class Apple implements Fruit {
    @Override
    public String getColor() {
        return "red";
    }
}

class Banana implements Fruit {

    @Override
    public String getColor() {
        return "yellow";
    }
}


