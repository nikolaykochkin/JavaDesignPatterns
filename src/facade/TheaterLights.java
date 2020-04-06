package facade;

public class TheaterLights {
    public void on() {
        System.out.println("Theater Ceiling Light on");
    }

    public void off() {
        System.out.println("Theater Ceiling Light off");
    }

    public void dim(int level) {
        System.out.println("Theater Ceiling Light dimming to " + level + "%");
    }
}
