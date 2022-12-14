package com.one0one.oopdemo;

public interface SpeedController {
     void decelerate();

     void accelerate() ;

    default String getBrandId(){
        return "KA12345";
    }

}

