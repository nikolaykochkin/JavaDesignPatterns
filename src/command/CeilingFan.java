package command;

public class CeilingFan {
    String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " ceiling fan is on high");
    }

    public void off() {
        System.out.println(name + " ceiling fan is off");
    }
}
