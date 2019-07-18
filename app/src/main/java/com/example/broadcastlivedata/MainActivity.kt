package com.example.broadcastlivedata

import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        InternetConnectionLiveData(this).observe(this,
            Observer<ConnectionModel> {
                it.let {
                    if (it?.hasConnection == true){

                    }
                }
            })
    }
}
