package com.vd14.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BeanA beanA = context.getBean("beanA",  BeanA.class);
        System.out.println("BeanA: " + beanA.getApiEndpoint());

        // New Beans
        BeanB beanB = context.getBean("beanB",  BeanB.class);
        beanB.execBeanFirst();
        beanB.execBeanSecond();

        // Bean Array Example
        BeanE beanE = context.getBean("beanE",  BeanE.class);
        for (BeanF bean : beanE.getBeanFS()) {
            System.out.println(bean.getId());
        }

        System.out.println("---------------");

        // Collections auto-wire
        for (BeanF bean : beanE.getBeanFList()) {
            System.out.println(bean.getId());
        }

        System.out.println("---------------");

        // Map auto-wire
        for (Map.Entry<String, BeanF> entry : beanE.getBeanFMap().entrySet()) {
            // get the key
            System.out.println(entry.getKey());
            // get the instance
            System.out.println(entry.getValue());
            // from the instance get the ID
            System.out.println(entry.getValue().getId());
        }

        System.out.println("---------------");

        // Inject the Application Context
        BeanContext beanContext = context.getBean(BeanContext.class);
        beanContext.checkContext();

    }
}
