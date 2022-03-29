package com.samet.webserviceexample.RestAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestAPIClient {

    private static RestAPIClient instance = null;
    private RestApi myApi;

    private RestAPIClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(RestApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(RestApi.class);
    }

    public static synchronized RestAPIClient getInstance() {
        if (instance == null) {
            instance = new RestAPIClient();
        }
        return instance;
    }

    public RestApi getMyApi() {
        return myApi;
    }



}
