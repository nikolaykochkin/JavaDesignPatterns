package duck_sim;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck.getClass().getSimpleName() + " just quacked.");
    }
}
