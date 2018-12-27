package com.example.cc.uidesing;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static String BASE_URL="http://18.217.158.244/safekidz_app/index.php/api/user/";
    public static Retrofit retrofit=null;

    public static Retrofit apiclient(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;

    }
}
