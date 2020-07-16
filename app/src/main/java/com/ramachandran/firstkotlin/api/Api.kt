package com.ramachandran.firstkotlin.api

import com.ramachandran.firstkotlin.model.Repos
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    companion object{
        val BASEURL="https://api.github.com/repos/octocat/";
    }
    @GET("Hello-World")
    fun getRepos() : Call<Repos>
}