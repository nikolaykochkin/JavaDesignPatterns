package observer;

import java.util.*;


public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Float> temperature;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.temperature = new ArrayList<>();
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Data data) {
        temperature.add(data.getTemperature());
        display();
    }

    @Override
    public void display() {

        OptionalDouble avg = temperature.stream()
                .mapToDouble(a -> a)
                .average();

        OptionalDouble min = temperature.stream()
                .mapToDouble(a -> a)
                .min();

        OptionalDouble max = temperature.stream()
                .mapToDouble(a -> a)
                .max();

        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f\n", avg.getAsDouble(), max.getAsDouble(), min.getAsDouble());
    }
}
