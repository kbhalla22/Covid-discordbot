package com.karry.discordbot.covid.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

// to prevent specified fields from being serialized or deserialized
// (i.e. not include in JSON output; or being set even if they were included)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountriesResponse {
    Integer results;
    List<String>response;

    @Override
    public String toString() {
        return "CountriesResponse{" +
                "results=" + results +
                ", response=" + response +
                '}';
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public void setResponse(List<String> response) {
        this.response = response;
    }

    public Integer getResults() {
        return results;
    }

    public List<String> getResponse() {
        return response;
    }
}
