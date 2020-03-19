package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Data data) {
        temperature = data.getTemperature();
        humidity = data.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %.1fF degrees and humidity %.1f%%\n", temperature, humidity);
    }
}
