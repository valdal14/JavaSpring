package com.vd14.compscanning;

import lombok.Getter;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
public class BeanA {
    private BeanNameAware beanNameAware;

    @Autowired
    @BeanQualifier
    public void setBeanNameAware(BeanNameAware beanNameAware) {
        this.beanNameAware = beanNameAware;
    }
}
