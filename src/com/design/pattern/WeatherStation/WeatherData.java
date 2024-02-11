package com.design.pattern.WeatherStation;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData extends Observable {

    float temp;
    float pressure;
    float humidity;
    public WeatherData(){

    }


    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementChanged();
    }
}
