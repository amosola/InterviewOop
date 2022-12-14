package com.one0one.oopdemo

import android.util.Log

class MyCar: Car(), SpeedController {
    override fun decelerate() {
        TODO("Not yet implemented")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }
    val car = Car()
    fun callCar(){
        car.displayInfo()
        Log.i("MYTAG", "the id is ${brandId}")
    }

}