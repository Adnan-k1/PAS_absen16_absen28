package com.example.pas_absen16_absen28.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://www.thesportsdb.com/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                         .baseUrl(BASE_URL)
                         .addConverterFactory(GsonConverterFactory.create())
                         .build();
        }
        return retrofit;
    }
}
