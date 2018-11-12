package com.example.mac.jadwalsholat.api;


import com.example.mac.jadwalsholat.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("jakarta.json")
    Call<ModelJadwal> getJadwal();

}