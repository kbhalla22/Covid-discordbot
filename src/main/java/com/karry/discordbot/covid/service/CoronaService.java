package com.karry.discordbot.covid.service;

import com.karry.discordbot.covid.entity.CountriesResponse;
import com.karry.discordbot.covid.entity.StatisticsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Optional;


@Service
@Component
@PropertySource("classpath:application.properties")
public class CoronaService {

    @Autowired
    private Environment env;

    @Value("${karankey}")
    public String APIKey;

    private CountriesResponse availableCountries;

    @PostConstruct
    public CountriesResponse getAllCountries(){
        if(availableCountries==null) {

            RestTemplate restTemplate = new RestTemplate();

            String url = "https://covid-193.p.rapidapi.com/countries";

            HttpEntity<String> entity = new HttpEntity<String>("parameters", getHeaders());
            ResponseEntity<CountriesResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, CountriesResponse.class);
            availableCountries=response.getBody();
            return availableCountries;
        }else{
            return availableCountries;
        }


    }

    public void getStatistics(String countryName){
        Optional<String>validatedCountry=getAllCountries().getResponse().stream().filter(countryBank->countryBank.equals(countryName)).findFirst();
        if(validatedCountry.isPresent()){
            System.out.println(validatedCountry.get() + "country selected");
            RestTemplate restTemplate = new RestTemplate();

            String url = "https://covid-193.p.rapidapi.com/statistics?country={country}";

            HttpEntity<String> entity = new HttpEntity<String>("parameters", getHeaders());
            ResponseEntity<StatisticsResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, StatisticsResponse.class,validatedCountry.get());
            System.out.println(response.getBody().toString());
        }
    }


    private HttpHeaders getHeaders(){

       HttpHeaders headers=new HttpHeaders();
       headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("x-rapidapi-key",APIKey);

        return headers;

    }
}
