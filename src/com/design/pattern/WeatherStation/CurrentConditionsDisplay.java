package com.design.pattern.WeatherStation;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Observable observable;
    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver((java.util.Observer) this);
    }
    @Override
    public void display() {
        System.out.println("Current Conditions : "+temperature+" degree celsius and Humidity :"+ humidity+" %");
    }

    public void update(Observable observable,Object args) {
        if(observable instanceof  WeatherData){
            this.temperature = ((WeatherData) observable).getTemp();
            this.humidity = ((WeatherData) observable).getHumidity();
            display();
        }

    }
}
