package com.sib.springdemo;

import javax.sound.midi.Track;

/**
 * Created by C_v on 8/2/2017.
 */
public class TrackCoach implements ICoach {
    private IFortuneService fortuneService;

    public TrackCoach() {}

    public TrackCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it! - " + fortuneService.getFortune();
    }
}
