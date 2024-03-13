package examples;

public class InstanceOfCasting {
    public void eat(Fruit fruit) {
        if (fruit instanceof Apple) {
            Apple apple = (Apple) fruit;
            System.out.println("An apple is " + apple.getColor());
        } else if (fruit instanceof Banana) {
            Banana banana = (Banana) fruit;
            System.out.println("Minions love bananas because their color is " + banana.getColor());
        } else  {
            System.out.println("I don't know this kind of fruit!");
        }
    }
}
