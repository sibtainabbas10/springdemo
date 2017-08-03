package com.sib.springdemo;

/**
 * Created by C_v on 8/2/2017.
 */
public class BaseballCoach implements ICoach {
    // define a private field for the dependency
    private IFortuneService fortuneService;

    public BaseballCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }

}
