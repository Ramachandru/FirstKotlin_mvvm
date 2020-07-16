package com.ramachandran.firstkotlin.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ramachandran.firstkotlin.api.Api
import com.ramachandran.firstkotlin.api.CallApi
import com.ramachandran.firstkotlin.model.Repos
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepoViewModel : ViewModel() {
    var mutableLiveData: MutableLiveData<Repos>? = MutableLiveData<Repos>()
    fun getReposList() : MutableLiveData<Repos>? {
        getResponse()
       return mutableLiveData
    }

    fun getResponse() : Unit{
        var apiCall= CallApi.getRetrofit().create(Api::class.java)
        var resp : Call<Repos> = apiCall.getRepos();
        resp.enqueue( object : Callback<Repos>{
            override fun onFailure(call: Call<Repos>, t: Throwable) {
                Log.v("","Error : "+t.message)
            }

            override fun onResponse(call: Call<Repos>, response: Response<Repos>) {
                mutableLiveData?.value=response.body()
            }

        })
    }
}