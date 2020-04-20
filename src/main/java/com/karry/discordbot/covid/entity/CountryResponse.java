package com.karry.discordbot.covid.entity;

public class CountryResponse {


    private String country;
    private Cases cases;
    private Deaths deaths;
    private String day;
    private String time;

    @Override
    public String toString() {
        return "CountryResponse{" +
                "country='" + country + '\'' +
                ", cases=" + cases +
                ", deaths=" + deaths +
                ", day='" + day + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
    }

    public void setDeaths(Deaths deaths) {
        this.deaths = deaths;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCountry() {
        return country;
    }

    public Cases getCases() {
        return cases;
    }

    public Deaths getDeaths() {
        return deaths;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }
}
