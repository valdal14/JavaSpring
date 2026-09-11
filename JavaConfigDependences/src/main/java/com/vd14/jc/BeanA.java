package com.vd14.jc;

public class BeanA {
    private final BeanB beanB;

    public BeanA(BeanB beanB) {
        this.beanB = beanB;
    }

    public void printMessage(String message){
        beanB.getBeanC().setMessage(message);
        String print = beanB.getBeanC().getMessage();
        System.out.println(print);
    }
}
