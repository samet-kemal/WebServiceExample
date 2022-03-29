package com.samet.webserviceexample.RestAPI;

import com.samet.webserviceexample.Models.InformationsItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {

    String BASE_URL = "https://jsonplaceholder.typicode.com";

    @GET ("/posts")
    Call<List<InformationsItem>> getJson();
}
