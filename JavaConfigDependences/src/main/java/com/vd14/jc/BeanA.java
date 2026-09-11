package com.vd14.jc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private final BeanB beanB;

    @Autowired
    public BeanA(BeanB beanB) {
        this.beanB = beanB;
    }

    public void printMessage(String message){
        beanB.getBeanC().setMessage(message);
        String print = beanB.getBeanC().getMessage();
        System.out.println(print);
    }
}
