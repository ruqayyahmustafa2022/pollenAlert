package com.detroitlabs.pollenAlert.Service;

import com.detroitlabs.pollenAlert.Data.PollenData;
import com.detroitlabs.pollenAlert.Data.WeatherData;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

public class apiAccess {

    public WeatherData accessWeatherData(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.breezometer.com/weather/v1/forecast/daily?lat=30.695366&lon=-88.039894&key=4873efe5bf9348eeb074675d2accf60a&days=3 ", WeatherData.class);
    }

    public PollenData accessPollenData(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.breezometer.com/pollen/v2/forecast/daily?lat=30.695366&lon=-88.039894&key=4873efe5bf9348eeb074675d2accf60a&features=types_information&days=3",
                PollenData.class);
    }

}
