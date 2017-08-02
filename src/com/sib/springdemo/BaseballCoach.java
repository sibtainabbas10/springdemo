package com.sib.springdemo;

/**
 * Created by C_v on 8/2/2017.
 */
public class BaseballCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

}
