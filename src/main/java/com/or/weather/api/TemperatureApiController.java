package com.or.weather.api;

import java.math.BigDecimal;

import com.or.weather.db.DB;
import com.or.weather.model.Location;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.or.weather.model.WindAndRain;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-09T13:14:10.799+03:00")

@Controller
public class TemperatureApiController implements TemperatureApi {

    private static final Logger log = LoggerFactory.getLogger(TemperatureApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TemperatureApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<BigDecimal> temperaturePost(@ApiParam(value = "Location parameter based on longitude and latitude." ,required=true )  @Valid @RequestBody Location location) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("*/*")) {
//            try {
                return new ResponseEntity<BigDecimal>(DB.getTemperatureByLocation(location), HttpStatus.OK);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<BigDecimal>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        }

        return new ResponseEntity<BigDecimal>(HttpStatus.NOT_IMPLEMENTED);
    }

}
