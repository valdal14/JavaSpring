package com.vd14.qualifiers;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Getter
public class BeanA {
    private BeanB beanB;

    @Autowired
    @Qualifier(value = "beanB2Qualifier")
    public void setBeanB(BeanB beanB) {
        System.out.println("setBeanB: " + beanB);
        this.beanB = beanB;
    }
}
