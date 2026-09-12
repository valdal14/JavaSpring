package com.vd14.propplaceholderconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanA  beanA = context.getBean("beanA", BeanA.class);
        System.out.println(beanA.getId());
        System.out.println(beanA.getName());
        System.out.println(beanA.getEmail());
    }
}
