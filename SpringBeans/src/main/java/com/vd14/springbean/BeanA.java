package com.vd14.springbean;

import org.springframework.beans.factory.BeanNameAware;

public class BeanA implements BeanNameAware {
    private BeanB beanB;
    private String beanName;

    public BeanA(BeanB beanB) {
        this.beanB = beanB;
    }

    public BeanA(String name) {
        System.out.println("BeanA String Constructor");
        System.out.println(name);
    }

    public BeanA(int age) {
        System.out.println("BeanA int Constructor");
        System.out.println(age);
    }

    public BeanA(String name, int age) {
        System.out.println("BeanA 2 Args Constructor");
        System.out.println(name);
        System.out.println(age);
    }

    // using the interface type to call the call method
    public void call() {
        beanB.call();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanA Bean Name Set: " + name);
        this.beanName = name;
    }

    public String getBeanName() {
        return beanName;
    }
}
