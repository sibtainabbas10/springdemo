package com.sib.springdemo;

import java.util.Random;

/**
 * Created by HP on 8/17/2017.
 */
public class RandomFortuneService implements IFortuneService {
    private String[] fortunesArray = {"Bad luck :(", "Nothing special", "Good day for you!"};
    private Random rand = new Random();
    @Override
    public String getFortune() {

        return fortunesArray[rand.nextInt(fortunesArray.length)];
    }
}
