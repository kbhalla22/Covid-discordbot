package com.karry.discordbot.covid.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cases {
//USed to map to a json object. Acts as a key.
    @JsonProperty("new")
    private Integer newCases;


       private Integer  active;
             private Integer critical;
             private Integer recovered;
             private Integer total;

    public Integer getNewCases() {
        return newCases;
    }

    public void setNewCases(Integer newCases) {
        this.newCases = newCases;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Cases{" +
                "newCases=" + newCases +
                ", active=" + active +
                ", critical=" + critical +
                ", recovered=" + recovered +
                ", total=" + total +
                '}';
    }

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
