package Patterns.Observer.Observer;

/**
 * Created by Home on 10.12.2016.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float heatindex;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure, float heatindex) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.heatindex = heatindex;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity and " + heatindex + " heatindex ");
    }
}
