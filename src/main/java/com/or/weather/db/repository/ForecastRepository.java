package com.or.weather.db.repository;

import com.or.weather.model.ForecastDay;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ForecastRepository extends MongoRepository<ForecastDay, String> {

    @Query("{'location': { 'longitude' : ?0, 'latitude' : ?1}} $and 'date' : ?2 ")
    ForecastDay findItemByLocationToday(String longitude, String latitude, String date);

    List<ForecastDay> findAll();

    public long count();
}
