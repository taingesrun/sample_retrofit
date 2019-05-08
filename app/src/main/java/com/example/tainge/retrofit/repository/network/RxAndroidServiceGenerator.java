package com.example.tainge.retrofit.repository.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Tainge on 12/20/2017.
 */

public class RxAndroidServiceGenerator {

    private static final String BASE_URL = "http://192.168.1.12:8080/";
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    static RxJava2CallAdapterFactory rxJava2CallAdapterFactory = RxJava2CallAdapterFactory.create();

    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(rxJava2CallAdapterFactory);

    public static <S> S createService(Class<S> service){
        Retrofit retrofit = builder
                .client(httpClient.build())
                .build();
        return retrofit.create(service);
    }

}
