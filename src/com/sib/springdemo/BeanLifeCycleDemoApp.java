package com.sib.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 8/17/2017.
 */
public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retreive the bean from the spring container
        ICoach theCoach = context.getBean("myCoach", ICoach.class);

        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
