package com.example.cc.uidesing;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("parents_login")
    Call<LoginModel> login(@Field("email") String email,
                           @Field("password") String password,
                           @Field("device_type") String device_type,   //kon sa device he (android,ios etc)
                           @Field("reg_id") String reg_id);  // First user ya second user

    @FormUrlEncoded
    @POST("parents_register")
    Call<RegisterModel> register(@Field("name") String name,             //Postman ke saare parameter interface me pass kerne he
                                 @Field("email") String email,
                                 @Field("password") String password,
                                @Field("reg_id") String reg_Id,
                                 @Field("device_type") String device_type);


    @FormUrlEncoded
    @POST("get_parents_profile")
   Call<DeshboardModel> profile(@Field("name") String name,
                                @Field("email") String email,
                                @Field("phone") String phone);


}
