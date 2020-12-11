package com.zj.openeyes

import android.app.Application
import android.content.Context

class OpenEyesApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        context = this
    }

    companion object {
        lateinit var context: Context
    }
}