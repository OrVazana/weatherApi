package com.or.weather.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets WeatherState
 */
public enum WeatherState {
  
  SUNNY("Sunny"),
  
  CLOUDY("cloudy"),
  
  RAINY("rainy");

  private String value;

  WeatherState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WeatherState fromValue(String text) {
    for (WeatherState b : WeatherState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

