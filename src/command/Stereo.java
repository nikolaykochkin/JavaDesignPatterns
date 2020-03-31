package command;

public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " stereo is on");
    }

    public void off() {
        System.out.println(name + " stereo is off");
    }

    public void setCd() {
        System.out.println(name + " stereo is set for CD input");
    }

    public void setVolume(int level) {
        System.out.println(name + " stereo volume set to " + level);
    }
}
