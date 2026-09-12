package com.vd14.profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanA beanA = context.getBean("beanA", BeanA.class);
        beanA.getStage();

        String[] activeProfiles = context.getEnvironment().getActiveProfiles();
        System.out.println("Active Profiles: " + Arrays.toString(activeProfiles));
    }
}
