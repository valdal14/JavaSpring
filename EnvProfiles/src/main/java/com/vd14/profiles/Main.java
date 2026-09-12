package com.vd14.profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        BeanA beanA = context.getBean("beanDeve",  BeanA.class);
        beanA.getStage();
    }
}
