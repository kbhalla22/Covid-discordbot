package com.karry.discordbot.covid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;


@Service
@Component
@PropertySource("classpath:application.properties")
public class CoronaService {

    @Autowired
    private Environment env;

    @Value("${karankey}")
    public String APIKey;

    @PostConstruct
    public void getAllCountries(){

        RestTemplate restTemplate=new RestTemplate();

        String url="https://covid-193.p.rapidapi.com/countries";

        HttpEntity<String>entity=new HttpEntity<String>("parameters",getHeaders());
        ResponseEntity<String>response=restTemplate.exchange(url, HttpMethod.GET,entity,String.class);
System.out.println(response.getBody());
        // https://covid-193.p.rapidapi.com/countries
    }

    private HttpHeaders getHeaders(){

       HttpHeaders headers=new HttpHeaders();
       headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("x-rapidapi-key",APIKey);

        return headers;

    }
}
