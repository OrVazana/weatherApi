package com.or.weather.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WindAndRain
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-09T13:14:10.799+03:00")


public class WindAndRain   {
  @JsonProperty("windSpeed")
  private Double windSpeed = null;

  @JsonProperty("rainPercent")
  private Double rainPercent = null;

  public WindAndRain windSpeed(Double windSpeed) {
    this.windSpeed = windSpeed;
    return this;
  }

  /**
   * Speed of wind in kph
   * @return windSpeed
  **/
  @ApiModelProperty(value = "Speed of wind in kph")


  public Double getWindSpeed() {
    return windSpeed;
  }

  public void setWindSpeed(Double windSpeed) {
    this.windSpeed = windSpeed;
  }

  public WindAndRain rainPercent(Double rainPercent) {
    this.rainPercent = rainPercent;
    return this;
  }

  /**
   * The chance of rain today in percent
   * @return rainPercent
  **/
  @ApiModelProperty(value = "The chance of rain today in percent")


  public Double getRainPercent() {
    return rainPercent;
  }

  public void setRainPercent(Double rainPercent) {
    this.rainPercent = rainPercent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WindAndRain windAndRain = (WindAndRain) o;
    return Objects.equals(this.windSpeed, windAndRain.windSpeed) &&
        Objects.equals(this.rainPercent, windAndRain.rainPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(windSpeed, rainPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WindAndRain {\n");
    
    sb.append("    windSpeed: ").append(toIndentedString(windSpeed)).append("\n");
    sb.append("    rainPercent: ").append(toIndentedString(rainPercent)).append("\n");
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

