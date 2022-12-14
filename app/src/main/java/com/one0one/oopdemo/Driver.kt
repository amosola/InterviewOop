package com.one0one.oopdemo

import android.util.Log

class Driver(name: String) {
    var driverName = ""
    init {
        driverName = name
    }
    fun ShowDetails(){
        Log.i("MYTAG", "Driver name is $driverName")
    }
}