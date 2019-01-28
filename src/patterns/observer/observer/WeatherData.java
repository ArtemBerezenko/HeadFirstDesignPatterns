package patterns.observer.observer;

import java.util.ArrayList;

/**
 * Created by Home on 10.12.2016.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private float heatindex;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure, heatindex);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure, float rh){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.heatindex = computeHeatIndex(temperature, rh);
        measurementsChanged();
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
}
