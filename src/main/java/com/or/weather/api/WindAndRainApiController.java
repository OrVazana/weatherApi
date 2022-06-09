package com.or.weather.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.or.weather.db.DB;
import com.or.weather.exception.NoDataException;
import com.or.weather.model.Location;
import com.or.weather.model.WindAndRain;
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
public class WindAndRainApiController implements WindAndRainApi {

    private static final Logger log = LoggerFactory.getLogger(WindAndRainApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WindAndRainApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<WindAndRain> windAndRainPost(@ApiParam(value = "Location parameter based on longitude and latitude.", required = true) @Valid @RequestBody Location location) {
        String accept = request.getHeader("Accept");
        if (accept != null) {
            try {
                return new ResponseEntity<WindAndRain>(DB.getWindAndRainByLocation(location), HttpStatus.OK);
            } catch (NoDataException e) {
                log.error(e.getMessage(), e);
                return new ResponseEntity<WindAndRain>(HttpStatus.NOT_FOUND);
            }
        }

        return new ResponseEntity<WindAndRain>(HttpStatus.NOT_IMPLEMENTED);
    }
}
