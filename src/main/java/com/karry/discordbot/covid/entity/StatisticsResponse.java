package com.karry.discordbot.covid.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatisticsResponse {

    Integer results;

    @JsonProperty("name")
    List<CountryResponse> responseList;

}
