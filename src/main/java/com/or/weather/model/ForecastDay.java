package com.or.weather.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.or.weather.model.Location;
import com.or.weather.model.WeatherState;
import com.or.weather.model.WindAndRain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ForecastDay
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-09T17:34:52.779+03:00")


public class ForecastDay   {
  @JsonProperty("location")
  private Location location = null;

  @JsonProperty("windAndRain")
  private WindAndRain windAndRain = null;

  @JsonProperty("temperature")
  private BigDecimal temperature = null;

  @JsonProperty("weatherState")
  private WeatherState weatherState = null;

  @JsonProperty("date")
  private LocalDate date = null;

  public ForecastDay location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public ForecastDay windAndRain(WindAndRain windAndRain) {
    this.windAndRain = windAndRain;
    return this;
  }

  /**
   * Get windAndRain
   * @return windAndRain
  **/
  @ApiModelProperty(value = "")

  @Valid

  public WindAndRain getWindAndRain() {
    return windAndRain;
  }

  public void setWindAndRain(WindAndRain windAndRain) {
    this.windAndRain = windAndRain;
  }

  public ForecastDay temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Get temperature
   * @return temperature
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public ForecastDay weatherState(WeatherState weatherState) {
    this.weatherState = weatherState;
    return this;
  }

  /**
   * Get weatherState
   * @return weatherState
  **/
  @ApiModelProperty(value = "")

  @Valid

  public WeatherState getWeatherState() {
    return weatherState;
  }

  public void setWeatherState(WeatherState weatherState) {
    this.weatherState = weatherState;
  }

  public ForecastDay date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastDay forecastDay = (ForecastDay) o;
    return Objects.equals(this.location, forecastDay.location) &&
        Objects.equals(this.windAndRain, forecastDay.windAndRain) &&
        Objects.equals(this.temperature, forecastDay.temperature) &&
        Objects.equals(this.weatherState, forecastDay.weatherState) &&
        Objects.equals(this.date, forecastDay.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, windAndRain, temperature, weatherState, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastDay {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    windAndRain: ").append(toIndentedString(windAndRain)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    weatherState: ").append(toIndentedString(weatherState)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

