package com.ramachandran.firstkotlin.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CallApi {
    companion object{
        fun getRetrofit() : Retrofit =Retrofit.Builder()
            .baseUrl(Api.BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}