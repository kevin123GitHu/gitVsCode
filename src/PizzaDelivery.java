public class PizzaDelivery {

    private int numberOfLateDeliveries;

    // ...

    int getRating() {

        return moreThanFiveLateDeliveries() ? 2 : 1;

    }

    boolean moreThanFiveLateDeliveries() {

        return numberOfLateDeliveries > 5;

    }

    double potentialEnergy(double mass, double height) {

        return mass * height * 9.81;

    }

}
