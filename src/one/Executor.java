package one;

import one.observer.*;

public class Executor {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurement(-11,50,110);
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        Observer staticDisplay = new StatisticDisplay(weatherData);
        weatherData.setMeasurement(-21,70,125);
        weatherData.setMeasurement(-28,75,110);
        weatherData.setMeasurement(10,55,112);

    }
}
