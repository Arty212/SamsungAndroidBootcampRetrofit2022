package com.example.samsungandroidbootcampretrofit2022.model;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CountryData {

    @SerializedName("info")
    @Expose(deserialize = false, serialize = false)
    private JsonObject info;
    @SerializedName("total_cases")
    @Expose
    private int totalCases;
    @SerializedName("total_recovered")
    @Expose
    private int totalRecovered;
    @SerializedName("total_unresolved")
    @Expose
    private int totalUnresolved;
    @SerializedName("total_deaths")
    @Expose
    private int totalDeaths;
    @SerializedName("total_new_cases_today")
    @Expose
    private int totalNewCasesToday;
    @SerializedName("total_new_deaths_today")
    @Expose
    private int totalNewDeathsToday;
    @SerializedName("total_active_cases")
    @Expose
    private int totalActiveCases;
    @SerializedName("total_serious_cases")
    @Expose
    private int totalSeriousCases;
    @SerializedName("total_danger_rank")
    @Expose
    private int totalDangerRank;

    public JsonObject getInfo() {
        return info;
    }

    public void setInfo(JsonObject info) {
        this.info = info;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    public int getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(int totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public int getTotalUnresolved() {
        return totalUnresolved;
    }

    public void setTotalUnresolved(int totalUnresolved) {
        this.totalUnresolved = totalUnresolved;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public int getTotalNewCasesToday() {
        return totalNewCasesToday;
    }

    public void setTotalNewCasesToday(int totalNewCasesToday) {
        this.totalNewCasesToday = totalNewCasesToday;
    }

    public int getTotalNewDeathsToday() {
        return totalNewDeathsToday;
    }

    public void setTotalNewDeathsToday(int totalNewDeathsToday) {
        this.totalNewDeathsToday = totalNewDeathsToday;
    }

    public int getTotalActiveCases() {
        return totalActiveCases;
    }

    public void setTotalActiveCases(int totalActiveCases) {
        this.totalActiveCases = totalActiveCases;
    }

    public int getTotalSeriousCases() {
        return totalSeriousCases;
    }

    public void setTotalSeriousCases(int totalSeriousCases) {
        this.totalSeriousCases = totalSeriousCases;
    }

    public int getTotalDangerRank() {
        return totalDangerRank;
    }

    public void setTotalDangerRank(int totalDangerRank) {
        this.totalDangerRank = totalDangerRank;
    }

    @Override
    public String toString() {
        return "totalCases " + totalCases +
                "\ntotalRecovered " + totalRecovered +
                "\ntotalNewCasesToday " + totalNewCasesToday +
                "\ntotalActiveCases " + totalActiveCases +
                "\ntotalDangerRank " + totalDangerRank;
    }
}
