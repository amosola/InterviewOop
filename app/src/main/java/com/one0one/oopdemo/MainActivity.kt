package com.one0one.oopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  driver = Driver("amos")
        driver.ShowDetails()
        val myCar = MyCar()
        myCar.callCar()
    }
}