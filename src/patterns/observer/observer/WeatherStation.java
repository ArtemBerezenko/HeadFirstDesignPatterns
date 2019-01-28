package patterns.observer.observer;

/**
 * Created by Home on 11.12.2016.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f,  3);
        weatherData.setMeasurements(82, 70, 29.2f, 34);
        weatherData.setMeasurements(78, 90, 29.2f, 888);

    }
}
