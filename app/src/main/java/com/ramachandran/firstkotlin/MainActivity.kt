package com.ramachandran.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ramachandran.firstkotlin.databinding.ActivityMainBinding
import com.ramachandran.firstkotlin.model.Repos
import com.ramachandran.firstkotlin.viewmodel.RepoViewModel

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding : ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        var reposeViewModel=ViewModelProviders.of(this).get(RepoViewModel::class.java)
        reposeViewModel.getReposList()?.observe(this, Observer {
            var  repos=it;
            showValue(repos)
           // Toast.makeText(this@MainActivity,repos?.owner?.node_id,Toast.LENGTH_LONG).show()
        })
    }
    fun showValue(repository : Repos) : Unit{
        activityMainBinding.repo=repository;
    }
}
