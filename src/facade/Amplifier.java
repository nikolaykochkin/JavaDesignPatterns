package facade;

public class Amplifier {
    DvdPlayer dvd;

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
        System.out.println("Top-O-Line Amplifier setting DVD player to " + dvd.toString());
    }

    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }

    public void setVolume(int level) {
        System.out.println("Top-O-Line Amplifier setting volume to " + level);
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }
}
