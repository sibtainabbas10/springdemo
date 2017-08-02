package com.sib.springdemo;

/**
 * Created by C_v on 8/2/2017.
 */
public class MyApp {
    public static void main(String[] args) {
        // create object
        ICoach theCoach = new TrackCoach();
        // Use object
        System.out.println(theCoach.getDailyWorkout());
    }
}
