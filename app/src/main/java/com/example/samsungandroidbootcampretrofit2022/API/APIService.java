package com.example.samsungandroidbootcampretrofit2022.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("free-api")
    Call<ResponseData> getDataCountry(@Query("countryTotal") String country);

}
