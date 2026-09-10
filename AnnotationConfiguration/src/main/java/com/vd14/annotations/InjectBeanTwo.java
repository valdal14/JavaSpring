package com.vd14.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("second")
public class InjectBeanTwo implements Benable{
    @Autowired
    private BeanD beanD;

    @Override
    public void execute() {
        System.out.println("InjectBeanTwo execute");
    }

    public BeanD getBeanD() {
        return beanD;
    }

    public void setBeanD(BeanD beanD) {
        System.out.println("setBeanD called");
        this.beanD = beanD;
    }
}
