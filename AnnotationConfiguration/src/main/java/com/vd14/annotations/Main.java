package com.vd14.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BeanA beanA = context.getBean("beanA",  BeanA.class);
        System.out.println("BeanA: " + beanA.getApiEndpoint());
    }
}
