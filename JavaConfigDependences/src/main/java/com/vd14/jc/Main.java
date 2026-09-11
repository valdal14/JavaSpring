package com.vd14.jc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        BeanA beanA = context.getBean("beanA",  BeanA.class);
        beanA.printMessage("Java Configuration");
    }
}
