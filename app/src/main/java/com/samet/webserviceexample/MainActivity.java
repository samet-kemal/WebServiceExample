package com.samet.webserviceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.samet.webserviceexample.Adapter.Adapter;
import com.samet.webserviceexample.Models.InformationsItem;
import com.samet.webserviceexample.RestAPI.RestAPIClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<InformationsItem> list;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialize();
        request();
    }


    public void Initialize(){
        listView=(ListView) findViewById(R.id.listView);
    }

    public void request(){

        list = new ArrayList<>();

        Call<List<InformationsItem>> informationList = RestAPIClient.getInstance().getMyApi().getJson();

        informationList.enqueue(new Callback<List<InformationsItem>>() {
            @Override
            public void onResponse(Call<List<InformationsItem>> call, Response<List<InformationsItem>> response) {

               if( response.isSuccessful()){
                   list=response.body();

                   Adapter adapter = new Adapter(list,getApplicationContext());
                   listView.setAdapter(adapter);


               }


                Log.i("REQUEST_OF_RETROFİT", response.body().toString());
            }

            @Override
            public void onFailure(Call<List<InformationsItem>> call, Throwable t) {
                Log.i("FAİL_OF_RETROFİT", "FAİLED");
                Toast.makeText(getApplicationContext(), "REQUEST FAİLED !!", Toast.LENGTH_SHORT).show();

            }
        });


    }
}