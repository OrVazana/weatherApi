package com.or.weather.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.or.weather.model.WeatherState;
import com.or.weather.model.WindAndRain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ForecastDay
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-09T13:14:10.799+03:00")


public class ForecastDay   {
  @JsonProperty("windAndRain")
  private WindAndRain windAndRain = null;

  @JsonProperty("temperature")
  private BigDecimal temperature = null;

  @JsonProperty("weatherState")
  private WeatherState weatherState = null;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastDay forecastDay = (ForecastDay) o;
    return Objects.equals(this.windAndRain, forecastDay.windAndRain) &&
        Objects.equals(this.temperature, forecastDay.temperature) &&
        Objects.equals(this.weatherState, forecastDay.weatherState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(windAndRain, temperature, weatherState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastDay {\n");
    
    sb.append("    windAndRain: ").append(toIndentedString(windAndRain)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    weatherState: ").append(toIndentedString(weatherState)).append("\n");
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

