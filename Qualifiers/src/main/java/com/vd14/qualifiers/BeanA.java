package com.vd14.qualifiers;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
public class BeanA {
    private BeanB beanB;

    @Autowired
    @CustomBeanAnnotation
    public void setBeanB(BeanB beanB) {
        System.out.println("setBeanB: " + beanB);
        this.beanB = beanB;
    }
}
