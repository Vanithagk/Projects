package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.WeatherResponse;

@Service
public class WeatherService {

	@Value("${weather.api.key}")
	private String apiKey;
	private final String APIUrl="https://api.openweathermap.org/data/2.5/weather?q={city}&appid={key}";
	
	public WeatherResponse getWeatherDetails(String city) {
		RestTemplate restTemplate = new RestTemplate();
				return restTemplate.getForObject(APIUrl,WeatherResponse.class,city,apiKey);
	}
}
