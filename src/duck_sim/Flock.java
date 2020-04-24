package duck_sim;

import java.util.ArrayList;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker :
                quackers) {
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        quackers.forEach(q -> q.registerObserver(observer));
    }

    @Override
    public void notifyObservers() { }
}
