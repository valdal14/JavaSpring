package com.vd14.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("first")
public class InjectBeanOne implements Benable{
    private BeanC beanC;

    @Override
    public void execute() {
        System.out.println("InjectBeanOne execute");
    }

    public BeanC getBeanC() {
        return beanC;
    }

    @Autowired
    public void setBeanC(BeanC beanC) {
        System.out.println("setBeanC called");
        this.beanC = beanC;
    }
}
