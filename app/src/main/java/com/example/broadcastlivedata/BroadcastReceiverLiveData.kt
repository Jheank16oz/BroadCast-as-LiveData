package com.example.broadcastlivedata

import android.arch.lifecycle.LiveData
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter

abstract class BroadcastReceiverLiveData<T>(private val context: Context, val intent: IntentFilter):LiveData<T>(){
    override fun onInactive() {
        super.onInactive()
        context.registerReceiver(receiver, intent)
    }

    override fun onActive() {
        super.onActive()
        context.unregisterReceiver(receiver)
    }

    abstract fun onReceive(intent:Intent?)

    private val receiver = object:BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            onReceive(intent)
        }
    }

}