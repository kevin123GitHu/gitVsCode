public class PizzaDelivery {
	private final double GRAVITY_CONSTANT = 9.81;
	private int numberOfLateDeliveries;

	// ...

	int getRating() {

		return numberOfLateDeliveries > 5 ? 2 : 1;

	}

	double potentialEnergy(double mass, double height) {

		return mass * height * GRAVITY_CONSTANT;

	}

}
