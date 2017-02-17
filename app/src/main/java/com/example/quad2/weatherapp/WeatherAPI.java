package com.example.quad2.weatherapp;


import com.example.quad2.weatherapp.Model.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by quad2 on 17/2/17.
 */

public interface WeatherAPI {

    @GET("forecast")
    Call<Data> getData(@Query("lat") String lat, @Query("lon") String lon,
                       @Query("APPID") String appId, @Query("units") String units);

}
