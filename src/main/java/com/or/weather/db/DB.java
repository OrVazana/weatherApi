package com.or.weather.db;

import com.or.weather.exception.NoDataException;
import com.or.weather.model.*;
import org.threeten.bp.LocalDate;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class DB {
    static final List<ForecastDay> IN_MEMORY = new LinkedList<>();

    static {
        IN_MEMORY.add(new ForecastDay().location(new Location().latitude(123.0).longitude(456.0))
                                       .temperature((BigDecimal.valueOf(36.0)))
                                       .windAndRain(new WindAndRain().windSpeed(50.0).rainPercent(12.0))
                                       .weatherState(WeatherState.SUNNY)
                                       .date(LocalDate.now()));
        IN_MEMORY.add(new ForecastDay().location(new Location().latitude(200.0).longitude(0.0))
                                       .temperature((BigDecimal.valueOf(12.0)))
                                       .windAndRain(new WindAndRain().windSpeed(90.0).rainPercent(82.0))
                                       .weatherState(WeatherState.RAINY)
                                       .date(LocalDate.now().plusDays(1)));

        IN_MEMORY.add(new ForecastDay().location(new Location().latitude(123.0).longitude(456.0))
                                       .temperature((BigDecimal.valueOf(23)))
                                       .windAndRain(new WindAndRain().windSpeed(33.0).rainPercent(63.0))
                                       .weatherState(WeatherState.CLOUDY)
                                       .date(LocalDate.now().plusDays(2)));

        IN_MEMORY.add(new ForecastDay().location(new Location().latitude(123.0).longitude(456.0))
                                       .temperature((BigDecimal.valueOf(23)))
                                       .windAndRain(new WindAndRain().windSpeed(33.0).rainPercent(63.0))
                                       .weatherState(WeatherState.CLOUDY)
                                       .date(LocalDate.now().plusDays(3)));

        IN_MEMORY.add(new ForecastDay().location(new Location().latitude(123.0).longitude(456.0))
                                       .temperature((BigDecimal.valueOf(23)))
                                       .windAndRain(new WindAndRain().windSpeed(33.0).rainPercent(63.0))
                                       .weatherState(WeatherState.CLOUDY)
                                       .date(LocalDate.now().plusDays(4)));
    }

    public static BigDecimal getTemperatureByLocation(Location location) throws NoDataException {
        return getForecastByLocation(location).getTemperature();
    }

    public static WindAndRain getWindAndRainByLocation(Location location) throws NoDataException {
        return getForecastByLocation(location).getWindAndRain();
    }

    public static WeeklyForecast getWeeklyForecast(final Location location) {
        WeeklyForecast weeklyForecast = new WeeklyForecast();
        weeklyForecast.addAll(IN_MEMORY
                .stream()
                .filter((ForecastDay forecastDay) -> forecastDay.getLocation().equals(location))
                .filter((ForecastDay forecastDay) -> forecastDay.getDate().isAfter(LocalDate.now().minusDays(1)))
                .filter((ForecastDay forecastDay) -> forecastDay.getDate().isBefore(LocalDate.now().plusDays(5)))
                .collect(toList()));

        return weeklyForecast;
    }

    private static boolean isLocationNotInDataSet(Location location) {
        return IN_MEMORY.stream().noneMatch((ForecastDay forecastDay) -> forecastDay.getLocation().equals(location));
    }

    private static ForecastDay getForecastByLocation(Location location) throws NoDataException {
        try {
            return IN_MEMORY.stream()
                            .filter((ForecastDay forecastDay) -> forecastDay.getLocation().equals(location))
                            .filter((ForecastDay forecastDay) -> forecastDay.getDate().isEqual(LocalDate.now()))
                            .findFirst().get();
        } catch (Exception e) {
            throw new NoDataException(404, "No available data for this location Today");
        }
    }
}
