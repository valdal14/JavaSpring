package com.vd14.springbean;

public class BeanB implements CallableBean {
    @Override
    public void call() {
        System.out.println("BeanB call method called from BeanA...");
    }
}
