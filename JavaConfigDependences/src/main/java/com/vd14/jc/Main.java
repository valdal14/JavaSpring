package com.vd14.jc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanA beanA = context.getBean("beanA",  BeanA.class);
        beanA.printMessage("Java Configuration");
    }
}
