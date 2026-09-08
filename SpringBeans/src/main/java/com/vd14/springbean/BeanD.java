package com.vd14.springbean;

public class BeanD {
    private BeanA beanA;

    public void setBeanA(BeanA beanA) {
        System.out.println("Injecting BeanA using Setter");
        this.beanA = beanA;
    }

    public void execute() {
        System.out.println("Executing BeanD...");
        beanA.call();
    }
}
