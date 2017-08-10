package com.sib.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by C_v on 8/2/2017.
 */
public class HelloSpringApp {
    public static void main(String[] args) {
        // Load the spring configuration file (Create a Spring Container)
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retreive bean from spring container
        ICoach theCoach = context.getBean("myCoach", ICoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // let's call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
