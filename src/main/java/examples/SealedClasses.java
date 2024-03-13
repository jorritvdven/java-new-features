package examples;

import exercises.java9.B;

public class SealedClasses {
    public abstract sealed class Vehicle permits Car, Truck {
        abstract String getHorn();
    }

    public final class Car extends Vehicle {
        @Override
        String getHorn() {
            return "Toot!";
        }
    }

    public final class Truck extends Vehicle {
        @Override
        String getHorn() {
            return "HONK!";
        }
    }

    //
    public sealed interface Bike permits RacingBike, MountainBike, EBike { }

    public final class RacingBike implements Bike {}
    public final class MountainBike implements Bike {}

    public sealed interface EBike extends Bike permits RegularEBike, SpeedPedelec {}
    public final class RegularEBike implements EBike {}
    public final class SpeedPedelec implements EBike {}

    // Not allowed, nobody likes Fat Bikes :)
    //public final class FatBike implements EBike {}

    public void patternMatching(Vehicle vehicle) {
        String description = switch (vehicle) {
            case Car c-> "It's a car";
            case Truck t -> "It's a truck";
            // No default: statement!
        };
    }
}
