package com.example.samsungandroidbootcampretrofit2022.API;

import java.util.List;

import com.example.samsungandroidbootcampretrofit2022.model.CountryData;
import com.google.gson.annotations.SerializedName;

public class ResponseData {

    @SerializedName("countrydata")
    private List<CountryData> countryData = null;
    @SerializedName("stat")
    private String stat;

    public List<CountryData> getCountryData() {
        return countryData;
    }
    public void setCountryData(List<CountryData> countryData) {
        this.countryData = countryData;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}
