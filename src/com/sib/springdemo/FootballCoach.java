package com.sib.springdemo;

/**
 * Created by C_v on 8/3/2017.
 */
public class FootballCoach implements ICoach {
    private IFortuneService myFortuneService;

    public FootballCoach(IFortuneService myFortuneService) {
        this.myFortuneService = myFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Passing practice for 20 minutes";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
