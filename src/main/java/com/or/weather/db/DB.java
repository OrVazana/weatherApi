package com.or.weather.db;

import com.or.weather.model.ForecastDay;
import com.or.weather.model.Location;
import com.or.weather.model.WeatherState;
import com.or.weather.model.WindAndRain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class DB {
    static final Map<Location, ForecastDay> IN_MEMORY = new HashMap<>();

    static {
        IN_MEMORY.put(new Location()
                        .latitude(123.0)
                        .longitude(456.0),
                new ForecastDay()
                        .temperature((BigDecimal.valueOf(36.0)))
                        .windAndRain(new WindAndRain().windSpeed(50.0).rainPercent(12.0))
                        .weatherState(WeatherState.SUNNY));
        IN_MEMORY.put(new Location()
                        .latitude(0.0)
                        .longitude(555.0),
                new ForecastDay()
                        .temperature((BigDecimal.valueOf(16.0)))
                        .windAndRain(new WindAndRain().windSpeed(90.0).rainPercent(82.0))
                        .weatherState(WeatherState.RAINY));
    }

    public static BigDecimal getTemperatureByLocation(Location location) {
        System.out.println("temperature req");
        System.out.println(location);
        if(!IN_MEMORY.containsKey(location)){
            addLocationToDataSet(location);
        }
        return IN_MEMORY.get(location).getTemperature();
    }

    public static WindAndRain getWindAndRainByLocation(Location location) {
        System.out.println("windAndRain req");
        System.out.println(location);
        if(!IN_MEMORY.containsKey(location)){
            addLocationToDataSet(location);
        }
        return IN_MEMORY.get(location).getWindAndRain();
    }

    private static void addLocationToDataSet(Location location) {
        IN_MEMORY.put(location, new ForecastDay()
                .temperature((BigDecimal.valueOf(36.0)))
                .windAndRain(new WindAndRain().windSpeed(50.0).rainPercent(12.0))
                .weatherState(WeatherState.SUNNY));
    }
}
