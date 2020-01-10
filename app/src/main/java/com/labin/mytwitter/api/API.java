package com.labin.mytwitter.api;

import com.labin.mytwitter.model.CreateUser;
import com.labin.mytwitter.serverresponse.ImageResponse;
import com.labin.mytwitter.serverresponse.SignUpResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface API {

    @Headers("Content-Type: application/json")
    @POST("users/signup")
    Call<SignUpResponse> registerUser(@Body CreateUser usr);

    //login user
    @Headers("Content-Type: application/json")
    @POST("users/signin")
    Call<SignUpResponse> login(@Body CreateUser user);

    @Multipart
    @POST("users/profile")
    Call<ImageResponse>uploadImage(@Part MultipartBody.Part image);

    @GET("users/me/{username}")
    Call<CreateUser>getEmployeeByName(@Path("username") String username);

}

