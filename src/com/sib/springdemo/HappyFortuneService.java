package com.sib.springdemo;

/**
 * Created by C_v on 8/3/2017.
 */
public class HappyFortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
