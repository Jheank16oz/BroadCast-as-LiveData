package com.example.broadcastlivedata

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager

class InternetConnectionLiveData(context: Context) :BroadcastReceiverLiveData<ConnectionModel>(context,IntentFilter(
    ConnectivityManager.CONNECTIVITY_ACTION)){

    override fun onReceive(intent: Intent?) {
        if(!intent?.action.isNullOrEmpty()){
            postValue(ConnectionModel(false))

        }
    }

}