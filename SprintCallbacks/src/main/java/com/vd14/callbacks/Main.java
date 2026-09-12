package com.vd14.callbacks;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanA beanA = context.getBean("beanA", BeanA.class);
        System.out.println(beanA.getBeanB().getMessage());
        context.close();
    }
}
