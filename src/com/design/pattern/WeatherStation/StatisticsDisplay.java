package com.design.pattern.WeatherStation;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer,DisplayElement{
    private float averageTemperature;
    private float averageHumidity;
    private float averagePressure;
    private Observable observable;


    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver((Observer) this);
    }
    @Override
    public void display() {
        System.out.println("Avg Temp:"+averageTemperature+", Avg Pressure :"+averagePressure+" and Avg Humidity :"+averageHumidity);
    }
    public void update(Observable observable, Object args) {
        if(observable instanceof  WeatherData){
            float temperature = ((WeatherData) observable).getTemp();
            float humidity = ((WeatherData) observable).getHumidity();
            float pressure = ((WeatherData) observable).getPressure();
            this.averageTemperature = this.averageTemperature !=0.0 ? (this.averageTemperature + temperature)/2 : temperature;
            this.averageHumidity = this.averageHumidity !=0.0 ? (this.averageHumidity + humidity)/2 : humidity;
            this.averagePressure = this.averagePressure !=0.0 ? (this.averagePressure + pressure)/2 : pressure;
            display();
        }

    }
}
