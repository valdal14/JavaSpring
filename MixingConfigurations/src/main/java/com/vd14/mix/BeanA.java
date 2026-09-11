package com.vd14.mix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private final BeanB beanB;

    @Autowired
    public BeanA(BeanB beanB) {
        this.beanB = beanB;
    }

    public void printMessage(String message) {
        this.beanB.getBeanC().setMessage(message);
        String msn = this.beanB.getBeanC().getMessage();
        System.out.println(msn);
    }
}
