package com.vd14.springbean;

public class CustomFactory {

    private CustomFactory() {
        System.out.println("Instance of CustomFactory");
    }

    private BeanB getBeanBInstance() {
        System.out.println("getBeanBInstance");
        return new BeanB();
    }
}
