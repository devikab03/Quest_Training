package com.quest.weathermonitoringsystem;

public class Cities {
    private String name;
    private double humidity;
    private double temperature;
    private String condition;
    public Cities(String name, double humidity, double temperature, String condition) {
        this.name = name;
        this.humidity = humidity;
        this.temperature = temperature;
        this.condition = condition;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "name='" + name + '\'' +
                ", humidity=" + humidity +
                ", temperature=" + temperature +
                ", condition='" + condition + '\'' +
                '}';
    }
}
