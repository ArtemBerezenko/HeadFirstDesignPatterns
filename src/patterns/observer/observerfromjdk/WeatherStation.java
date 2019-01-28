package patterns.observer.observerfromjdk;

import patterns.observer.observer.CurrentConditionsDisplay;
import patterns.observer.observer.WeatherData;

/**
 * Created by Home on 11.12.2016.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay();

//        weatherData.setMeasurements(80, 65, 30.4f);
//        weatherData.setMeasurements(82, 70, 29.2f);
//        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
