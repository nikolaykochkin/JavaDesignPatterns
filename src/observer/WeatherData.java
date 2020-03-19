package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private Data data;

    public WeatherData() {
        observers = new ArrayList<>();
        data = new Data(0, 0, 0);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer :
                observers) {
            observer.update(data);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setData(Data data) {
        this.data.setHumidity(data.getHumidity());
        this.data.setPressure(data.getPressure());
        this.data.setTemperature(data.getTemperature());
        measurementsChanged();
    }

    public void setData(float temperature, float humidity, float pressure) {
        this.data.setHumidity(humidity);
        this.data.setPressure(pressure);
        this.data.setTemperature(temperature);
        measurementsChanged();
    }

}
