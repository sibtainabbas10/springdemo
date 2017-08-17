package com.sib.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 8/17/2017.
 */
public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retreive the bean from the spring container
        ICoach theCoach = context.getBean("myCoach", ICoach.class);

        ICoach alphaCoach = context.getBean("myCoach", ICoach.class);

        // check if they are the same
        boolean result = (theCoach == alphaCoach);

        // print out the results
        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        // close the context
        context.close();
    }
}
