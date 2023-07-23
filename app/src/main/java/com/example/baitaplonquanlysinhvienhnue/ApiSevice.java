package com.example.baitaplonquanlysinhvienhnue;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiSevice {
    @GET("students")
    Call<List<User>> getUsers();
}
