package com.or.weather.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.or.weather.db.DB;
import com.or.weather.model.Location;
import com.or.weather.model.WeeklyForecast;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-09T17:34:52.779+03:00")

@Controller
public class ForecastApiController implements ForecastApi {

    private static final Logger log = LoggerFactory.getLogger(ForecastApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ForecastApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<WeeklyForecast> forecastPost(@ApiParam(value = "Location parameter based on longitude and latitude.", required = true) @Valid @RequestBody Location location) {
        String accept = request.getHeader("Accept");
        if (accept != null) {
//            try {
            return new ResponseEntity<WeeklyForecast>(DB.getWeeklyForecast(location), HttpStatus.OK);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<WeeklyForecast>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        }
        return new ResponseEntity<WeeklyForecast>(HttpStatus.NOT_IMPLEMENTED);
    }
}

