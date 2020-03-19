package observer;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setData(80, 65, 30.4f);
        weatherData.setData(82, 70, 29.2f);
        weatherData.setData(78, 90, 29.2f);
    }
}
