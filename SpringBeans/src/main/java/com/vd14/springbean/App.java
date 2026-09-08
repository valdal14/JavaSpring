package com.vd14.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BeanA beanA = context.getBean("beanA", BeanA.class);
        beanA.call();

        BeanC beanC = context.getBean("beanC", BeanC.class);
        beanC.getBeanB().call();

        BeanCalendar beanCalendar = context.getBean("beanCalendar", BeanCalendar.class);
        System.out.println(beanCalendar.getYear());

        BeanB newBeanB = context.getBean("beanB", BeanB.class);

        System.out.println("--- Application Context Aware ---");
        Singleton singleton = context.getBean("singleton", Singleton.class);
        Prototype prototype1 = singleton.createPrototype();
        Prototype prototype2 = singleton.createPrototype();

        System.out.println((prototype1 == prototype2) ? "Same Instance" : "Different Instance");

        System.out.println("--- Method Injection ---");
        SingletonWithMethodInjection smi = context.getBean("smi", SingletonWithMethodInjection.class);
        Prototype prototype3 = smi.createPrototype();
        Prototype prototype4 = smi.createPrototype();

        System.out.println((prototype3 == prototype4) ? "Same Instance" : "Different Instance");

        // Injecting Collections
        CollectionBean collectionBean = context.getBean("collectionBean", CollectionBean.class);
        System.out.println("Printing Lists");

        for (CustomPojo pojos : collectionBean.getPojos())
            System.out.println(pojos);

        for (String token : collectionBean.getList())
            System.out.println(token);

        for (String token : collectionBean.getSet())
            System.out.println(token);

        for (String token : collectionBean.getMap().values())
            System.out.println(token);

        for (Object key : collectionBean.getProperties().keySet())
            System.out.println(collectionBean.getProperties().get(key));

        // Auto-Wiring with XML
        BeanD beanD = context.getBean("beanD", BeanD.class);
        beanD.execute();

        BeanD beanD2 = context.getBean("beanD2", BeanD.class);

        // Auto-Wire BeanE Dependency of type CallableBean
        BeanE beanE = context.getBean("beanE", BeanE.class);
        beanE.execute();
    }
}
