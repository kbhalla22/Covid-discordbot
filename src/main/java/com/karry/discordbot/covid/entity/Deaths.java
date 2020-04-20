package com.karry.discordbot.covid.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Deaths {

    @JsonProperty("new")
    private Integer numberOfNewDeaths;

    private Integer total;

    @Override
    public String toString() {
        return "Deaths{" +
                "numberOfNewDeaths=" + numberOfNewDeaths +
                ", total=" + total +
                '}';
    }

    public void setNumberOfNewDeaths(Integer numberOfNewDeaths) {
        this.numberOfNewDeaths = numberOfNewDeaths;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getNumberOfNewDeaths() {
        return numberOfNewDeaths;
    }

    public Integer getTotal() {
        return total;
    }
}
