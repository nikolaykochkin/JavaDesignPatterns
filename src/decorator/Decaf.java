package decorator;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Coffee without caffeine";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
